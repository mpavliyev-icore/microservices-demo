package com.micorservices.gateway;

import com.micorservices.gateway.config.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ConfigController {
    private final Configuration configuration;

    public ConfigController(Configuration configuration) {
        this.configuration = configuration;
    }

    @GetMapping("/configFields")
    public List<Double> getConfigField() {
        return Arrays.asList(this.configuration.getMaxBalance(), this.configuration.getMinBalance());
    }
}
