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
public class DuongBay {
     private String maDuongBay;
     private String maSanBayDi;
     private String masanBayDen;
     private int khoangCach;
     
     public static ArrayList<DuongBay> arrayListDuongBay = new ArrayList<DuongBay>();

    public DuongBay() {
    }

    public DuongBay(String maDuongBay, String maSanBayDi, String masanBayDen, int khoangCach) {
        this.maDuongBay = maDuongBay;
        this.maSanBayDi = maSanBayDi;
        this.masanBayDen = masanBayDen;
        this.khoangCach = khoangCach;
    }

    public String getMaDuongBay() {
        return maDuongBay;
    }

    public void setMaDuongBay(String maDuongBay) {
        this.maDuongBay = maDuongBay;
    }

    public String getMaSanBayDi() {
        return maSanBayDi;
    }

    public void setMaSanBayDi(String maSanBayDi) {
        this.maSanBayDi = maSanBayDi;
    }

    public String getMasanBayDen() {
        return masanBayDen;
    }

    public void setMasanBayDen(String masanBayDen) {
        this.masanBayDen = masanBayDen;
    }

    public int getKhoangCach() {
        return khoangCach;
    }

    public void setKhoangCach(int khoangCach) {
        this.khoangCach = khoangCach;
    }
    public String getTenSanBayDi() {
         for (SanBay sb : SanBay.arrayListSanBay) 
            if(sb.getMaSanBay().equals(this.maSanBayDi))
                return sb.getTenSanBay();
         return null;
    }
    public String getTenSanBayDen() {
         for (SanBay sb : SanBay.arrayListSanBay) 
            if(sb.getMaSanBay().equals(this.masanBayDen))
                return sb.getTenSanBay();
         return null;
    }
    
}
