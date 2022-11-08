/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import database.JDBCUtil;
import model.Phieu;

public class PhieuDAO implements DAOInterface<Phieu>{
        
        public static PhieuDAO getInstance(){
            return new PhieuDAO();
        }
        
	@Override
	public int insert(Phieu t) {
		int ketQua = 0;
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "INSERT INTO Phieu (maPhieu, thoiGianTao, nguoiTao, nguoiGiao, nguoiNhan, loaiPhieu,maNhaCungCap) VALUES (?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getMaPhieu());
			pst.setDate(2, t.getThoiGianTao());
			pst.setString(3, t.getNguoiTao());
			pst.setString(4, t.getNguoiGiao());
			pst.setString(5, t.getNguoiNhan());
			pst.setString(6, t.getLoaiPhieu());
                        pst.setString(7, t.getMaNhaCungCap());
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
	public int update(Phieu t) {
		int ketQua = 0;
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "UPDATE Phieu SET (maPhieu=?, thoiGianTao=?, nguoiTao=?, nguoiGiao=?, nguoiNhan=?, loaiPhieu=?, maNhaCungCap=?) WHERE t=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getMaPhieu());
			pst.setDate(2, t.getThoiGianTao());
			pst.setString(3, t.getNguoiTao());
			pst.setString(4, t.getNguoiGiao());
			pst.setString(5, t.getNguoiNhan());
			pst.setString(6, t.getLoaiPhieu());
                        pst.setString(7, t.getMaNhaCungCap());
			pst.setString(8, t.getMaPhieu());
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
	public int delete(Phieu t) {
		int ketQua = 0;
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "DELETE FROM Phieu WHERE t=?";
			PreparedStatement pst = con.prepareStatement(sql);
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
	public ArrayList<Phieu> selectAll() {
		ArrayList<Phieu> ketQua = new ArrayList<Phieu>();
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "SELECT * FROM Phieu";
			PreparedStatement pst = con.prepareStatement(sql);
			System.out.println("Thuc thi cau lenh: "+sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maPhieu = rs.getString("maPhieu");
				Date thoiGianTao = rs.getDate("thoiGianTao");
				String nguoiTao = rs.getString("nguoiTao");
				String nguoiGiao = rs.getString("nguoiGiao");
				String nguoiNhan = rs.getString("nguoiNhan");
				String loaiPhieu = rs.getString("loaiPhieu");
                                String maNhaCungCap = rs.getString("maNhaCungCap");
				Phieu p = new Phieu(maPhieu, thoiGianTao, nguoiTao, nguoiNhan, nguoiGiao, loaiPhieu,maNhaCungCap);
				ketQua.add(p);		
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public Phieu selectById(Phieu t) {
		Phieu ketQua = null;
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "SELECT * FROM Phieu WHERE maPhieu=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getMaPhieu());
			System.out.println("Thuc thi cau lenh: "+sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maPhieu = rs.getString("maPhieu");
				Date thoiGianTao = rs.getDate("thoiGianTao");
				String nguoiTao = rs.getString("nguoiTao");
				String nguoiGiao = rs.getString("nguoiGiao");
				String nguoiNhan = rs.getString("nguoiNhan");
				String loaiPhieu = rs.getString("loaiPhieu");
                                String maNhaCungCap = rs.getString("maNhaCungCap");
				ketQua = new Phieu(maPhieu, thoiGianTao, nguoiTao, nguoiNhan, nguoiGiao, loaiPhieu,maNhaCungCap);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ketQua;
	}
}

