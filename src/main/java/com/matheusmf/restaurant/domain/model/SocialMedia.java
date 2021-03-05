package com.matheusmf.restaurant.domain.model;

import com.matheusmf.restaurant.domain.enums.SocialMediaType;
import com.matheusmf.restaurant.utils.Utils;
import lombok.AllArgsConstructor;

public class SocialMedia {

    private SocialMediaType type;
    private String link;

    public SocialMedia(SocialMediaType type, String link) {
        if (type == null || link == null || link.isBlank())
            throw new IllegalArgumentException("Type and Link are required!");

        if (!Utils.urlIsValid(link))
            throw new IllegalArgumentException("Link invalid!");

    }
}
