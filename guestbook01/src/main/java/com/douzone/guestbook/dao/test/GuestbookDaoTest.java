package com.douzone.guestbook.dao.test;

import java.time.LocalDate;
import java.util.List;

import com.douzone.guestbook.dao.GuestbookDao;
import com.douzone.guestbook.vo.GuestbookVo;

public class GuestbookDaoTest {

	public static void main(String[] args) {
		
		insert();
		findAll();
		delete();
	}

	private static void delete() {
		GuestbookVo vo = new GuestbookVo();
		vo.setId(1L);
		
		new GuestbookDao().delete(vo);
		
	}

	private static void findAll() {
		List<GuestbookVo> list = new GuestbookDao().findAll();
		for(GuestbookVo vo : list) {
			System.out.println(vo);
		}
		
	}

	private static void insert() {
		GuestbookVo vo = new GuestbookVo();
		vo.setName("홍");
		vo.setPassword("1234");
		vo.setRegDate(LocalDate.now().toString()); 
		vo.setMessage("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\nzzzzzzzzzzzzz\nㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎ");
		
		new GuestbookDao().insert(vo);
	}
	
	

}
