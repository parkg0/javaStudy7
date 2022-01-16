package com.google.s1.human;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class HumanInput {
	Scanner sc = new Scanner(System.in);

	// 이르을 입력받아서 같은 이름이 있는 HumanDTO를찾아서Hu의 인덱스번호 찾기
	// 찾아서 삭제
	// 리턴. 이런데이터가 왔으면 삭제가 됐다.저런데이터가오면 삭제가 안됐ㅆ다. 삭제 여부
	// 출력은 view에서

	public boolean delete(ArrayList<HumanDTO> ar) {
		System.out.println("삭제할 이름 입력");
		String name = sc.next();
		boolean result = false;

		for (int i = 0; i < ar.size(); i++) {
			if (name.equals(ar.get(i).getName())) {

				ar.remove(i); // 리턴값: 삭제한 객체
				// result = ar.remove(ar.get(i));
				// humaDTO = ar.remove(i);
				// humanDTO=ar.get(i);
				result = true;
				break;
			}
		}
		return result;
	}

	public HumanDTO search(ArrayList<HumanDTO> ar) {
		System.out.println("검색할 이름 입력");
		String name = sc.next();

		HumanDTO humanDTO = null;///////////////

		for (int i = 0; i < ar.size(); i++) {
			if (name.equals(ar.get(i).getName())) {

				humanDTO = ar.get(i);

				break;
			}
		}
		return humanDTO;
		

		// 키보드로부터 이름을 입력받아서 같은이름이 있는HumanDTO를 ㄱ찾아서 리턴
		// 리턴된걸 메뉴로가고 뷰로가서 출력

		// 정보가 있으먄 출력 , 없는이름을 입력했을 경우 "정보가 없습니다." 출력
	}

	public HumanDTO add() {
		HumanDTO humanDTO = new HumanDTO();
		System.out.println("추가할 사람의 이름을 입력하세요.");
		humanDTO.setName(sc.next());
		System.out.println("추가할 사람의 별명을 입력하세요.");
		humanDTO.setNickname(sc.next());
		System.out.println("추가할 사람의 이메일을 입력하세요.");
		humanDTO.setEmail(sc.next());
		System.out.println("추가할 사람의 번호을 입력하세요.");
		humanDTO.setNumber(sc.next());

		System.out.println("추가할 사람의 생일을 입력하세요.");
		String s = sc.next();// 20001213
		

		int year = Integer.parseInt(s.substring(0, 4));
		int month = Integer.parseInt(s.substring(4, 6));
		int date = Integer.parseInt(s.substring(6));

		Calendar calendar = Calendar.getInstance();
		
		calendar.set(year, month-1, date);
		humanDTO.setBirth(calendar);
		
		return humanDTO;

	}

	public void output() {

		HumanSelect humanSelect = new HumanSelect();

	}

}
