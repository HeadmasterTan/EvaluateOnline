package com.passenger.evaluate.mapped;

import java.util.List;

import com.passenger.evaluate.entity.LoginInfo;

public interface LoginInfoMapper {
	
	int countByExample(LoginInfo loginInfoExample);
	
	List<LoginInfo>selectByExample(LoginInfo loginInfoExample);
}
