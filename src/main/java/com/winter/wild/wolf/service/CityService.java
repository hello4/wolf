package com.winter.wild.wolf.service;

import com.winter.wild.wolf.repository.CityMapper;
import com.winter.wild.wolf.vo.City;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CityService {
    @Autowired
    CityMapper cityMapper;

    public City getCityById(Long id) {
        return cityMapper.selectCityById(id);
    }

    public List<City> getAllCity() {
        return cityMapper.selectAllCity();
    }

    public void addCity(City city) {
        cityMapper.insertCity(city);
    }
}