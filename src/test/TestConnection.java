/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.sql.Connection;
import java.util.ArrayList;

import dao.AccountDAO;
import dao.ChiTietPhieuDAO;
import dao.MayTinhDAO;
import database.JDBCUtil;
import model.Account;
import model.ChiTietPhieu;
import model.MayTinh;
import model.QLMTModel;

public class TestConnection {
	public static void main(String[] args) {
		    QLMTModel model = new QLMTModel();
                    for (Account acc : model.getDsAcc()) {
                        System.out.println(acc);
                        System.out.println(model.checkAcc("admin", "admin"));
            }
	}
}

