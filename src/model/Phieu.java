/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Objects;

public class Phieu {
	private String maPhieu;
	private Date thoiGianTao;
	private String nguoiTao;
	private String nguoiGiao;
	private String nguoiNhan;
	private String loaiPhieu;
        private String maNhaCungCap;
	public Phieu() {
		super();
	}

    public Phieu(String maPhieu, Date thoiGianTao, String nguoiTao, String nguoiGiao, String nguoiNhan, String loaiPhieu, String maNhaCungCap) {
        this.maPhieu = maPhieu;
        this.thoiGianTao = thoiGianTao;
        this.nguoiTao = nguoiTao;
        this.nguoiGiao = nguoiGiao;
        this.nguoiNhan = nguoiNhan;
        this.loaiPhieu = loaiPhieu;
        this.maNhaCungCap = maNhaCungCap;
    }

	

	public String getMaPhieu() {
		return maPhieu;
	}

	public void setMaPhieu(String maPhieu) {
		this.maPhieu = maPhieu;
	}

	public Date getThoiGianTao() {
		return thoiGianTao;
	}

	public void setThoiGianTao(Date thoiGianTao) {
		this.thoiGianTao = thoiGianTao;
	}

	public String getNguoiTao() {
		return nguoiTao;
	}

	public void setNguoiTao(String nguoiTao) {
		this.nguoiTao = nguoiTao;
	}

	public String getNguoiGiao() {
		return nguoiGiao;
	}

	public void setNguoiGiao(String nguoiGiao) {
		this.nguoiGiao = nguoiGiao;
	}

	public String getLoaiPhieu() {
		return loaiPhieu;
	}

	public void setLoaiPhieu(String loaiPhieu) {
		this.loaiPhieu = loaiPhieu;
	}

	public String getNguoiNhan() {
		return nguoiNhan;
	}

	public void setNguoiNhan(String nguoiNhan) {
		this.nguoiNhan = nguoiNhan;
	}

        public String getMaNhaCungCap() {
            return maNhaCungCap;
        }

        public void setMaNhaCungCap(String maNhaCungCap) {
            this.maNhaCungCap = maNhaCungCap;
        }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.maPhieu);
        hash = 23 * hash + Objects.hashCode(this.thoiGianTao);
        hash = 23 * hash + Objects.hashCode(this.nguoiTao);
        hash = 23 * hash + Objects.hashCode(this.nguoiGiao);
        hash = 23 * hash + Objects.hashCode(this.nguoiNhan);
        hash = 23 * hash + Objects.hashCode(this.loaiPhieu);
        hash = 23 * hash + Objects.hashCode(this.maNhaCungCap);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Phieu other = (Phieu) obj;
        if (!Objects.equals(this.maPhieu, other.maPhieu)) {
            return false;
        }
        if (!Objects.equals(this.nguoiTao, other.nguoiTao)) {
            return false;
        }
        if (!Objects.equals(this.nguoiGiao, other.nguoiGiao)) {
            return false;
        }
        if (!Objects.equals(this.nguoiNhan, other.nguoiNhan)) {
            return false;
        }
        if (!Objects.equals(this.loaiPhieu, other.loaiPhieu)) {
            return false;
        }
        if (!Objects.equals(this.maNhaCungCap, other.maNhaCungCap)) {
            return false;
        }
        return Objects.equals(this.thoiGianTao, other.thoiGianTao);
    }

    @Override
    public String toString() {
        return "Phieu{" + "maPhieu=" + maPhieu + ", thoiGianTao=" + thoiGianTao + ", nguoiTao=" + nguoiTao + ", nguoiGiao=" + nguoiGiao + ", nguoiNhan=" + nguoiNhan + ", loaiPhieu=" + loaiPhieu + ", maNhaCungCap=" + maNhaCungCap + '}';
    }
           
            
	
}

