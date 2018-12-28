package com.passenger.evaluate.mapped;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.passenger.evaluate.entity.Answer;

public interface AnswerMapper {
	
	List<Answer>selectBySubjectId(String subjectid);

}
