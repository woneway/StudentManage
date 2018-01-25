package com.StuMng.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.StuMng.po.JsonData;
import com.StuMng.po.StuMarkInfo;
import com.StuMng.po.Stu_Id_Name;
import com.StuMng.po.StudentMark;
import com.StuMng.service.IStuInfoService;
import com.StuMng.service.IStuMarkInfoService;
import com.alibaba.fastjson.JSON;

@Controller
@RequestMapping("/StuMark")
public class StuMarkInfoController {
	
	public StuMarkInfoController() {
		System.out.println("学生成绩管理 controller...");
	}
	
	@Autowired
	private IStuMarkInfoService stuMarkInfoService;
	
	@Autowired
	private IStuInfoService stuInfoService;

	@RequestMapping("/showStuMark")	
	public @ResponseBody JsonData showStuMark() {
        System.out.println("学生成绩管理---展示所有学生成绩");
        List<StudentMark> studentMark = stuMarkInfoService.showStuMark();  
		JsonData jsonData = new JsonData();
		jsonData.setData(studentMark);
        return jsonData;  
    }
	
	
	
	@RequestMapping("/delStuMark")
	@ResponseBody
	public Integer delStuMark(String markid,String stuid) {
		System.out.println("学生成绩管理---删除学生成绩");
		
		int f = stuMarkInfoService.delStuMark(markid);
		if(f != 1) return f;
		System.out.println(stuid);
		Map map = new HashMap();
		map.put("stuid", stuid);
		System.out.println(map);
		int totalscore = stuMarkInfoService.getTotalScore(stuid);
		map.put("totalscore", totalscore);
		System.out.println(map);
		stuInfoService.updateTotalScore(map);
		return f;
	}
	
	
	
	@RequestMapping("/MaxStuMarkId")
	@ResponseBody
	public Map MaxStuMarkId() {
		System.out.println("学生成绩管理---获得成绩编号最大值");
		String markid = stuMarkInfoService.MaxStuMarkId();
		String num = markid.substring(2);
		int a = 1 + Integer.parseInt(num);
		markid = "CJ" + a;
		List<Stu_Id_Name> stuidname = stuMarkInfoService.StuIdName();
		List<StudentMark> courselist = stuMarkInfoService.CourseList();
		Map map = new HashMap();
		map.put("markid", markid);
		map.put("stuidname", stuidname);
		map.put("courselist", courselist);
		return map;
	}
	
	
	@RequestMapping("/addStuMark")
	@ResponseBody
	public Integer addStuMark(StuMarkInfo stuMarkInfo) {
		System.out.println("学生成绩管理---增加学生成绩");
		System.out.println(JSON.toJSON(stuMarkInfo));
		int f = stuMarkInfoService.addStuMark(stuMarkInfo);
		if(f != 1) return f;
		//更新总学分;
		String stuid = stuMarkInfo.getStuid();
		System.out.println(stuid);
		Map map = new HashMap();
		map.put("stuid", stuid);
		System.out.println(map);
		int totalscore = stuMarkInfoService.getTotalScore(stuid);
		map.put("totalscore", totalscore);
		System.out.println(map);
		stuInfoService.updateTotalScore(map);
		return f;
	}
}
