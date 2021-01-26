package com.rui.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.rui.dao.FlowerDao;
import com.rui.pojo.Flower;
/**
 * 数据访问层
 * 注意:数据访问层要有异常处理
 * @author Rui
 * Date 2021年1月26日 上午8:50:21
 */
public class FlowerDaoImpl implements FlowerDao {

	@Override
	public List<Flower> selAll() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Flower> list = new ArrayList<>();
		Flower f = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssm?serverTimezone=UTC", "root", "capslock");
			String sql = "select * from flower";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				f = new Flower();
				f.setId(rs.getInt("id"));
				f.setFname(rs.getString("fname"));
				f.setPrice(rs.getFloat("price"));
				f.setProduction(rs.getString("production"));
				list.add(f);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return list;
	}

	@Override
	public int insFlower(Flower f) {
		Connection conn = null;
		PreparedStatement ps = null;
		int flag = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssm?serverTimezone=UTC", "root", "capslock");
			String sql = "insert into flower values(default,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, f.getFname());
			ps.setFloat(2, (float)f.getPrice());
			ps.setString(3, f.getProduction());
			flag = ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flag;
	}

}
