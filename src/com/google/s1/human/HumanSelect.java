package com.google.s1.human;

import java.util.ArrayList;
import java.util.Scanner;

public class HumanSelect {
	Scanner sc = new Scanner(System.in);
	boolean flag = true;
	HumanInput humanInput = new HumanInput();
	HumanView humanView = new HumanView();
	ArrayList<HumanDTO> ar = new ArrayList<>();

	public void function() {

		while (flag) {
			System.out.println("번호를 고르세요.");
			System.out.println("1.전체명단 출력");
			System.out.println("2.검색하기 ");
			System.out.println("3.추가하기 ");
			System.out.println("4.삭제하기 ");
			System.out.println("종료하고싶으면 그 외 숫자를 누르세요 ");
			int select = sc.nextInt();

			if (select == 1) {
				System.out.println("1.전체명단 출력 선택");
				humanView.view(ar);
				
			} else if (select == 2) {
				System.out.println("2.검색하기 선택");
				HumanDTO humanDTO = humanInput.search(ar);
				humanView.view(humanDTO);

			} else if (select == 3) {
				System.out.println("3.추가하기 선택");
				HumanDTO humanDTO = humanInput.add();
				ar.add(humanDTO);
			
				
			} else if (select == 4) {
				System.out.println("4.삭제하기 선택 ");
				Boolean result=humanInput.delete(ar);
				humanView.delete(result);
				
			} else {
				System.out.println("finish ");
				flag = false;
			}
		} // function()메서
	}// while
}// class