package com.StuMng.po;

import java.math.BigDecimal;

public class StudentMark{
	
	private String markid;
	
	private String stuname;
	
	private String coursename;
	
    private BigDecimal basescore;

    private BigDecimal testscore;

    private BigDecimal finalscore;

    private String note;
    
    private String stuid;

	public String getStuname() {
		return stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public BigDecimal getBasescore() {
		return basescore;
	}

	public void setBasescore(BigDecimal basescore) {
		this.basescore = basescore;
	}

	public BigDecimal getTestscore() {
		return testscore;
	}

	public void setTestscore(BigDecimal testscore) {
		this.testscore = testscore;
	}

	public BigDecimal getFinalscore() {
		return finalscore;
	}

	public void setFinalscore(BigDecimal finalscore) {
		this.finalscore = finalscore;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getStuid() {
		return stuid;
	}

	public void setStuid(String stuid) {
		this.stuid = stuid;
	}

	public String getMarkid() {
		return markid;
	}

	public void setMarkid(String markid) {
		this.markid = markid;
	}
    
    
	
}