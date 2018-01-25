package com.StuMng.po;

import java.util.List;

public class JsonData<T> {
	List<T> data;

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}
	
}
