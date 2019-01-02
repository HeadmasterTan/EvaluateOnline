package com.passenger.evaluate.service;

import java.util.List;

import com.passenger.evaluate.entity.Answer;
import com.passenger.evaluate.entity.DepRe;
import com.passenger.evaluate.entity.InforRecord;
import com.passenger.evaluate.entity.LoginInfo;
import com.passenger.evaluate.entity.ScoSub;

public interface EvaluateService {
	//1.Login：登入
	LoginInfo login(String acctno,String pwd);
	
	//2.Get the number of department：获取部门总人数
	int getnumdpart(String depid);
	
	//3.Get the identify of department：获取部门详细资料
	List<DepRe> getidentdpart(String depid);
	
	//4.Get the subject：获取题目
	List<ScoSub> getsubject();
	
	//5.Get the answer of subject by id：获取问题答案
	List<Answer> getanswer(String subjuectid);
	
	//6.Post the answer of subject：提交问题
	boolean postinformRecorde(InforRecord inforRecorde);
	
	//7.modify the answer of subject：修改问题
	boolean modifyinformRecorde(InforRecord inforRecorde);
	
	//8.look out the answer of subject：查看id 单人
	List<InforRecord> lookinformRecorde(String clerkfrom ,String clerkto);
}
