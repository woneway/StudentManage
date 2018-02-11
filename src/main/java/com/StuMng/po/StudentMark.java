package com.StuMng.po;

public class StudentMark{
	
	private String markid;
	
	private String stuname;
	
	private String coursename;
	
    private Double basescore;

    private Double testscore;

    private Double finalscore;

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

	public Double getBasescore() {
		return basescore;
	}

	public void setBasescore(Double basescore) {
		this.basescore = basescore;
	}

	public Double getTestscore() {
		return testscore;
	}

	public void setTestscore(Double testscore) {
		this.testscore = testscore;
	}

	public Double getFinalscore() {
		return finalscore;
	}

	public void setFinalscore(Double finalscore) {
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