package com.matheusmf.restaurant.domain.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class AddressTest {

    @Test
    void cannotCreateWithoutUf() {
        assertThrows(IllegalArgumentException.class,
                () -> new Address("", "Salvador", "Barra", "Avenida Atlântica, 100", "-23.532717187548702, -46.68096527602427"));
    }

    @Test
    void cannotCreateWithoutCity() {
        assertThrows(IllegalArgumentException.class,
                () -> new Address("Bahia", "", "Barra", "Avenida Atlântica, 100", "-23.532717187548702, -46.68096527602427"));
    }

    @Test
    void cannotCreateWithoutDistrict() {
        assertThrows(IllegalArgumentException.class,
                () -> new Address("Bahia", "Salvador", "", "Avenida Atlântica, 100", "-23.532717187548702, -46.68096527602427"));
    }

    @Test
    void cannotCreateWithoutAddress() {
        assertThrows(IllegalArgumentException.class,
                () -> new Address("Bahia", "Salvador", "Barra", "", "-23.532717187548702, -46.68096527602427"));
    }

    @Test
    void cannotCreateWithoutCoordiantes() {
        assertThrows(IllegalArgumentException.class,
                () -> new Address("Bahia", "Salvador", "Barra", "Avenida Atlântica, 100", ""));
    }
}
