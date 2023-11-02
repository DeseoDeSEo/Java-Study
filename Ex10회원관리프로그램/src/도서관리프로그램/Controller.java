package 도서관리프로그램;

import java.util.ArrayList;

public class Controller {
	//view랑 model(dao)소통할 수 있는 중간다리 역할임.
	
	
	//도서등록 기능 : Main에서 보내준 VO를 받아서 DAO로 보내는 역할
	public void insert(BookVO vo) {
		BookDAO dao = new BookDAO();
		int row = dao.insert(vo);
		if(row > 0) {
			System.out.println("도서등록 성공");
		}else {
			System.out.println("도서등록 실패");
		}
	}
	public void select() {
		BookDAO dao = new BookDAO();//dao가 select를 사용할 수 있도록 객체 생성
		ArrayList<BookVO> bookList = dao.select(); //테이블 데이터를 결과값으로 가져옴.
		for(int i =0; i<bookList.size(); i++) {
			System.out.println(bookList.get(i).getTitle()+"\t");
			System.out.println(bookList.get(i).getName()+"\t");
			System.out.println(bookList.get(i).getPrice()+"\t");
			System.out.println(bookList.get(i).getNum()+"\t");
			System.out.println();
		}
	}
	public void selectOne(BookVO vo){
		BookDAO dao = new BookDAO();
		dao.selectOne(vo); //dao로 보냄
		System.out.println(vo.getName());
		
		
	}
}
	

