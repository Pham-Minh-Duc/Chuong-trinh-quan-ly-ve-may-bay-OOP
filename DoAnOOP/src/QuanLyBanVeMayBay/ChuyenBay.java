/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanVeMayBay;

import java.util.ArrayList;
import java.util.Date;
import java.sql.Time;

/**
 *
 * @author hung its
 */
public class ChuyenBay {
    public static final int CONVE=0;
    public static final int HETVE=1;
    public static final int HUYCHUYEN=2;
    public static final int HOANTAT=3;
    
    private String maChuyenBay;
    private String SHMB;
    private DuongBay maDuongBay;
    private Date ngayBay;
    private Time gioBay;
    private int trangThai; // 0: còn vé , 1: hết vé ,2: huy chuyến 
    private ArrayList<Ve> arrayListVe = new ArrayList<Ve>();
    
    public static ArrayList<ChuyenBay> arrayListChuyenBay = new ArrayList<ChuyenBay>();

    public ChuyenBay() {
    }

    public ChuyenBay(String maChuyenBay, String SHMB,DuongBay duongBay, Date ngayBay, Time gioBay,int trangThai) {
        this.maChuyenBay = maChuyenBay;
        this.SHMB = SHMB;
        this.maDuongBay = duongBay;
        this.ngayBay = ngayBay;
        this.gioBay = gioBay;
        this.trangThai = trangThai;
        
    }

    public String getMaChuyenBay() {
        return maChuyenBay;
    }

    public void setMaChuyenBay(String maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }

    public String getSHMB() {
        return SHMB;
    }

    public void setSHMB(String SHMB) {
        this.SHMB = SHMB;
    }

    public DuongBay getDuongBay() {
        return maDuongBay;
    }

    public void setDuongBay(DuongBay duongBay) {
        this.maDuongBay = duongBay;
    }

    public Date getNgayBay() {
        return ngayBay;
    }

    public void setNgayBay(Date ngayBay) {
        this.ngayBay = ngayBay;
    }

    public Time getGioBay() {
        return gioBay;
    }

    public void setGioBay(Time gioBay) {
        this.gioBay = gioBay;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai  ;
    }

    public ArrayList<Ve> getArrayListVe() {
        return arrayListVe;
    }

    public void setArrayListVe(ArrayList<Ve> arrayListVe) {
        this.arrayListVe = arrayListVe;
    }
    
     public static DuongBay timDuongBay(String maDuongBay) {
         for (DuongBay db: DuongBay.arrayListDuongBay) {
             if(db.getMaDuongBay().equals(maDuongBay))
                 return db;
         }
        return null;
    }
     public int getSoGhe() {
        for (MayBay mb: MayBay.arrayListMayBay) {
             if(mb.getSHMB().equals(this.SHMB))
                 return mb.getSoGhe();
         }
        return -1;
    }
     
    public int getSoGheTrong() {
        return getSoGhe()-arrayListVe.size();
        }
    
    public java.util.Date getCBTime(){
            return new java.util.Date(this.ngayBay.getYear(), this.ngayBay.getMonth(),this.ngayBay.getDate(),
                               this.gioBay.getHours(), this.gioBay.getMinutes());
    }
    
}
