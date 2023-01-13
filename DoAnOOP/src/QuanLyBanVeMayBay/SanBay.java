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
public class SanBay {
      private String maSanBay;
      private String tenSanBay;
      private String diaDiem;
      
      public static ArrayList<SanBay> arrayListSanBay= new ArrayList<SanBay>();

    public SanBay() {
    }

    public SanBay(String maSanBay, String tenSanBay, String diaDiem) {
        this.maSanBay = maSanBay;
        this.tenSanBay = tenSanBay;
        this.diaDiem = diaDiem;
    }

    public String getMaSanBay() {
        return maSanBay;
    }

    public void setMaSanBay(String maSanBay) {
        this.maSanBay = maSanBay;
    }

    public String getTenSanBay() {
        return tenSanBay;
    }

    public void setTenSanBay(String tenSanBay) {
        this.tenSanBay = tenSanBay;
    }

    public String getDiaDiem() {
        return diaDiem;
    }

    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }
    
}
