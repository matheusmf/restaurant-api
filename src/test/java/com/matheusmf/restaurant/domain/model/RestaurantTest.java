package com.matheusmf.restaurant.domain.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class RestaurantTest {

    @Test
    void cannotCreateWithoutName() {
        Address address = new Address("BA", "Salvador", "Barra", "Avenida Atlântica, 100", "-23.532717187548702, -46.68096527602427");
        assertThrows(IllegalArgumentException.class,
                () -> new Restaurant(null, address));
    }

    @Test
    void cannotCreateWithoutAddress() {
        assertThrows(IllegalArgumentException.class,
                () -> new Restaurant("Teste", null));
    }
}
