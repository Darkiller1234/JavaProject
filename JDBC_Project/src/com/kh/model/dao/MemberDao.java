package com.kh.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.kh.model.vo.Member;

//DAO(Data Access Object) : db에 직접적으로 접근해서 사용자의 요청에 맞는 sql문 실행 후 결과 반환(JDBC)
public class MemberDao {
	
	/**
	 * 
	 * @param Member m : 사용자가 입력한 값들이 담겨있는 member 객체
	 * @return : insert문 실행 후 처리된 행 수
	 */
	public int insertMember(Member m) {
		//insert문 => 처리된 행수(int) => 트랙잭션
		
		//필요한 변수 먼저 세팅
		int result = 0; // 처리된 결과를 받아줄 변수
		Connection conn = null; //연결된 db정보를 담는 객체
		//Statement stmt = null; //완성된 sql문 전달해서 곧바로 실행 후 결과를 받는 객체
		PreparedStatement pstmt = null; // 미완성 sql문을 통해서 객체생성 후 객체의 메소드를 이용해 완성가능
		
		//미완성 SQL문
		String sql = "INSERT INTO MEMBER VALUES(SEQ_USERNO.NEXTVAL, ?,?,?,?,?,?,?,?,?,SYSDATE)";
		
//		String sql = "INSERT INTO MEMBER VALUES("
//				+ "SEQ_USERNO.NEXTVAL, "
//				+ "'" + m.getUserID() + "', "
//				+ "'" + m.getUserPWD() + "', "
//				+ "'" + m.getUserName() + "', "
//				+ "'" + m.getGender() + "', "
//				+ m.getAge() + ", "
//				+ "'" + m.getEmail() + "', "
//				+ "'" + m.getPhone() + "', "
//				+ "'" + m.getAddress() + "', "
//				+ "'" + m.getHobby() + "', "
//				+ "SYSDATE)";
		System.out.println("sql : " + sql);
		
		try {
			//1) JDBC Driver 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2) Connection 객체 생성
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JDBC", "JDBC");
			conn.setAutoCommit(false);//수동커밋 설정
			
			//3) Statement 객체 생성
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getUserID());
			pstmt.setString(2, m.getUserPWD());
			pstmt.setString(3, m.getUserName());
			pstmt.setString(4, m.getGender());
			pstmt.setInt(5, m.getAge());
			pstmt.setString(6, m.getEmail());
			pstmt.setString(7, m.getPhone());
			pstmt.setString(8, m.getAddress());
			pstmt.setString(9, m.getHobby());
			
			//4,5) sql로 전달하면서 실행 후 값 받아오기
			result = pstmt.executeUpdate();
			
			if(result > 0) {
				conn.commit();
			} else {
				conn.rollback();
			}
			
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch(SQLException e){
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * 
	 */
	public List<Member> selectMemberList() {
		//select문(여러행 조회) -> ResultSet객체 -> ArrayList<Member>에 담기
		
		//필요한 변수들 세팅
		ArrayList<Member> list = new ArrayList<>(); // 비어있는상태
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null; // select문 실행시 조회된 결과값들이 최초로 담기는 공간
		
		//실행할 sql
		String sql = "SELECT * FROM MEMBER";
		
		
		try {
			//1) JDBC Driver 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2) Connection 객체 생성
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JDBC", "JDBC");
			conn.setAutoCommit(false);//수동커밋 설정
			
			stmt = conn.createStatement();
			
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				list.add(new Member(rset.getInt("USER_NO"), rset.getString("USER_ID"), 
									rset.getString("USER_PWD"), rset.getString("USER_NAME"), 
									rset.getString("GENDER"), rset.getInt("AGE"), 
									rset.getString("EMAIL"), rset.getString("PHONE"), 
									rset.getString("ADDRESS"), rset.getString("HOBBY"), 
									rset.getDate("ENROLL_DATE")));
				//현재 참조하고있는 행에 대한 모든 컬럼에 데이터들을 한 MEMBER객체에 담기
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rset.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return list;
	}

	public int updateMember(Member m) {
		//update문 -> 처리된 행 수(int)
		
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		/*
		 * update member
		 * set user_pwd = 'xxx', email = 'xxxx', phone = 'xxxx', address = 'xxxx'
		 * where user_id = 'xxxx'
		 */
		
		String sql = "UPDATE MEMBER "
				+ "SET USER_PWD = ?, "
				+ "EMAIL = ?, "
				+ "PHONE = ?, "
				+ "ADDRESS = ? "
				+ "WHERE USER_ID = ?";
		
		
		try {
			//1) JDBC Driver 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2) Connection 객체 생성
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JDBC", "JDBC");
			conn.setAutoCommit(false);//수동커밋 설정
			
			//미완성 SQL문
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getUserPWD());
			pstmt.setString(2, m.getEmail());
			pstmt.setString(3, m.getPhone());
			pstmt.setString(4, m.getAddress());
			pstmt.setString(5, m.getUserID());
		
			result = pstmt.executeUpdate();
			if(result > 0) {
				conn.commit();
			}else {
				conn.rollback();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
		
		
	}

	public int deleteMember(Member m) {
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "DELETE FROM MEMBER "
				+ "WHERE USER_ID = ?";
		try {
			//1) JDBC Driver 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2) Connection 객체 생성
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JDBC", "JDBC");
			conn.setAutoCommit(false);//수동커밋 설정
			
			//미완성 SQL문
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getUserID());
		
			result = pstmt.executeUpdate();
			if(result > 0) {
				conn.commit();
			}else {
				conn.rollback();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}
	
}
