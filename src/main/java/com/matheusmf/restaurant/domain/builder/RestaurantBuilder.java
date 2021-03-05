package com.matheusmf.restaurant.domain.builder;

import com.matheusmf.restaurant.domain.model.Address;
import com.matheusmf.restaurant.domain.model.DeliveryApp;
import com.matheusmf.restaurant.domain.model.Restaurant;

public class RestaurantBuilder {

    private Restaurant restaurant;

    public static RestaurantBuilder newBuilder() {
        return new RestaurantBuilder();
    }

    public RestaurantBuilder withNameAndAddress(String name, String uf, String city, String district, String address, String coordinates) {
        restaurant = new Restaurant(name, new Address(uf, city, district, address, coordinates));
        return this;
    }

    public RestaurantBuilder withCnpj(String cnpj) {
        restaurant.setCnpj(cnpj);
        return this;
    }

    public RestaurantBuilder withDeliveryApp(boolean ifood, boolean rappi, boolean uberEats, boolean james) {
        restaurant.setDeliveryApp(new DeliveryApp(ifood, rappi, uberEats, james));
        return this;
    }

    public Restaurant build() {
        return restaurant;
    }
}
