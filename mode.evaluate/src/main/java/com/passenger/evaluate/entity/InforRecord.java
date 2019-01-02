package com.passenger.evaluate.entity;

public class InforRecord {
	private String clerkfrom;
	private String clerkto;
	private String clerktoname;
	private String subjectid;
	private String answerid;
	private Integer modifynum;
	private Float  score;
	
	public Float getScore() {
		return score;
	}
	public void setScore(Float score) {
		this.score = score;
	}
	public Integer getModifynum() {
		return modifynum;
	}
	public void setModifynum(Integer modifynum) {
		this.modifynum = modifynum;
	}
	public String getClerkfrom() {
		return clerkfrom;
	}
	public void setClerkfrom(String clerkfrom) {
		this.clerkfrom = clerkfrom;
	}
	public String getClerkto() {
		return clerkto;
	}
	public void setClerkto(String clerkto) {
		this.clerkto = clerkto;
	}
	public String getClerktoname() {
		return clerktoname;
	}
	public void setClerktoname(String clerktoname) {
		this.clerktoname = clerktoname;
	}
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
	
}
