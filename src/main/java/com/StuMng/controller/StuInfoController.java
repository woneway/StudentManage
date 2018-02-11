package com.StuMng.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.StuMng.po.JsonData;
import com.StuMng.po.StudentInfo;
import com.StuMng.service.IStuInfoService;

@Controller
@RequestMapping("/StuInfo")
public class StuInfoController {
	
	static Logger logger = Logger.getLogger(StuInfoController.class); 
	
	@Autowired
	private IStuInfoService stuInfoService;

	@RequestMapping("/showStuInfo")
	public @ResponseBody JsonData showStuInfo() {
		List<StudentInfo> studentInfo = stuInfoService.showStuInfo();
		JsonData jsonData = new JsonData();
		jsonData.setData(studentInfo);
		return jsonData;
	}

	@RequestMapping("/delStuInfo")
	@ResponseBody
	public Integer delStuInfo(String stuid) {
		return stuInfoService.delStuInfo(stuid);
	}

	@RequestMapping("/MaxStuInfoId")
	@ResponseBody
	public String MaxStuInfoId() {
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
		return stuInfoService.addStuInfo(studentInfo);
	}
	
	
	@RequestMapping("/updateStuInfo")
	@ResponseBody
	public Integer updateStuInfo(StudentInfo studentInfo) {
		return stuInfoService.updateStuInfo(studentInfo);
	}
}
