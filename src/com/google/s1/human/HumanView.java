package com.google.s1.human;

import java.util.List;

public class HumanView {

	public void view(List<HumanDTO> ar) {

		for (int i = 0; i < ar.size(); i++) {
			HumanDTO humanDTO = ar.get(i);
			System.out.println("이름:" + humanDTO.getName());
			System.out.println("별명:" + humanDTO.getNickname());
			System.out.println("이메일:" + humanDTO.getEmail());
			System.out.println("전화번호:" + humanDTO.getNumber());
			System.out.println("생일:" + humanDTO.getBirth());
			System.out.println("=================");
		} // for
	}// view메서드

}
