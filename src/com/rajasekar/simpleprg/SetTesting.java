package com.rajasekar.simpleprg;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetTesting {

	public static void main(String[] args) {
		HashSet set = new LinkedHashSet();
		set.add(new DataObject((short)12));
		set.add(new DataObject((short)12));
		set.add(new DataObject((short)13));
		System.out.println(set);
	}

}

class DataObject{
	private short sh;
	
	public DataObject(short sh){
		this.sh=sh;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof DataObject){
			
			DataObject dataO = (DataObject)obj;
			System.out.println("comapre value:"+this.sh + "Other value"+dataO.sh);
			if(this.sh == dataO.sh){
				
				return true;
			}
		}
		return false;
	}
	
	public String toString(){
		return "sh value:"+sh;
	}
	
	public int hashCode(){
		return (int)this.sh;
	}
}
