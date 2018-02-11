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
	
	@Autowired
	private IStuMarkInfoService stuMarkInfoService;
	
	@Autowired
	private IStuInfoService stuInfoService;

	@RequestMapping("/showStuMark")	
	public @ResponseBody JsonData showStuMark() {
        List<StudentMark> studentMark = stuMarkInfoService.showStuMark();  
		JsonData jsonData = new JsonData();
		jsonData.setData(studentMark);
        return jsonData;  
    }
	
	
	
	@RequestMapping("/delStuMark")
	@ResponseBody
	public Integer delStuMark(String markid,String stuid) {
		int f = stuMarkInfoService.delStuMark(markid);
		Double finalscore = stuMarkInfoService.getFinalScore(markid)*0.1;
		if(f != 1) return f;
		Map map = new HashMap();
		map.put("stuid", stuid);
		int totalscore = stuMarkInfoService.getTotalScore(stuid);
		map.put("totalscore", totalscore-Math.round(finalscore));
		stuInfoService.updateTotalScore(map);
		return f;
	}
	
	
	
	@RequestMapping("/MaxStuMarkId")
	@ResponseBody
	public Map MaxStuMarkId() {
		String markid = stuMarkInfoService.MaxStuMarkId();
		if(markid==null)
			markid = "CJ2015060000";
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
		double finalscore = stuMarkInfo.getFinalscore()*0.1;
		int f = stuMarkInfoService.addStuMark(stuMarkInfo);
		if(f != 1) return f;
		//更新总学分;
		String stuid = stuMarkInfo.getStuid();
		Map map = new HashMap();
		map.put("stuid", stuid);
		int totalscore = stuMarkInfoService.getTotalScore(stuid);
		map.put("totalscore", totalscore+Math.round(finalscore));
		stuInfoService.updateTotalScore(map);
		return f;
	}
}
