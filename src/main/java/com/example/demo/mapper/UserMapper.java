package com.example.demo.mapper;

import java.util.List;

import com.example.demo.model.UserVO;

public interface UserMapper {
	public List<UserVO> selectUserList() throws Exception;
}
