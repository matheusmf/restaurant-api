package com.matheusmf.restaurant.domain.model;

import com.matheusmf.restaurant.domain.enums.SocialMediaType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class SocialMediaTest {

    @Test
    void cannotCreateWithoutType() {
        assertThrows(IllegalArgumentException.class,
                () -> new SocialMedia(null, "http://www.instagram.com"));
    }

    @Test
    void cannotCreateWithoutLink() {
        assertThrows(IllegalArgumentException.class,
                () -> new SocialMedia(SocialMediaType.INSTAGRAM, ""));
    }

    @Test
    void cannotCreateWithLinkInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> new SocialMedia(SocialMediaType.OTHER, "instagram.com"));
    }
}
