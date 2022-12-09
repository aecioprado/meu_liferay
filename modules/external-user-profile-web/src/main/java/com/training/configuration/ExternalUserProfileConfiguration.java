package com.training.configuration;

import aQute.bnd.annotation.metatype.Meta;

import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;
import com.training.constants.ExternalUserProfilePortletKeys;

@ExtendedObjectClassDefinition(
        category = "external-user-profile", scope = ExtendedObjectClassDefinition.Scope.COMPANY
)
@Meta.OCD(
        id = ExternalUserProfilePortletKeys.P_ID,
        localization = "content/Language",
        name = "external-user-profile-configuration-name"
)
public interface ExternalUserProfileConfiguration {

    @Meta.AD(
            description = "external-user-profile-description-help",
            name = "external-user-profile-description-list",
            optionLabels = {"Terry", "Sheldon", "Terrill", "Miles", "Mavis"},
            optionValues = {"1", "2", "3", "4", "5"},
            required = false)
    public String defaultUserProfile();

}


