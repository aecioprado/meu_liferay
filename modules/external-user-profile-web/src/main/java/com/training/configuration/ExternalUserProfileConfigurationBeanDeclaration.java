package com.training.configuration;


import com.liferay.portal.kernel.settings.definition.ConfigurationBeanDeclaration;
import org.osgi.service.component.annotations.Component;

@Component(service = ConfigurationBeanDeclaration.class)
public class ExternalUserProfileConfigurationBeanDeclaration implements ConfigurationBeanDeclaration {

    @Override
    public Class<?> getConfigurationBeanClass() {
        return ExternalUserProfileConfiguration.class;
    }

}