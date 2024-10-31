package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.binding.MapperMethod.ParamMap;
import org.apache.ibatis.mapping.ResultMap;

@Mapper
public interface LoginMapper {
    List<ResultMap> list(ParamMap paramMap);
}
