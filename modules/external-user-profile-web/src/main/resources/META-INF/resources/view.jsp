<%@ include file="/init.jsp" %>

<!-- Import Configuration -->
<%@ page import="com.training.configuration.ExternalUserProfileConfiguration" %>

<%
	ExternalUserProfileConfiguration configuration = (ExternalUserProfileConfiguration)request.getAttribute(ExternalUserProfileConfiguration.class.getName());

	String userId = (String) request.getAttribute("userId");
	String firstName = (String) request.getAttribute("firstName");
	String imageUrl = (String) request.getAttribute("imageUrl");

%>

<p>
	<b><liferay-ui:message key="externaluserprofile.caption"/></b>
</p>
<p>
	<img src="<%= imageUrl%>"/><br/>
	<b>User ID:</b> <%= userId %><br/>
	<b>FirstName:</b> <%= firstName %>
</p>