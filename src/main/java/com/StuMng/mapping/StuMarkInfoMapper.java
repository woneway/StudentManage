package com.StuMng.mapping;

import java.util.List;
import java.util.Map;

import com.StuMng.po.StuMarkInfo;
import com.StuMng.po.Stu_Id_Name;
import com.StuMng.po.StudentMark;

public interface StuMarkInfoMapper {
//	显示所有学生成绩
	List<StudentMark> showStuMark();
	//删除学生成绩
	Integer delStuMark(String markid);
	
	//查找最大学生成绩编号
	String MaxStuMarkId();
	
	List<Stu_Id_Name> StuIdName();
	
	List<StudentMark> CourseList();
	
	Integer addStuMark(StuMarkInfo stuMarkInfo);
	
	Integer getTotalScore(String stuid);
	
	Double getFinalScore(String markid);
	
}