package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {
	public static void main(String[] args) {;
		Employee emp ; 
		emp = new Employee();
		emp.setEmpNo(100);
		emp.setEmpName("홍길동");
		emp.setDept("영업부");
		emp.setJop("과장");
		emp.setAge(25);
		emp.setGender('남');
		emp.setSalary(2500000);
		emp.setBonusPoint(0.05);
		emp.setPhone("010-1234-5678");
		emp.setAddress("서울시 강남구");
		
		System.out.println("사원번호 : " + emp.getEmpNo());
		System.out.println("이름 : " + emp.getEmpName());
		System.out.println("소속 : " + emp.getDept());
		System.out.println("직책 : " + emp.getJop());
		System.out.println("나이 : " + emp.getAge());
		System.out.println("성별 : " + emp.getGender());
		System.out.println("급여 : " + emp.getSalary());
		System.out.println("보너스 : " + emp.getBonusPoint());
		System.out.println("전화번호 : " + emp.getPhone());
		System.out.println("주소 : " + emp.getAddress());
	}
}
