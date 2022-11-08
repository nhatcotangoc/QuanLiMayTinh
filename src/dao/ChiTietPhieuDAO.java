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
import model.ChiTietPhieu;
import model.ChiTietPhieu;
import model.Phieu;

public class ChiTietPhieuDAO implements DAOInterface<ChiTietPhieu>{
	public static ChiTietPhieuDAO getInstance() {
		return new ChiTietPhieuDAO();
	}

	@Override
	public int insert(ChiTietPhieu t) {
		int ketQua = 0;
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "INSERT INTO ChiTietPhieu (maPhieu, maMay, soLuong) VALUES (?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getMaPhieu());
			pst.setString(2, t.getMaMay());
			pst.setInt(3, t.getSoLuong());
			ketQua = pst.executeUpdate();
			System.out.println("So dong bi thay doi : "+ketQua);
			JDBCUtil.closeConnection(con);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public int update(ChiTietPhieu t) {
		int ketQua = 0;
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "UPDATE ChiTietPhieu SET maPhieu=?, maMay=?, soLuong=? WHERE maPhieu=? AND maMay=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getMaPhieu());
			pst.setString(2, t.getMaMay());
			ketQua = pst.executeUpdate();
			System.out.println("So dong bi thay doi : "+ketQua);
			JDBCUtil.closeConnection(con);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public int delete(ChiTietPhieu t) {
		int ketQua = 0;
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "DELETE FROM ChiTietPhieu WHERE maPhieu=? AND maMay=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getMaPhieu());
			pst.setString(2, t.getMaMay());
			ketQua = pst.executeUpdate();
			System.out.println("So dong bi thay doi : "+ketQua);
			JDBCUtil.closeConnection(con);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public ArrayList<ChiTietPhieu> selectAll() {
		ArrayList<ChiTietPhieu> ketQua = new ArrayList<ChiTietPhieu>();
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "SELECT * FROM ChiTietPhieu";
			PreparedStatement pst = con.prepareStatement(sql);
			System.out.println("Thuc thi cau lenh: "+sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maPhieu = rs.getString("maPhieu");
				String maMay = rs.getString("maMay");
				int soLuong = rs.getInt("soLuong");
				ChiTietPhieu ctp = new ChiTietPhieu(maPhieu, maMay, soLuong);
				ketQua.add(ctp);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public ChiTietPhieu selectById(ChiTietPhieu t) {
		ChiTietPhieu ketQua = null;
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "SELECT * FROM ChiTietPhieu WHERE maPhieu=? AND maMay=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getMaPhieu());
			pst.setString(2, t.getMaMay());
			System.out.println("Thuc thi cau lenh: "+sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maPhieu = rs.getString("maPhieu");
				String maMay = rs.getString("maMay");
				int soLuong = rs.getInt("soLuong");
				ketQua = new ChiTietPhieu(maPhieu, maMay, soLuong);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ketQua;
	}


}

