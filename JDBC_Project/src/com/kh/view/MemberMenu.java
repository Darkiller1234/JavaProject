package com.kh.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kh.controller.MemberController;
import com.kh.model.vo.Member;

//View : 사용자가 보게 될 시각적인 요소(출력 및 입력)
public class MemberMenu {
	// Scanner 객체 생성 : 전역으로 다 입력받을 수 있도록
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	/*
	 * 사용자가 보게될 첫 화면(메인화면)
	 */
	public void mainMenu() {
		while (true) {
			System.out.println("============== 회원관리 프로그램 ===============");
			System.out.println("1. 회원추가"); // 데이터 추가 create
			System.out.println("2. 회원전체조회"); // 데이터 조회 read
			System.out.println("3. 회원정보수정"); // 데이터 변경 update
			System.out.println("4. 회원탈퇴"); // 데이터 삭제 delete
			System.out.println("0. 프로그램 종료");

			System.out.print("메뉴 입력 : ");
			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				//회원 추가
				this.inputMember();
				break;
			case 2:
				//회원 전체 조회
				List<Member> list = mc.selectMemberList();
				if(list.isEmpty()) {
					this.displayNoData("없어!");
				}
				else {
					this.displayMemberList(list);
				}
				break;
			case 3:
				//회원 정보 수정
				this.updateMember();
				break;
			case 4:
				//회원 탈퇴
				if(mc.deleteMember(id())>0) {
					this.displaySuccess("회원 탈퇴 성공");
				} else {
					this.displayFail("실패");
				}
				break;
			case 0:
				System.out.println("이용해주셔서 감사합니다. 프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}

	}
	/*
	 * id~취미까지 멤버정보를 입력받아 controller 에 전달하는 메소드
	 */
	public void inputMember() {
		System.out.println("==================== 회원 추가 =====================");
		
		String userId = id();
		System.out.print("비밀번호 : ");
		String userPWD = sc.nextLine();
		System.out.print("이름 : ");
		String userName = sc.nextLine();
		System.out.print("성별(M,F) : ");
		String gender = sc.nextLine().toUpperCase();
		System.out.print("나이 : ");
		String age = sc.nextLine();
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		System.out.print("전화번호 : ");
		String phone = sc.nextLine();
		System.out.print("주소 : ");
		String address = sc.nextLine();
		System.out.print("취미 : ");
		String hobby = sc.nextLine();
		
		int result = mc.insertMember(userId, userPWD, userName, gender, age, email, phone, address, hobby);
		
		if(result > 0) {//추가성공 -> 성공화면출력
			this.displaySuccess("성공적으로 회원 정보 추가되었습니다.");
		} else {//추가실패 -> 실패화면출력
			this.displayFail("회원추가에 실패하였습니다.");
		}
	}
	
	public void updateMember() {
		System.out.println("================== 회원 정보 변경 =================");
		//(어떤 회원의 정보를 변경할지 Id -> 비밀번호, 이메일, 전화번호, 주소 변경 
		String userId = id();
		System.out.print("비밀번호 : ");
		String userPWD = sc.nextLine();
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		System.out.print("전화번호 : ");
		String phone = sc.nextLine();
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		if(mc.updateMember(userId, userPWD, email, phone, address) > 0) {
			this.displaySuccess("회원정보 변경에 성공하였습니다.");
		} else {
			this.displayFail("회원정보 변경에 실패하였습니다.");
		}
	}
	
	
	public String id() {
		System.out.print("아이디 : ");
		return sc.nextLine();
	}
	
	//-----------------------------응답화면--------------------------
	/**
	 * 서비스 오쳥 후 처리를 성고적으로 완료했을 때 보게될 응답화면
	 * @param message : 성공메세지
	 */
	public void displaySuccess(String message) {
		System.out.println("\n서비스 요청 성공 : " + message);
	}
	
	/**
	 * 서비스 오쳥 후 처리를 성고적으로 완료하지 못했을 때 보게될 응답화면
	 * @param message : 실패메세지
	 */
	public void displayFail(String message) {
		System.out.println("\n서비스 요청 실패 : " + message);
	}
	
	/**
	 * 조회서비스 요청시 결과가 없을 경우 보게될 메세지
	 * @param message
	 */
	public void displayNoData(String message) {
		System.out.println("\n" + message);
	}
	
	/**
	 * 
	 */
	public void displayMemberList(List<Member> list) {
		for(Member m: list) {
			System.out.println(m.toString());
		}
	}
	
	
}
