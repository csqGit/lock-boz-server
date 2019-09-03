package com.bozpower.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.bozpower.LockServerMain;
import com.bozpower.entity.Company;
import com.bozpower.entity.Lockinfo;
import com.bozpower.entity.Pojo;
import com.bozpower.entity.Requestlog;
import com.bozpower.entity.TransformerSub;


public class Jdbc {
	private static String DRIVER = "com.mysql.jdbc.Driver";
	private static String URL = "jdbc:mysql://localhost:3306/dblock?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone = GMT";
	private static String USER = "root";
	private static String PASSWORD = "Bozpower123#";
	private static Connection connection;
	
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	private String date = sdf.format(new Date());
	
	private Pojo pojo = new Pojo();

	public Jdbc() {
//		getConnection();
	}

	/**
	 * 获取数据库连接
	 */
	public  Connection getConnection() {
		try {
			if (connection != null) {
				return connection;
			} else {
				Class.forName(DRIVER);
				connection = DriverManager.getConnection(URL, USER, PASSWORD);
			}
//			System.out.println("数据库连接成功");
		} catch (Exception e) {
			System.err.println("数据库连接失败getConnection()");
			e.printStackTrace();
		}
		return connection;
	}
	
	
	
	public void selectLockList() {
		Connection conn = this.getConnection();
		String sql = "select id, did, voltage, company_id, transformersub_id from lockinfo";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet result = pstmt.executeQuery();
			while(result.next()) {
				int id = result.getInt(1);
				String did = result.getString(2);
				String voltage = result.getString(3);
				int companyId = result.getInt(4);
				int transid = result.getInt(5);
				Company company = new Company();
				TransformerSub trans = new TransformerSub();
				company.setId(companyId);
				trans.setId(transid);
				Lockinfo lock = new Lockinfo(id, did, voltage, company, trans);
				LockServerMain.lockList.add(lock);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public Pojo getLogList(String did) {
		Connection conn = this.getConnection();
		String sql = "select id, voltage, did, status from requestlog where  "
				+ "status != 4 and did = ? and requesttime like ? ";
		System.out.println("sql" + sql);
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, did);
			pstmt.setString(2, "%"+date+"%");
			ResultSet result = pstmt.executeQuery();
			while(result.next()) {
				Requestlog req = new Requestlog();
				int id = result.getInt(1);
				String voltage = result.getString(2);
				String dids = result.getString(3);
				int status = result.getInt(4);
				//System.out.println("id:" + id + ",voltage:" + voltage + ",did:" + dids);
				req.setId(id);
				req.setVoltage(voltage);
				req.setDid(dids);
				req.setStatus(status);
				pojo.setRequestlogList(id, req);
			}
			return pojo;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public int sendData(Integer id, int status) {
		Connection conn = this.getConnection();
		String sql = "update requestlog set status = ? where id = ? ";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, status);
			pstmt.setInt(2, id);
			int result = pstmt.executeUpdate();
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}


}
