package com.kh.server.service;

import java.sql.Connection;
import java.util.List;

import com.kh.server.common.JDBCTemplate;
import com.kh.server.dao.StuffDao;
import com.kh.server.vo.Stuff;

public class StuffService {
	public int KeepSutff(String id, String name, String category) {
		Connection conn = JDBCTemplate.getConnection();
		int result = new StuffDao().insertStuff(conn, id, new Stuff(name, category));

		if (result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}

		JDBCTemplate.close(conn);
		return result;
	}

	public int TakeStuff(String id, String name) {
		Connection conn = JDBCTemplate.getConnection();
		int result = new StuffDao().deleteStuff(conn, id, name);

		if (result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}

		JDBCTemplate.close(conn);
		return result;
	}

	public List<Stuff> StuffCheck(String id) {
		Connection conn = JDBCTemplate.getConnection();
		List<Stuff> list = new StuffDao().selectStuffList(conn, id);

		JDBCTemplate.close(conn);
		return list;
	}

	public List<Stuff> CheckStuffName(String id, String name) {
		Connection conn = JDBCTemplate.getConnection();
		List<Stuff> list = new StuffDao().selectStuff(conn, id, name);

		JDBCTemplate.close(conn);
		return list;
	}

	public List<Stuff> CheckStuffCategory(String id, String category) {
		Connection conn = JDBCTemplate.getConnection();
		List<Stuff> list = new StuffDao().selectStuffCategory(conn, id, category);

		JDBCTemplate.close(conn);
		return list;
	}

}
