package com.example.service;

import java.util.List;

import org.apache.ibatis.binding.MapperMethod.ParamMap;
import org.apache.ibatis.mapping.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.LoginMapper;

@Service
public class LoginService {
	@Autowired
	LoginMapper loginMapper;
 
	public List<ResultMap> getList(ParamMap paramMap) {
		List<ResultMap> list =	loginMapper.list(paramMap);
		return list;
	}
}
