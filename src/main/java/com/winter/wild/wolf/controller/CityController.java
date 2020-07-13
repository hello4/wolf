package com.winter.wild.wolf.controller;

import java.util.List;

import com.winter.wild.wolf.service.CityService;
import com.winter.wild.wolf.vo.City;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class CityController {
    
    @Autowired
    private final CityService  service;

    @GetMapping("/city")
    public List<City> city() {
        List<City> cities = service.getAllCity();
        return cities;
    }
}