package com.rajasekar.simpleprg.strexample;

public class StringUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			getSlotValuefromPifName("port-u1/0");
			getSlotValuefromPifName("port-u13/10");
			getSlotValuefromPifName("port-u1/10");
			getSlotValuefromPifName("port-u13/1");
			getSlotValuefromPifName("port-sa-u0/1");
			
	}
	
	private static void getSlotValuefromPifName(String pifName){
		
		int startIndex=pifName.lastIndexOf("-");
		int endIndex = pifName.lastIndexOf("/");
		System.out.println(startIndex+":"+endIndex);
		System.out.println(pifName.substring(startIndex+1, endIndex));
	}

}
