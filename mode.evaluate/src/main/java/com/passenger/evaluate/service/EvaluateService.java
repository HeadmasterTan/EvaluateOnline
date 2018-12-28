package com.passenger.evaluate.service;

import java.util.List;

import com.passenger.evaluate.entity.Answer;
import com.passenger.evaluate.entity.DepRe;
import com.passenger.evaluate.entity.InforRecord;
import com.passenger.evaluate.entity.LoginInfo;
import com.passenger.evaluate.entity.ScoSub;

public interface EvaluateService {
	//1.Login
	LoginInfo login(String acctno,String pwd);
	
	//2.Get the number of department
	int getnumdpart(String depid);
	
	//3.Get the identify of department
	List<DepRe> getidentdpart(String depid);
	
	//4.Get the subject
	List<ScoSub> getsubject();
	
	//5.Get the answer of subject by id
	List<Answer> getanswer(String subjuectid);
	
	//6.Post the answer of subject
	boolean postinformRecorde(InforRecord inforRecorde);
	
	//7.modify the answer of subject
	boolean modifyinformRecorde(InforRecord inforRecorde);
	
	//8.look out the answer of subject
	List<InforRecord> lookinformRecorde(String clerkfrom ,String clerkto);
}
