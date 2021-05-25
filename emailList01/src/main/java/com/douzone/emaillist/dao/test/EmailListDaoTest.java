package com.douzone.emaillist.dao.test;

import java.util.List;

import com.douzone.emaillist.dao.emailListDao;
import com.douzone.emaillist.vo.EmailListVo;

public class EmailListDaoTest {

	public static void main(String[] args) {
//		insertTest();
		findAllTest();
	}

	private static void findAllTest() {
		List<EmailListVo> list =new emailListDao().findAll();
		for(EmailListVo vo : list) {
			System.out.println(vo);
		}
		
	}

	private static void insertTest() {
		EmailListVo vo = new EmailListVo();
		vo.setFirstName("또");
		vo.setLastName("치");
		vo.setEmail("ddochi@gamil.com");
		
		new emailListDao().insert(vo);
		
	}

}
