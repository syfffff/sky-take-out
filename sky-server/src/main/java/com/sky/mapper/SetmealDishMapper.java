package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Mapper
public  interface SetmealDishMapper {

    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);

}
