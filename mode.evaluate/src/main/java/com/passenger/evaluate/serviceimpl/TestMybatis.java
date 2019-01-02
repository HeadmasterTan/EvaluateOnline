package com.passenger.evaluate.serviceimpl;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.passenger.evaluate.entity.Answer;
import com.passenger.evaluate.entity.ScoSub;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations={"classpath:spring-mvc.xml","classpath:spring-mybatis.xml"}) 
public class TestMybatis {
	
	@Autowired
	private EvaluateServiceImpl evaluateServiceImpl;
	//测试功能1
	/*@Test 
	public void TestLoginInfoMapper()
	{
		LoginInfo loginInfo=evaluateServiceImpl.login("50", "60");
		if(loginInfo==null)
		{
			System.out.println("NULL");
		}
		else
		{
			System.out.println("OK");
		}
	}*/
	/*
	//测试功能2
	@Test
	public void Testgetnumdpart()
	{
		evaluateServiceImpl.getnumdpart("01");
	}
	*/
	//测试功能3
	/*
	@Test
	public void Testgetidentdpart()
	{
		evaluateServiceImpl.getidentdpart("01");
	}
	*/
	//测试功能4
	/*
	@Test
	public void Testgetsubject()
	{
		List<ScoSub> scoSubList=evaluateServiceImpl.getsubject();
	}
	*/
	//测试功能5
	/*
	@Test 
	public void Testgetanswer()
	{
		List<Answer> answerList=evaluateServiceImpl.getanswer("01");
	}
	*/
	//测试功能6
	/*
	@Test
	public void TestpostinformRecorde()
	{
		InforRecord inforRecorde=new InforRecord();
		inforRecorde.setClerkfrom("1");
		inforRecorde.setClerkto("2");
		inforRecorde.setClerktoname("hjj");
		inforRecorde.setSubjectid("3");
		inforRecorde.setAnswerid("爱过");
		if(evaluateServiceImpl.postinformRecorde(inforRecorde)==false)
		{
			System.out.println("失败");
		}
		else
		{
			System.out.println("成功");
		}
		
	}*/
	/*
	//测试功能7
	@Test
	public void TestmodifyinformRecorde()
	{
		InforRecord inforRecorde=new InforRecord();
		inforRecorde.setClerkfrom("1");
		inforRecorde.setClerkto("2");
		inforRecorde.setSubjectid("3");
		inforRecorde.setAnswerid("爱");
		evaluateServiceImpl.modifyinformRecorde(inforRecorde);
	}*/
	//测试功能8
	/*
	@Test
	public void TestlookinformRecorde()
	{
		List<InforRecord> InforRecordList=evaluateServiceImpl.lookinformRecorde("1","2");
		System.out.println(InforRecordList.isEmpty());
	}*/
}
