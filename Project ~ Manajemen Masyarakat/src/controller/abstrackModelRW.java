/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author unknown
 */
public abstract class abstrackModelRW {
    public abstract rw cariRW(int cari);
    public abstract void insertRW(String nama, String telp, String alamat);
    public abstract void update(int cari,String nama,String alamat,String telp);
    public abstract DefaultTableModel viewTabel();
}
