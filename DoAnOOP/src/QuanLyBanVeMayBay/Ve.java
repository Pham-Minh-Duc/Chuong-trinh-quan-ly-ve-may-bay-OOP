/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanVeMayBay;

import java.util.ArrayList;

/**
 *
 * @author hung its
 */
public class Ve {

    private String maChuyenBay;
    private String tenHanhKhach;
    private String sDT;
    private String maGhe;
    
    public static ArrayList<Ve> dsVeChon= new ArrayList<Ve>();
    
    public Ve() {
    }

    public Ve( String maChuyenBay, String tenHanhKhach, String sDT, String maGhe) {
        
        this.maChuyenBay = maChuyenBay;
        this.tenHanhKhach = tenHanhKhach;
        this.sDT = sDT;
        this.maGhe = maGhe;
    }

  

    public String getMaChuyenBay() {
        return maChuyenBay;
    }

    public void setMaChuyenBay(String maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }

    public String getTenHanhKhach() {
        return tenHanhKhach;
    }

    public void setTenHanhKhach(String tenHanhKhach) {
        this.tenHanhKhach = tenHanhKhach;
    }

    public String getsDT() {
        return sDT;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    public String getMaGhe() {
        return maGhe;
    }

    public void setMaGhe(String maGhe) {
        this.maGhe = maGhe;
    }
    
}
