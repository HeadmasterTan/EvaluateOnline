package com.passenger.evaluate.entity;

public class Answer {
	private String subjectid;
	private String answerid;
	private String contentdesc;
	private Float wghvalue;

	public String getSubjectid() {
		return subjectid;
	}
	public void setSubjectid(String subjectid) {
		this.subjectid = subjectid;
	}
	public String getAnswerid() {
		return answerid;
	}
	public void setAnswerid(String answerid) {
		this.answerid = answerid;
	}
	public String getContentdesc() {
		return contentdesc;
	}
	public void setContentdesc(String contendesc) {
		this.contentdesc = contendesc;
	}
	public Float getWghvalue() {
		return wghvalue;
	}
	public void setWghvalue(Float wghvalue) {
		this.wghvalue = wghvalue;
	}
	
}
