package com.kh.server.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kh.server.common.JDBCTemplate;
import com.kh.server.vo.User;

public class UserDao {

	public int insertUser(Connection conn, User u) {
		// new User(name, id, pd)
		int result = 0;

		String sql = "INSERT INTO USERS VALUES(?,?,?, SYSDATE)";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, u.getId());
			pstmt.setString(2, u.getPd());
			pstmt.setString(3, u.getName());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			return 0;
		} finally {
			JDBCTemplate.close(pstmt);
		}
		return result;
	}

	public List<User> selectUserList(Connection conn, String id, String pwd) {
		List<User> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rset =null;
		
		String sql = "SELECT * FROM USERS WHERE USER_ID = ? AND USER_PWD = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			
			rset = pstmt.executeQuery();
			//String name, String id, String pd
			while(rset.next()) {
				list.add(new User(rset.getString("USER_NAME"), rset.getString("USER_ID"), rset.getString("USER_PWD")));
				
			}
		} catch (SQLException e) {
			return null;
		}finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		
		
		return list;
	}

	public User selectUser(Connection conn, String id) {
		PreparedStatement pstmt = null;
		ResultSet rset =null;
		User u = null;
		
		String sql = "SELECT * FROM USERS WHERE USER_ID = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rset = pstmt.executeQuery();
			//String name, String id, String pd
			while(rset.next()) {
				u = new User(rset.getString("USER_NAME"), rset.getString("USER_ID"), rset.getString("USER_PWD"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		
		
		return u;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
