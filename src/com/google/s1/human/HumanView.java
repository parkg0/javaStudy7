package com.google.s1.human;

import java.text.SimpleDateFormat;
import java.util.List;

public class HumanView {
	//문자열을 받아서 출력하는메서드 삭제성공 실패 판단은 메뉴에서 
	
	public void delete(Boolean result) {
		if(result==true) {
			System.out.println("삭제되었습니다. ");
		}else {
			System.out.println("삭제 안됨 ");
		}
		
	}
	//\패턴
	String pattern ="yyyy년 MM월 dd일 (E)";
	SimpleDateFormat sd= new SimpleDateFormat(pattern);
	
	public void view(HumanDTO humanDTO) {
		
		if(humanDTO != null) {
			//2000년 12월 24일 (수) 이런형태로 출력하기 
			System.out.println("이름:" + humanDTO.getName());
			System.out.println("별명:" + humanDTO.getNickname());
			System.out.println("이메일:" + humanDTO.getEmail());
			System.out.println("전화번호:" + humanDTO.getNumber());
			//
			String birth=sd.format(humanDTO.getBirth().getTime());
			System.out.println("생일:" + birth);
			System.out.println("=================");
		}else {
			System.out.println("정보가 없습니다. ");
		}
	}
	
 
	public void view(List<HumanDTO> ar) {

		for (int i = 0; i < ar.size(); i++) {
			HumanDTO humanDTO = ar.get(i);
			System.out.println("이름:" + humanDTO.getName());
			System.out.println("별명:" + humanDTO.getNickname());
			System.out.println("이메일:" + humanDTO.getEmail());
			System.out.println("전화번호:" + humanDTO.getNumber());
			
			String birth=sd.format(humanDTO.getBirth().getTime());
			System.out.println("생일:" + birth);
			
			System.out.println("=================");
		} // for
	}// view메서드

}
