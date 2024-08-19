package com.kh.server.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.kh.server.vo.User;

public class UserDao {
	private Connection conn;
	private PreparedStatement pstmt;
	private String sql;

	public UserDao() {
		super();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			this.conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JDBC", "JDBC");
			conn.setAutoCommit(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int insertUser(User u) {
		//new User(name, id, pd)
		int result = 0;
		
		sql = "INSERT INTO USER VALUES(?,?,?, SYSDATE)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, u.getId());
			pstmt.setString(2, u.getPd());
			pstmt.setString(3, u.getName());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			} catch(SQLException e){
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public User checkUser(String id, String pd) {
		ResultSet rset = null;
		sql = "SELECT * FROM USER WHERE USER_ID = ? AND USER_PWD = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pd);
			rset = pstmt.executeQuery();
			if(rset.next()) {
				return new User(rset.getString("USER_ID"), rset.getString("USER_PWD"), rset.getString("USER_NAME"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			} catch(SQLException e){
				e.printStackTrace();
			}
		}
		return null;
	}
}
