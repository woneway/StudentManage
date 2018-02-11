package com.StuMng.po;

import java.util.Date;

public class StuMarkInfo {
    private String markid;

    private String stuid;

    private String coursename;

    private Double basescore;

    private Double testscore;

    private Double finalscore;

    private Date adddate;

    private String note;

    public String getMarkid() {
        return markid;
    }

    public void setMarkid(String markid) {
        this.markid = markid == null ? null : markid.trim();
    }

    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid == null ? null : stuid.trim();
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
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

    public Date getAdddate() {
        return adddate;
    }

    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}