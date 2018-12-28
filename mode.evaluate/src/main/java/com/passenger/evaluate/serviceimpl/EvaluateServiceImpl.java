package com.passenger.evaluate.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.passenger.evaluate.entity.Answer;
import com.passenger.evaluate.entity.DepRe;
import com.passenger.evaluate.entity.InforRecord;
import com.passenger.evaluate.entity.LoginInfo;
import com.passenger.evaluate.entity.ScoSub;
import com.passenger.evaluate.mapped.AnswerMapper;
import com.passenger.evaluate.mapped.DepReMapper;
import com.passenger.evaluate.mapped.InforRecordMapper;
import com.passenger.evaluate.mapped.LoginInfoMapper;
import com.passenger.evaluate.mapped.ScoSubMapper;
import com.passenger.evaluate.service.EvaluateService;

@Service
public class EvaluateServiceImpl implements EvaluateService{
	
	@Autowired
	private LoginInfoMapper loginInfoMapper;
	
	@Autowired
	private DepReMapper depReMapper;
	
	@Autowired
	private ScoSubMapper scoSubMapper;
	
	@Autowired
	private AnswerMapper answerMapper;
	
	@Autowired
	private InforRecordMapper inforRecordMapper;
	
	
	public LoginInfo login(String acctno, String pwd) {

		List<LoginInfo> loginInfoList=loginInfoMapper.selectByAacctno(acctno,pwd);
		if(loginInfoList.isEmpty())
		{
			return null;
		}
		else
		{
			return loginInfoList.get(0);
		}
	}

	public int getnumdpart(String depid) {
		// TODO Auto-generated method stub	
		return depReMapper.countByDepid(depid);
	}

	public List<DepRe> getidentdpart(String depid) {
		// TODO Auto-generated method stub
		return depReMapper.selectByDepid(depid);
	}

	public List<ScoSub> getsubject() {
		// TODO Auto-generated method stub
		return scoSubMapper.selectAboutAll();
	}

	public List<Answer> getanswer(String subjuectid) {
		// TODO Auto-generated method stub
		return answerMapper.selectBySubjectId(subjuectid);
	}

	public boolean postinformRecorde(InforRecord inforRecorde) {
		// TODO Auto-generated method stub
		int sign=inforRecordMapper.insertByKeyPrmary(inforRecorde);
		if(sign==0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	public boolean modifyinformRecorde(InforRecord inforRecorde) {
		// TODO Auto-generated method stub
		 if(inforRecordMapper.updateByAnswerid(inforRecorde)!=0)
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
			 
	}

	public List<InforRecord> lookinformRecorde(String clerkfrom ,String clerkto) {
		// TODO Auto-generated method stub
		return inforRecordMapper.selectByClerkFromto(clerkfrom,clerkto);
	}

}
