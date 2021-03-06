package com.matheusmf.restaurant.application;

import com.matheusmf.restaurant.domain.model.DeliveryApp;
import com.matheusmf.restaurant.domain.model.Restaurant;
import com.matheusmf.restaurant.infrastructure.restaurant.repository.MemoryRestaurantRepository;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegisterRestaurantUserCaseTest {

    @Test
    public void restaurantMustBePersisted() {
        MemoryRestaurantRepository repository = new MemoryRestaurantRepository();
        RegisterRestaurantUseCase useCase = new RegisterRestaurantUseCase(repository);

        RegisterRestaurantDTO data = new RegisterRestaurantDTO(
                "Starbucks",
                "SP", "São Paulo", "Pinheiros", "Av. Rebouças, 3970 - 102", "-23.572623224552416, -46.6964022773932",
                "43977866000160", new DeliveryApp(false, true, false, false));
        useCase.execute(data);

        List<Restaurant> restaurants = repository.findByName("Starbucks");
        restaurants.stream().forEach(restaurant -> {
            assertEquals("Starbucks", restaurant.getName());
        });
    }
}
