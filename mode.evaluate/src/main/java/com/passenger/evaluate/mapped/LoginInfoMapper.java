package com.passenger.evaluate.mapped;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.passenger.evaluate.entity.LoginInfo;

public interface LoginInfoMapper {
	
	List<LoginInfo> selectByAacctno (@Param("acctno")String acctno,@Param("pwd")String pwd);
	
}
