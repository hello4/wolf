package com.winter.wild.wolf.repository;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import com.winter.wild.wolf.vo.City;

@Mapper
public interface CityMapper {
    City selectCityById(Long id);
    List<City> selectAllCity();
    void insertCity(City city);
}