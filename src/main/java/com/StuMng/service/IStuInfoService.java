package com.StuMng.service;

import java.util.List;
import java.util.Map;

import com.StuMng.po.StudentInfo;

public interface IStuInfoService {
	public List<StudentInfo> showStuInfo();
	public Integer delStuInfo(String stuid);
	public Integer addStuInfo(StudentInfo studentInfo);
	public String MaxStuInfoId();
	public Integer updateStuInfo(StudentInfo studentInfo);
	public Integer updateTotalScore(Map map);
}
