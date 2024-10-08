package com.kh.controller;

import java.util.List;

import com.kh.model.dao.MemberDao;
import com.kh.model.vo.Member;

//Controller : view를 통해서 사용자가 요청한 기능에 대해 처리를 담당
//			   해당 메소드로 전달된 데이터를 가공처리 후 dao로 전달하여 호출
//			   dao로부터 반환받은 결과가 성공인지 실패인지에 따라서 응답화면 결정(view메소드 호출)
public class MemberController {
	
	/*
	 * 사용자 추가 요청을 처리해주는 메소드
	 * @param userId ~ hobby : 사용자가 입력했던 정보들이 담겨있는 매게변수
	 */
	public int insertMember(String id, String pwd, String name, String gender, String age, String email, 
			String phone, String address, String hobby) {
		//view에서 전달받은 값을 바로 dao쪽으로 전달x
		//하나의 객체로 만들어서 전달 (Member(vo))
		Member m = new Member(id, pwd, name, gender, Integer.parseInt(age), email, phone, address, hobby);
		int result = new MemberDao().insertMember(m);
		return result;
	}

	/**
	 * 회원을 전부 조회하는 메소드
	 */
	public List<Member> selectMemberList() {
		List<Member> list = new MemberDao().selectMemberList();
		
		//조회된 결과에 따라서 사용자가 보게 될 응답화면 지정
		return list;
	}

	public int updateMember(String userId, String userPWD, String email, String phone, String address) {
		Member m = new Member();
		m.setUserID(userId);
		m.setUserPWD(userPWD);
		m.setEmail(email);
		m.setPhone(phone);
		m.setAddress(address);
		int result = new MemberDao().updateMember(m);
		return result;
	}

	public int deleteMember(String id) {
		
		Member m = new Member();
		m.setUserID(id);
		
		int result = new MemberDao().deleteMember(m);
		return result;
	}
}
