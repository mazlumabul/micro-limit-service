package com.mazlumabul.microservices.limitservice.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties("limits-service")
@Getter
@Setter
@RequiredArgsConstructor
public class Configuration {
    private int minimum;
    private int maximum;
}
