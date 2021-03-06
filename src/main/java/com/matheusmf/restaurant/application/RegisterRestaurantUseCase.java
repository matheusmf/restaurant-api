package com.matheusmf.restaurant.application;

import com.matheusmf.restaurant.domain.builder.RestaurantBuilder;
import com.matheusmf.restaurant.domain.model.Restaurant;
import com.matheusmf.restaurant.domain.repository.RestaurantRepository;

public class RegisterRestaurantUseCase {

    private final RestaurantRepository restaurantRepository;

    public RegisterRestaurantUseCase(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public void execute(RegisterRestaurantDTO data) {
        Restaurant restaurant = RestaurantBuilder.newBuilder()
                                .withNameAndAddress(data.getName(), data.getUf(), data.getCity(), data.getDistrict(),
                                                    data.getAddress(), data.getCoordinates())
                                .withCnpj(data.getCnpj())
                                .withDeliveryApp(data.getDeliveryApp())
                                .build();
        restaurantRepository.register(restaurant);
    }
}
