/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

public class MayTinh {
	private String maMay;
	private String tenMay;
	private int soLuong;
	private String tenCpu;
	private String ram;
	private String cardManHinh;
	private double gia;
	private String mainBoard;
	private int congXuatNguon;
	private String loaiMay;
	public MayTinh() {
		super();
	}

	public MayTinh(String maMay, String tenMay, int soLuong, String tenCpu, String ram, String cardManHinh, double gia,
			String mainBoard, int congXuatNguon, String loaiMay) {
		super();
		this.maMay = maMay;
		this.tenMay = tenMay;
		this.soLuong = soLuong;
		this.tenCpu = tenCpu;
		this.ram = ram;
		this.cardManHinh = cardManHinh;
		this.gia = gia;
		this.mainBoard = mainBoard;
		this.congXuatNguon = congXuatNguon;
		this.loaiMay = loaiMay;
	}

	public String getMaMay() {
		return maMay;
	}

	public void setMaMay(String maMay) {
		this.maMay = maMay;
	}

	public String getTenMay() {
		return tenMay;
	}

	public void setTenMay(String tenMay) {
		this.tenMay = tenMay;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getTenCpu() {
		return tenCpu;
	}

	public void setTenCpu(String tenCpu) {
		this.tenCpu = tenCpu;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getCardManHinh() {
		return cardManHinh;
	}

	public void setCardManHinh(String cardManHinh) {
		this.cardManHinh = cardManHinh;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}

	public String getMainBoard() {
		return mainBoard;
	}

	public void setMainBoard(String mainBoard) {
		this.mainBoard = mainBoard;
	}

	public int getCongXuatNguon() {
		return congXuatNguon;
	}

	public void setCongXuatNguon(int congXuatNguon) {
		this.congXuatNguon = congXuatNguon;
	}

	public String getLoaiMay() {
		return loaiMay;
	}

	public void setLoaiMay(String loaiMay) {
		this.loaiMay = loaiMay;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cardManHinh, congXuatNguon, gia, loaiMay, maMay, mainBoard, ram, soLuong, tenCpu, tenMay);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MayTinh other = (MayTinh) obj;
		return Objects.equals(cardManHinh, other.cardManHinh) && congXuatNguon == other.congXuatNguon
				&& Double.doubleToLongBits(gia) == Double.doubleToLongBits(other.gia)
				&& Objects.equals(loaiMay, other.loaiMay) && Objects.equals(maMay, other.maMay)
				&& Objects.equals(mainBoard, other.mainBoard) && Objects.equals(ram, other.ram)
				&& soLuong == other.soLuong && Objects.equals(tenCpu, other.tenCpu)
				&& Objects.equals(tenMay, other.tenMay);
	}

	@Override
	public String toString() {
		return "MayTinh [maMay=" + maMay + ", tenMay=" + tenMay + ", soLuong=" + soLuong + ", tenCpu=" + tenCpu
				+ ", ram=" + ram + ", cardManHinh=" + cardManHinh + ", gia=" + gia + ", mainBoard=" + mainBoard
				+ ", congXuatNguon=" + congXuatNguon + ", loaiMay=" + loaiMay + "]";
	}
	
	
}

