package com.StuMng.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.StuMng.po.JsonData;
import com.StuMng.po.StudentInfo;
import com.StuMng.service.IStuInfoService;
import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping("/StuInfo")
public class StuInfoController {

	public StuInfoController() {
		System.out.println("学生信息管理 controller...");
	}

	@Autowired
	private IStuInfoService stuInfoService;

	@RequestMapping("/showStuInfo")
	public @ResponseBody JsonData showStuInfo() {
		System.out.println("学生信息管理---展示所有学生信息");
		List<StudentInfo> studentInfo = stuInfoService.showStuInfo();
		JsonData jsonData = new JsonData();
		jsonData.setData(studentInfo);
		return jsonData;
	}

	@RequestMapping("/delStuInfo")
	@ResponseBody
	public Integer delStuInfo(String stuid) {
		System.out.println("学生信息管理---删除学生信息");
		return stuInfoService.delStuInfo(stuid);
	}

	@RequestMapping("/MaxStuInfoId")
	@ResponseBody
	public String MaxStuInfoId() {
		System.out.println("学生信息管理---获得学号最大值");
		String maxid = stuInfoService.MaxStuInfoId();
		String num = maxid.substring(2, 6);
		int a = 1 + Integer.parseInt(num);
		if (a < 10)
			return maxid = "XH000" + a;
		if (a < 100)
			return maxid = "XH00" + a;
		if (a < 1000)
			return maxid = "XH0" + a;
		return maxid = "XH" + a;
	}

	@RequestMapping("/addStuInfo")
	@ResponseBody
	public Integer addStuInfo(StudentInfo studentInfo) {
		System.out.println("学生信息管理---增加学生信息");
		System.out.println(JSON.toJSON(studentInfo));
		return stuInfoService.addStuInfo(studentInfo);
	}
	
	
	@RequestMapping("/updateStuInfo")
	@ResponseBody
	public Integer updateStuInfo(StudentInfo studentInfo) {
		System.out.println("学生信息管理---修改学生信息");
		System.out.println(JSON.toJSON(studentInfo));
		return stuInfoService.updateStuInfo(studentInfo);
	}
}
