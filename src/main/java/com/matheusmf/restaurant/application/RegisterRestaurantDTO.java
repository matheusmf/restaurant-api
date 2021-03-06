package com.matheusmf.restaurant.application;

import com.matheusmf.restaurant.domain.model.DeliveryApp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRestaurantDTO {

    private String name;
    private String uf;
    private String city;
    private String district;
    private String address;
    private String coordinates;
    private String cnpj;
    private DeliveryApp deliveryApp;
}
