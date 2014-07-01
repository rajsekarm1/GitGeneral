package com.rajasekar.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleRegEx {

	public static void main(String[] args) {
		//mapExpMapping(true,"([8]7,6,5,4,3,2,1,0)","7,6,2,2,1,1,0,0","([8]\"[1]G\",\"[1]G\",\"[1]Y\",\"[1]G\",\"[1]Y\",\"[1]G\",\"[1]Y\",\"[1]G\")");
		//mapExpMapping(true,"([1]0)","0","([1]\"[1]G\")");
		
		System.out.println(trimSuffixComma("0,0,1,1,2,2,6,7,,,,,,,,,,"));
		
	}
	
	
	
	private static void mapExpMapping(Boolean isInExp, String mtnmfromToExp, String mtnmTrafficClass, String mtnmColor){
		
		if(mtnmfromToExp ==null || mtnmTrafficClass == null || mtnmColor == null){
			return;
		}
		String[] fromToExpArray = mtnmfromToExp.substring(mtnmfromToExp.indexOf(']')+1, mtnmfromToExp.indexOf(')')).split(","); 
		String[] trafficClassArray = mtnmTrafficClass.split(",");
		String[] colorArray = new String[trafficClassArray.length];
		int colorArrayCounter=0;
		for(int i=0;i<mtnmColor.length();i++){
			char ch = mtnmColor.charAt(i);
			if(Character.isLetter(ch)){
				colorArray[colorArrayCounter++]=ch+"";
			}
		}
		
		System.out.println(fromToExpArray.length+" : "+trafficClassArray.length+"  :   "+colorArray.length);
		
	}

}
