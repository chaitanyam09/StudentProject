package com.student.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class StudentDetails {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int stdId;
	@Column
	private String stdName;
	@Column
	private Date stdDob;
	@Column
	private String stdStandard;
	@Column
	private float stdGpa;
	@Column
	private int stdPhno;
	@Column
	private String stdEmailid;
	
	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public Date getStdDob() {
		return stdDob;
	}

	public void setStdDob(Date stdDob) {
		this.stdDob = stdDob;
	}

	public String getStdStandard() {
		return stdStandard;
	}

	public void setStdStandard(String stdStandard) {
		this.stdStandard = stdStandard;
	}

	public float getStdGpa() {
		return stdGpa;
	}

	public void setStdGpa(float stdGpa) {
		this.stdGpa = stdGpa;
	}

	public int getStdPhno() {
		return stdPhno;
	}

	public void setStdPhno(int stdPhno) {
		this.stdPhno = stdPhno;
	}

	public String getStdEmailid() {
		return stdEmailid;
	}

	public void setStdEmailid(String stdEmailid) {
		this.stdEmailid = stdEmailid;
	}

}
