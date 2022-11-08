/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import database.JDBCUtil;
import model.Account;

public class AccountDAO implements DAOInterface<Account>{
	
	public static AccountDAO getInstance() {
		return  new AccountDAO();
	}

	@Override
	public int insert(Account t) {
		int ketQua = 0;
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "INSERT INTO Account (fullName, userName, password, role) VALUES (?,?,?,?)";
			System.out.println(t);
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getFullName());
			pst.setString(2, t.getUser());
			pst.setString(3, t.getPassword());
			pst.setString(4, t.getRole());
			//Buoc 4 thuc thi cau lenh sql
			ketQua = pst.executeUpdate();
			//Buoc 5 Xu ly
			System.out.println("Ban da thuc thi cau lenh: "+sql);
			System.out.println("So dong bi thay doi: "+ketQua);
			//Buoc 6 ngat ket noi den voi co so du lieu
			JDBCUtil.closeConnection(con);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public int update(Account t) {
		int ketQua = 0;
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "UPDATE Account SET fullName=?, password=?, role=? WHERE userName=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getFullName());
			pst.setString(2, t.getPassword());
			pst.setString(3, t.getRole());
			pst.setString(4, t.getUser());
			ketQua = pst.executeUpdate();
			System.out.println("Ban da thuc thi cau lenh: "+sql);
			System.out.println("So dong bi thay doi "+ketQua);
			JDBCUtil.closeConnection(con);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public int delete(Account t) {
		int ketQua = 0;
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "DELETE FROM Account WHERE userName=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getUser());
			ketQua = pst.executeUpdate();
			System.out.println("Ban da thuc thi cau lenh "+sql);
			System.out.println("So dong bi thay doi: "+ketQua);
			JDBCUtil.closeConnection(con);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public ArrayList<Account> selectAll() {
		ArrayList<Account> ketQua = new ArrayList<Account>();
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "SELECT * FROM Account";
			PreparedStatement pst = con.prepareStatement(sql);
			System.out.println("Thuc thi cau lenh: "+sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String fullName = rs.getString("fullName");
				String userName = rs.getString("userName");
				String password = rs.getString("password");
				String role = rs.getString("role");
				
				Account acc = new Account(fullName, userName, password, role);
				ketQua.add(acc);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public Account selectById(Account t) {
		Account acc = null;
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "SELECT * FROM WHERE userName=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getUser());
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String fullName = rs.getString("fullName");
				String userName = rs.getString("userName");
				String password = rs.getString("password");
				String role = rs.getString("role");
				
				acc = new Account(fullName, userName, password, role);
			}
			JDBCUtil.closeConnection(con);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return acc;
	}	
}
