package com.training.portlet;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.liferay.portal.kernel.module.configuration.ConfigurationException;
import com.liferay.portal.kernel.module.configuration.ConfigurationProvider;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.Portal;
import com.training.configuration.ExternalUserProfileConfiguration;
import com.training.constants.ExternalUserProfilePortletKeys;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author me
 */
@Component(
        immediate = true,
        property = {
                "com.liferay.portlet.display-category=category.sample",
                "com.liferay.portlet.header-portlet-css=/css/main.css",
                "com.liferay.portlet.instanceable=true",
                "javax.portlet.display-name=ExternalUserProfile",
                "javax.portlet.init-param.template-path=/",
                "javax.portlet.init-param.view-template=/view.jsp",
                "javax.portlet.name=" + ExternalUserProfilePortletKeys.EXTERNALUSERPROFILE,
                "javax.portlet.resource-bundle=content.Language",
                "javax.portlet.security-role-ref=power-user,user"},
        service = Portlet.class)

public class ExternalUserProfilePortlet extends MVCPortlet {

    @Override
    public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {


        try {
            renderRequest.setAttribute(ExternalUserProfileConfiguration.class.getName(),
                    _configurationProvider.getCompanyConfiguration(ExternalUserProfileConfiguration.class,
                            _portal.getCompanyId(renderRequest)));

            String userId = _configurationProvider.getCompanyConfiguration(ExternalUserProfileConfiguration.class,
                    _portal.getCompanyId(renderRequest)).userProfileId();

            JsonNode apiResponse = getJsonResponse(userId);

            renderRequest.setAttribute("userId", apiResponse.get("id").asText());
            renderRequest.setAttribute("firstName", apiResponse.get("firstName").asText());
            renderRequest.setAttribute("imageUrl", apiResponse.get("image").asText());


        } catch (ConfigurationException configurationException) {
            throw new PortletException(configurationException);
        }


        super.render(renderRequest, renderResponse);
    }

    @Reference
    private ConfigurationProvider _configurationProvider;

    @Reference
    private Portal _portal;

    private JsonNode getJsonResponse(String userId) throws IOException {
        final ObjectMapper objectMapper = new ObjectMapper();

        // Create a neat value object to hold the URL
        URL url = new URL("https://dummyjson.com/users/"+userId);

        // Open a connection(?) on the URL(??) and cast the response(???)
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // Now it's "open", we can set the request method, headers etc.
        connection.setRequestProperty("accept", "application/json");

        // This line makes the request
        InputStream responseStream = connection.getInputStream();

        // Manually converting the response body InputStream to APOD using Jackson
        return objectMapper.readTree(responseStream);


    }
}