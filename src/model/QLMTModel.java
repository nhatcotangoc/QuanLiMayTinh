/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dao.AccountDAO;
import dao.ChiTietPhieuDAO;
import dao.MayTinhDAO;
import dao.NhaCungCapDAO;
import dao.PhieuDAO;
import java.util.ArrayList;

public class QLMTModel {
	private ArrayList<Account> dsAcc;
	private ArrayList<ChiTietPhieu> dsChiTietPhieu;
	private ArrayList<MayTinh> dsMayTinh;
	private ArrayList<Phieu> dsPhieu;
        private ArrayList<NhaCungCap> dsNhaCungCap;
	
	public QLMTModel() {
		dsAcc = new ArrayList<Account>();
		dsChiTietPhieu = new ArrayList<ChiTietPhieu>();
		dsMayTinh = new ArrayList<MayTinh>();
		dsPhieu = new ArrayList<Phieu>();
                dsNhaCungCap = new ArrayList<NhaCungCap>();
	}
	//Account
	
	public ArrayList<Account> getDsAcc(){
		return dsAcc;
	}
	
	public void setDsAcc(ArrayList<Account> dsAcc) {
		this.dsAcc = dsAcc;
	}
	
	public void insertAccount(Account acc) {
		this.dsAcc.add(acc);
	}
	
	public void delete(Account acc) {
		this.dsAcc.remove(acc);
	}
	
	public void update(Account acc) {
		this.dsAcc.remove(acc);
		this.dsAcc.add(acc);
	}
	
	public boolean checkAcc(String userName, String password) {
		for (Account account : dsAcc) {
                       System.out.println(account.getUser());
			if(account.getUser().equals(userName) && account.getPassword().equals(password)){
                            return true;
                        }
                        
                    }
                return false;
	}
		
	
	// CTPhieu
	
	public ArrayList<ChiTietPhieu> getDsChiTietPhieu(){
		return dsChiTietPhieu;
	}
	
	public void setdsChiTietPhieu(ArrayList<ChiTietPhieu> dsChiTietPhieu) {
		this.dsChiTietPhieu = dsChiTietPhieu;
	}
	
	public void insertChiTietPhieu(ChiTietPhieu ctp) {
		this.dsChiTietPhieu.add(ctp);
	}
	
	public void deleteChiTietPhieu(ChiTietPhieu ctp) {
		this.dsChiTietPhieu.remove(ctp);
	}
	
	public void update(ChiTietPhieu ctp) {
		this.dsChiTietPhieu.remove(ctp);
		this.dsChiTietPhieu.add(ctp);
	}
	
	public boolean checkChiTietPhieu(ChiTietPhieu ctp) {
		for (ChiTietPhieu chiTietPhieu : dsChiTietPhieu) {
			if(ctp.getMaMay().equals(chiTietPhieu.getMaMay())&&ctp.getMaPhieu().equals(chiTietPhieu.getMaPhieu())) {
				return true;
			}
		}
		return false;
	}
	
	// Phieu
	
	public void setDsPhieu(ArrayList<Phieu> dsPhieu) {
		this.dsPhieu = dsPhieu;
	}
	
	public ArrayList<Phieu> getDsPhieu() {
		return dsPhieu;
	}
	
	public void insertPhieu(Phieu phieu) {
		this.dsPhieu.add(phieu);
	}
	
	public void deletePhieu(Phieu phieu) {
		this.dsPhieu.remove(phieu);
	}
	
	public void updatePhieu(Phieu phieu) {
		this.dsPhieu.remove(phieu);
		this.dsPhieu.add(phieu);
	}
	
	public boolean checkPhieu(Phieu phieu) {
		for (Phieu p : dsPhieu) {
			if(phieu.getMaPhieu().equals(p.getMaPhieu())) {
				return true;
			}
		}
		return false;
	}
	
	//May tinh
	public ArrayList<MayTinh> getDsMayTinh() {
		return dsMayTinh;
	}

	public void setDsMayTinh(ArrayList<MayTinh> dsMayTinh) {
		this.dsMayTinh = dsMayTinh;
	}
	
	public void insertMayTinh(MayTinh mt) {
		this.dsMayTinh.add(mt);
	}
	
	public void deleteMayTinh(MayTinh mt) {
		this.dsMayTinh.remove(mt);
	}
	
	public void updateMayTinh(MayTinh mt) {
		this.dsMayTinh.remove(mt);
		this.dsMayTinh.add(mt);
	}
	
	public boolean checkMayTinh(MayTinh mt) {
		for(MayTinh mayTinh : dsMayTinh) {
			if(mt.getMaMay().equals(mayTinh.getMaMay())){
				return true;
			}
		}
		return false;
	}
	//Nha cung cap

        public ArrayList<NhaCungCap> getDsNhaCungCap() {
            return dsNhaCungCap;
        }   

        public void setDsNhaCungCap(ArrayList<NhaCungCap> dsNhaCungCap) {
            this.dsNhaCungCap = dsNhaCungCap;
        }
        
        public void insertNhaCungCap(NhaCungCap ncc){
            this.dsNhaCungCap.add(ncc);
        }
        
        public void deleteNhaCungCap(NhaCungCap ncc){
            this.dsNhaCungCap.remove(ncc);
        }
        
        public void updateNhaCungCap(NhaCungCap ncc){
            this.dsNhaCungCap.remove(ncc);
            this.dsNhaCungCap.add(ncc);
        }
        
        public boolean checkNhaCungCap(NhaCungCap ncc){
            for (NhaCungCap nhaCungCap : dsNhaCungCap) {
                if(nhaCungCap.getMaNhaCungCap().equals(ncc.getMaNhaCungCap())){
                    return true;
                }
            }
            return false;
        }
       
}

