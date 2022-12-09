<%@ include file="/init.jsp" %>

<!-- Import Configuration -->
<%@ page import="com.training.configuration.ExternalUserProfileConfiguration" %>

<%
	ExternalUserProfileConfiguration configuration = (ExternalUserProfileConfiguration)request.getAttribute(ExternalUserProfileConfiguration.class.getName());
	System.out.println("log: "+ configuration.userProfileId().toString());
%>

<p>
	<b><liferay-ui:message key="externaluserprofile.caption"/></b>

	user-id: <%= configuration.userProfileId() %>
</p>