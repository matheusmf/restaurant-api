package com.matheusmf.restaurant.domain.model;

public class Address {

    private String uf;
    private String city;
    private String district;
    private String address;
    private String coordinates;

    public Address(String uf, String city, String district, String address, String coordinates) {
        if (uf == null || uf.isBlank()
                || city == null || city.isBlank()
                || district == null || district.isBlank()
                || address == null || address.isBlank()
                || coordinates == null || coordinates.isBlank()) {
            throw new IllegalArgumentException("UF, City, District, Address and Coordinates are required!");
        }

        if (!coordinates.contains(","))
            throw new IllegalArgumentException("Coordinates invalid!");

        this.uf = uf;
        this.city = city;
        this.district = district;
        this.address = address;
        this.coordinates = coordinates;
    }
}
