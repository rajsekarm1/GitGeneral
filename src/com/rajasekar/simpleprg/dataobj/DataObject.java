package com.rajasekar.simpleprg.dataobj;

import java.util.List;

public class DataObject {
	
	private int count;
	
	private String[] strArray;
	
	private List list;
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String[] getStrArray() {
		return strArray;
	}

	public void setStrArray(String[] strArray) {
		this.strArray = strArray;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	private String str;
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("The value of this object 1) Count:"+this.count+"\n");
		sb.append("2) strArray:"+"\n");
		for(String str:strArray){
			sb.append(str+":");
		}
		sb.append("3) list:"+this.list+"\n");
		return sb.toString();
		
	}

}
