/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

public class ChiTietPhieu {
	private String maPhieu;
	private String maMay;
	private int soLuong;
	public ChiTietPhieu() {
		super();
	}

	public ChiTietPhieu(String maPhieu, String maMay, int soLuong) {
		super();
		this.maPhieu = maPhieu;
		this.maMay = maMay;
		this.soLuong = soLuong;
	}

	public String getMaPhieu() {
		return maPhieu;
	}

	public void setMaPhieu(String maPhieu) {
		this.maPhieu = maPhieu;
	}

	public String getMaMay() {
		return maMay;
	}

	public void setMaMay(String maMay) {
		this.maMay = maMay;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	@Override
	public int hashCode() {
		return Objects.hash(maMay, maPhieu, soLuong);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChiTietPhieu other = (ChiTietPhieu) obj;
		return Objects.equals(maMay, other.maMay) && Objects.equals(maPhieu, other.maPhieu) && soLuong == other.soLuong;
	}

	@Override
	public String toString() {
		return "ChiTietPhieu [maPhieu=" + maPhieu + ", maMay=" + maMay + ", soLuong=" + soLuong + "]";
	}
	
	
}
