package com.passenger.evaluate.mapped;

import java.util.List;

import com.passenger.evaluate.entity.DepRe;

public interface DepReMapper {

	List<DepRe> selectByDepid(String depid);
	
	List<DepRe> selectByClerkid(String clerkid);
	
	int countByDepid(String depid);
}
