package com.StuMng.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StuMng.mapping.StuMarkInfoMapper;
import com.StuMng.po.StuMarkInfo;
import com.StuMng.po.Stu_Id_Name;
import com.StuMng.po.StudentMark;
import com.StuMng.service.IStuMarkInfoService;

@Service
public class StuMarkServiceImpl implements IStuMarkInfoService {

	@Autowired
	private StuMarkInfoMapper stuMarkInfoMapper;
	
	@Override
	public List<StudentMark> showStuMark() {
		// TODO Auto-generated method stub
		return stuMarkInfoMapper.showStuMark();
	}

	@Override
	public Integer delStuMark(String markid) {
		// TODO Auto-generated method stub
		return stuMarkInfoMapper.delStuMark(markid);
	}

	@Override
	public String MaxStuMarkId() {
		// TODO Auto-generated method stub
		return stuMarkInfoMapper.MaxStuMarkId();
	}

	@Override
	public List<Stu_Id_Name> StuIdName() {
		// TODO Auto-generated method stub
		return stuMarkInfoMapper.StuIdName();
	}

	@Override
	public List<StudentMark> CourseList() {
		// TODO Auto-generated method stub
		return stuMarkInfoMapper.CourseList();
	}

	@Override
	public Integer addStuMark(StuMarkInfo stuMarkInfo) {
		// TODO Auto-generated method stub
		return stuMarkInfoMapper.addStuMark(stuMarkInfo);
	}

	@Override
	public Integer getTotalScore(String stuid) {
		// TODO Auto-generated method stub
		return stuMarkInfoMapper.getTotalScore(stuid);
	}

	@Override
	public Double getFinalScore(String markid) {
		// TODO Auto-generated method stub
		return stuMarkInfoMapper.getFinalScore(markid);
	}

}
