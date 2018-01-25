package com.StuMng.controller.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * 
* @Title: CustomDateConverter.java 
* @Package com.woneway.controller.converter 
* @Description: 日期转换�?
* @author Woneway
* @date Oct 1, 2017 2:44:56 PM 
* @version V1.0
 */
public class CustomDateConverter implements Converter<String,Date>{

	@Override
	public Date convert(String source) {
		
		//实现 将日期串转成日期类型(格式是yyyy-MM-dd)
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			//转成直接返回
			return simpleDateFormat.parse(source);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//如果参数绑定失败返回null
		return null;
	}

}
