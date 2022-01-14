package com.google.s1.human;

import java.util.Scanner;

public class HumanInput {
	
	Scanner sc= new Scanner(System.in);
	
	
	public HumanDTO add() {
		HumanDTO humanDTO =new HumanDTO();
		System.out.println("추가할 사람의 이름을 입력하세요.");
		humanDTO.setName(sc.next());
		System.out.println("추가할 사람의 별명을 입력하세요.");
		humanDTO.setNickname(sc.next());
		System.out.println("추가할 사람의 이메일을 입력하세요.");
		humanDTO.setEmail(sc.next());
		System.out.println("추가할 사람의 번호을 입력하세요.");
		humanDTO.setNumber(sc.next());
		System.out.println("추가할 사람의 생일을 입력하세요.");
		humanDTO.setBirth(sc.next());
		
		return humanDTO;
		
	}
	
	public void output() {
		
		HumanSelect humanSelect = new HumanSelect();
	
		
	}

}
