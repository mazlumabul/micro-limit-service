package com.mazlumabul.microservices.limitservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class Limit {
    private int minimum;
    private int maximum;


}
