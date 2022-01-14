package com.google.s1.human;

import java.util.ArrayList;
import java.util.HashMap;

public class HumanMain {

	public static void main(String[] args) {
		HumanSelect humanData = new HumanSelect();
		humanData.function();
		
		ArrayList<Integer> ar= new ArrayList<>();
		ArrayList<Integer> ar2= new ArrayList<>();
		
		//ar,ar2를 하나의 맵에다가 담으려고함 
		HashMap<String,ArrayList<Integer>> map = new HashMap<>();
		map.put("a", ar);
		map.put("b", ar2);
		//System.out.println(map);
		
		
	}

}
