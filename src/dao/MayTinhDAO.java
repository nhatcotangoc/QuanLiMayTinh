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
import model.MayTinh;

public class MayTinhDAO implements DAOInterface<MayTinh>{
	
	public static MayTinhDAO getInstance() {
		return  new MayTinhDAO();
	}

	@Override
	public int insert(MayTinh t) {
		int ketQua = 0;
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "INSERT INTO MayTinh (maMay, tenMay, soLuong, tenCpu, ram, cardManHinh, gia, mainBoard, congXuatNguon, loaiMay) VALUES (?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getMaMay());
			pst.setString(2, t.getTenMay());
			pst.setInt(3, t.getSoLuong());
			pst.setString(4, t.getTenCpu());
			pst.setString(5,t.getRam());
			pst.setString(6, t.getCardManHinh());
			pst.setDouble(7, t.getGia());
			pst.setString(8, t.getMainBoard());
			pst.setInt(9, t.getCongXuatNguon());
			pst.setString(10, t.getLoaiMay());
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
	public int update(MayTinh t) {
		int ketQua = 0;
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "UPDATE MayTinh SET maMay=?, tenMay=?, soLuong=?, tenCpu=?, ram=?, cardManHinh=?, gia=?, mainBoard=?, congXuatNguon=?, loaiMay=? WHERE maMay=? ";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getMaMay());
			pst.setString(2, t.getTenMay());
			pst.setInt(3, t.getSoLuong());
			pst.setString(4, t.getTenCpu());
			pst.setString(5,t.getRam());
			pst.setString(6, t.getCardManHinh());
			pst.setDouble(7, t.getGia());
			pst.setString(8, t.getMainBoard());
			pst.setInt(9, t.getCongXuatNguon());
			pst.setString(10, t.getLoaiMay());
			pst.setString(11, t.getMaMay());
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
	public int delete(MayTinh t) {
		int ketQua = 0;
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "DELETE FROM MayTinh WHERE maMay=? ";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getMaMay());
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
	public ArrayList<MayTinh> selectAll() {
		ArrayList<MayTinh> ketQua = new ArrayList<MayTinh>();
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "SELECT * FROM MayTinh";
			PreparedStatement pst = con.prepareStatement(sql);
			System.out.println("Thuc thi cau lenh: "+sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maMay = rs.getString("maMay");
				String tenMay  = rs.getString("tenMay");
				int soLuong = rs.getInt("soLuong");
				String tenCpu = rs.getString("tenCpu");
				String ram = rs.getString("ram");
				String cardManHinh = rs.getString("cardManHinh");
				double gia = rs.getDouble("gia");
				String mainBoard = rs.getString("mainBoard");
				int congXuatNguon  = rs.getInt("congXuatNguon");
				String loaiMay = rs.getString("loaiMay");
				MayTinh mt = new MayTinh(maMay, tenMay, soLuong, tenCpu, ram, cardManHinh, gia, mainBoard, congXuatNguon, loaiMay);
				ketQua.add(mt);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public MayTinh selectById(MayTinh t) {
		MayTinh ketQua = null;
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "SELECT * FROM MayTinh WHERE maMay=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getMaMay());
			System.out.println("Thuc thi cau lenh: "+sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maMay = rs.getString("maMay");
				String tenMay  = rs.getString("tenMay");
				int soLuong = rs.getInt("soLuong");
				String tenCpu = rs.getString("tenCpu");
				String ram = rs.getString("ram");
				String cardManHinh = rs.getString("cardManHinh");
				double gia = rs.getDouble("gia");
				String mainBoard = rs.getString("mainBoard");
				int congXuatNguon  = rs.getInt("congXuatNguon");
				String loaiMay = rs.getString("loaiMay");
				ketQua = new MayTinh(maMay, tenMay, soLuong, tenCpu, ram, cardManHinh, gia, mainBoard, congXuatNguon, loaiMay);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ketQua;
	}
	
}

