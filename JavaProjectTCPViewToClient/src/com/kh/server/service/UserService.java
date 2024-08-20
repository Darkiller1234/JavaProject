package com.kh.server.service;

import java.sql.Connection;
import java.util.List;

import com.kh.server.common.JDBCTemplate;
import com.kh.server.dao.StuffDao;
import com.kh.server.dao.UserDao;
import com.kh.server.vo.Stuff;
import com.kh.server.vo.User;

public class UserService {
	
	public int Registor(User u) {
		Connection conn = JDBCTemplate.getConnection();
		int result = new UserDao().insertUser(conn, u);
		
		if(result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		return result;
	}
	
	public User Login(String id, String pwd) {
		Connection conn = JDBCTemplate.getConnection();
		List<User> list = new UserDao().selectUserList(conn, id, pwd);
		if(list.isEmpty()) {
			return null;
		} else
			return list.get(0);
	}

	public User getUser(String id) {
		Connection conn = JDBCTemplate.getConnection();
		User result = new UserDao().selectUser(conn, id);
		
		if(result != null) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		return result;
	}

	
}
