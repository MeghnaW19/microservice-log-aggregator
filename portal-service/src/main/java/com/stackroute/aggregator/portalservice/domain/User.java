package com.stackroute.aggregator.portalservice.domain;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Customer customer;
    private Address address;
}
