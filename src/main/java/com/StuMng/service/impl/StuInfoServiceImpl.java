package com.StuMng.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StuMng.mapping.StudentInfoMapper;
import com.StuMng.po.StudentInfo;
import com.StuMng.service.IStuInfoService;
@Service
public class StuInfoServiceImpl implements IStuInfoService{

	@Autowired
	private StudentInfoMapper studentInfoMapper;
	
	public StuInfoServiceImpl() {
        System.out.println("学生信息管理 serviceimpl...");
    }
	
	@Override
	public List<StudentInfo> showStuInfo() {
		// TODO Auto-generated method stub
		return studentInfoMapper.showStuInfo();
	}

	@Override
	public Integer delStuInfo(String stuid) {
		// TODO Auto-generated method stub
		return studentInfoMapper.delStuInfo(stuid);
	}

	@Override
	public Integer addStuInfo(StudentInfo studentInfo) {
		// TODO Auto-generated method stub
		return studentInfoMapper.addStuInfo(studentInfo);
	}

	@Override
	public String MaxStuInfoId() {
		// TODO Auto-generated method stub
		return studentInfoMapper.MaxStuInfoId();
	}

	@Override
	public Integer updateStuInfo(StudentInfo studentInfo) {
		// TODO Auto-generated method stub
		return studentInfoMapper.updateStuInfo(studentInfo);
	}

	@Override
	public Integer updateTotalScore(Map map) {
		// TODO Auto-generated method stub
		return studentInfoMapper.updateTotalScore(map);
	}
	
	
	
}
