package com.matheusmf.restaurant.infrastructure.restaurant.repository;

import com.matheusmf.restaurant.domain.model.Restaurant;
import com.matheusmf.restaurant.domain.repository.RestaurantRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MemoryRestaurantRepository implements RestaurantRepository {

    private List<Restaurant> registeredRestaurants = new ArrayList<>();

    @Override
    public void register(Restaurant restaurant) {
        registeredRestaurants.add(restaurant);
    }

    @Override
    public List<Restaurant> findByName(String name) {
        return registeredRestaurants.stream().filter(restaurant -> restaurant.getName().equals(name)).collect(Collectors.toList());
    }

    @Override
    public List<Restaurant> listAll() {
        return registeredRestaurants;
    }
}
