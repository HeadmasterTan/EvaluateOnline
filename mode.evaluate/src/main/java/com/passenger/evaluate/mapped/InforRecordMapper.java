package com.passenger.evaluate.mapped;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.passenger.evaluate.entity.InforRecord;

public interface InforRecordMapper {
	
	List<InforRecord>selectByClerkFromto(@Param("clerkfrom")String clerkfrom,@Param("clerkto")String clerkto);
	
	int updateByAnswerid(InforRecord inforRecord);
	
	int insertByKeyPrmary(InforRecord inforRecord);
}
