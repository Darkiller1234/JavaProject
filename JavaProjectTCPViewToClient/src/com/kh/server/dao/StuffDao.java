package com.kh.server.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.kh.server.common.JDBCTemplate;
import com.kh.server.vo.Stuff;

public class StuffDao {

	public int insertStuff(Connection conn, String id, Stuff s) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String sql = "INSERT INTO STUFF VALUES(?,?,?, SYSDATE)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, s.getName());
			pstmt.setString(3, s.getCategory());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
	}

	public int deleteStuff(Connection conn, String id, String name) {
		int result = 0;
		Statement stmt = null;
		String sql = "DELETE FROM STUFF WHERE USER_ID = '" + id + "' AND STUFF_NAME = '" + name + "'";
		
		try {
			stmt = conn.createStatement();
			
			result = stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(stmt);
		}
		
		return result;
	}

	public List<Stuff> selectStuffList(Connection conn, String id) {
		List<Stuff> list = new ArrayList<>();
		Statement stmt = null;
		ResultSet rset =null;
		
		String sql = "SELECT * FROM STUFF WHERE USER_ID = '" + id + "'";
		
		
		try {
			stmt = conn.createStatement();
			
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				list.add(new Stuff(rset.getString("STUFF_NAME"), rset.getString("STUFF_CATEGORY")));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(stmt);
		}
		
		return list;
	}

	public List<Stuff> selectStuff(Connection conn, String id, String name) {
		List<Stuff> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rset =null;
		
		String sql = "SELECT * FROM STUFF WHERE USER_ID = ? AND STUFF_NAME LIKE ('%?%')";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			rset = pstmt.executeQuery();
			
			
			while(rset.next()) {
				list.add(new Stuff(rset.getString("STUFF_NAME"), rset.getString("STUFF_CATEGORY")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		
		return list;
	}

	public List<Stuff> selectStuffCategory(Connection conn, String id, String category) {
		List<Stuff> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rset =null;
		
		String sql = "SELECT * FROM STUFF WHERE USER_ID = ? AND STUFF_CATEGORY LIKE ('%?%')";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, category);
			rset = pstmt.executeQuery();
			
			
			while(rset.next()) {
				list.add(new Stuff(rset.getString("STUFF_NAME"), rset.getString("STUFF_CATEGORY")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		
		return list;
	}
	
}
