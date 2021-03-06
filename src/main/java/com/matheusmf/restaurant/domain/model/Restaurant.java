package com.matheusmf.restaurant.domain.model;

import com.matheusmf.restaurant.domain.enums.SocialMediaType;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    @Getter
    private String name;
    private Address address;
    @Setter
    private String cnpj;
    @Setter
    private DeliveryApp deliveryApp;
    private List<SocialMedia> socialMedias = new ArrayList<>();

    public Restaurant(String name, Address address) {
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("Name required!");

        if (address == null)
            throw new IllegalArgumentException("Address required!");

        this.name = name;
        this.address = address;
    }

    public void addSocialMedia(SocialMediaType type, String link) {
        this.socialMedias.add(new SocialMedia(type, link));
    }

}
