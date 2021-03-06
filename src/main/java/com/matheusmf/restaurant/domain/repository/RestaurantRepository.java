package com.matheusmf.restaurant.domain.repository;

import com.matheusmf.restaurant.domain.model.Restaurant;

import java.util.List;

public interface RestaurantRepository {

    void register(Restaurant restaurant);

    List<Restaurant> findByName(String name);

    List<Restaurant> listAll();

}
