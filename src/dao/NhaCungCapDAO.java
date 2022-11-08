/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.sun.jdi.connect.spi.Connection;
import database.JDBCUtil;
import java.sql.Date;
import java.util.ArrayList;
import model.NhaCungCap;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Phieu;

/**
 *
 * @author kali
 */
public class NhaCungCapDAO implements DAOInterface<NhaCungCap>{
    public static NhaCungCapDAO getInstance(){
        return new NhaCungCapDAO();
    }

    @Override
    public int insert(NhaCungCap t) {
        int ketQua = 0;
		try {
			java.sql.Connection con = JDBCUtil.getConnection();
			String sql = "INSERT INTO NhaCungCap (maNhaCungCap, tenNhaCungCap, Sdt, diaChi) VALUES (?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getMaNhaCungCap());
			pst.setString(2, t.getTenNhaCungCap());
			pst.setString(3, t.getSdt());
			pst.setString(4, t.getDiaChi());
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
    public int update(NhaCungCap t) {
       int ketQua = 0;
		try {
			java.sql.Connection con = JDBCUtil.getConnection();
			String sql = "UPDATE NhaCungCap set (maNhaCungCap, tenNhaCungCap, Sdt, diaChi) VALUES (?,?,?,?) WHERE maNhaCungCap=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getMaNhaCungCap());
			pst.setString(2, t.getTenNhaCungCap());
			pst.setString(3, t.getSdt());
			pst.setString(4, t.getDiaChi());
                        pst.setString(5,t.getMaNhaCungCap());
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
    public int delete(NhaCungCap t) {
        int ketQua = 0;
		try {
			java.sql.Connection con = JDBCUtil.getConnection();
			String sql = "DELETE FROM NhaCungCap WHERE maNhaCungCap=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getMaNhaCungCap());
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
    public ArrayList<NhaCungCap> selectAll() {
       ArrayList<NhaCungCap> ketQua = new ArrayList<NhaCungCap>();
		try {
			java.sql.Connection con = JDBCUtil.getConnection();
			String sql = "SELECT * FROM NhaCungCap";
			PreparedStatement pst = con.prepareStatement(sql);
			System.out.println("Thuc thi cau lenh: "+sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maNhaCungCap = rs.getString("maNhaCungCap");
                                String tenNhaCungCap = rs.getString("tenNhaCungCap");
                                String sdt = rs.getString("Sdt");
				String diaChi = rs.getString("diaChi");
                                NhaCungCap ncc = new NhaCungCap(maNhaCungCap, tenNhaCungCap, sdt, diaChi);
				ketQua.add(ncc);		
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ketQua;
    }

    @Override
    public NhaCungCap selectById(NhaCungCap t) {
      NhaCungCap ketQua = null;
		try {
			java.sql.Connection con = JDBCUtil.getConnection();
			String sql = "SELECT * FROM NhaCungCap WHERE maNhaCungCap=?";
			PreparedStatement pst = con.prepareStatement(sql);
                        pst.setString(1, t.getMaNhaCungCap());
			System.out.println("Thuc thi cau lenh: "+sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maNhaCungCap = rs.getString("maNhaCungCap");
                                String tenNhaCungCap = rs.getString("tenNhaCungCap");
                                String sdt = rs.getString("Sdt");
				String diaChi = rs.getString("diaChi");
                                ketQua = new NhaCungCap(maNhaCungCap, tenNhaCungCap, sdt, diaChi);		
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ketQua; 
    }
}
