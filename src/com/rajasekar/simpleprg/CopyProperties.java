package com.rajasekar.simpleprg;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.PropertyUtilsBean;

import com.rajasekar.simpleprg.dataobj.DataObject;

public class CopyProperties {

	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		// TODO Auto-generated method stub
		
		DataObject srcdatao = new DataObject();
		DataObject destdatao = new DataObject();
		srcdatao.setCount(4);
		List list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		srcdatao.setList(list);
		srcdatao.setStr("raja");
		srcdatao.setStrArray(new String[]{"rajasekar","sathya"});	
		PropertyUtilsBean bean = new PropertyUtilsBean();
		bean.copyProperties(destdatao,srcdatao);
		System.out.println(srcdatao);
		System.out.println(destdatao);

	}

}
