package com.StuMng.mapping;

import java.util.List;
import java.util.Map;

import com.StuMng.po.StudentInfo;


public interface StudentInfoMapper {
    
	//	显示所有学生信息
	List<StudentInfo> showStuInfo();
	
	Integer delStuInfo(String stuid);
	
	Integer addStuInfo(StudentInfo studentInfo);
	
	Integer updateStuInfo(StudentInfo studentInfo);
	
	String MaxStuInfoId();
	
	Integer updateTotalScore(Map map);
}