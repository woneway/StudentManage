package com.StuMng.service;

import java.util.List;
import java.util.Map;

import com.StuMng.po.StuMarkInfo;
import com.StuMng.po.Stu_Id_Name;
import com.StuMng.po.StudentMark;

public interface IStuMarkInfoService {
	public List<StudentMark> showStuMark();
	public Integer delStuMark(String markid);
	public String MaxStuMarkId();
	public List<Stu_Id_Name> StuIdName();
	public List<StudentMark> CourseList();
	public Integer addStuMark(StuMarkInfo stuMarkInfo);
	public Integer getTotalScore(String stuid);
	public Double getFinalScore(String markid);
}
