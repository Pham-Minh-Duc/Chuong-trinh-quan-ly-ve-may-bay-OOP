package QuanLyBanVeMayBay;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hung its
 */
public class QuanLy_NhanVien implements Interface{
    protected List<NhanVien> list_emp;
    
    private final String File_Employee ="./src/DataFile/nhanvien.txt";
    
    Scanner cin = new Scanner(System.in);
    Scanner gets = new Scanner(System.in);
    
    //bo khoi tao
    public QuanLy_NhanVien(List<NhanVien> list_emp) {
        this.list_emp = list_emp;
    }
    
    public QuanLy_NhanVien() {
        list_emp=new ArrayList<>();
    }
    
//    //them nhanvien 1 cach bt
//    public String addEmp(NhanVien e){
//        list_emp.add(e);
//        return e.getId();
//    }
    
    //kiem tra su ton tai cua id , id la duy nhat
    public boolean check_existUsername(String id){
        for (Iterator<NhanVien> it = list_emp.iterator(); it.hasNext();) {
            NhanVien e = it.next();
            if(e.getTenDangNhap().compareToIgnoreCase(id)==0){
                System.out.println("We already have that id, Pleaze try again");
                return true;
            }
        }
        return false;
    }
    
    //them nhan vien
    public boolean addEmployee(NhanVien e){
        // 1 nhan vien chi co 1 id
        // id la khoa chinh
        if( check_existUsername(e.getTenDangNhap()) )
            return false;
        list_emp.add(e);
        return true;
    }
    
    //xoa nhan vien
    public boolean deleteEmployee(String id){
        for (Iterator<NhanVien> it = list_emp.iterator(); it.hasNext();) {
            NhanVien e = it.next();
            if(e.getTenDangNhap().compareToIgnoreCase(id)==0){
                it.remove();
                return true;
            }
        }
        return false;
    }
    
    //xoa tat ca nhan vien
    public void deleteAll(){
        list_emp.removeAll(list_emp);
    }
    
    //sua thong tin nhan vien
    public boolean editEmployee(String name){
         for (Iterator<NhanVien> it = list_emp.iterator(); it.hasNext();) {
            NhanVien emp = it.next();
            if(emp.getName().compareToIgnoreCase(name)==0){
                emp.setInfo();
                return true;
            }
        }
        return false;
    }
    
//    public String getPosition(String id){
//        for (Iterator<NhanVien> it = list_emp.iterator(); it.hasNext();) {
//            NhanVien e = it.next();
//            if(e.getTenDangNhap().compareToIgnoreCase(id)==0){
//                return e.getChucVu();
//            }
//        }
//        return null;
//    }
    
    //kiem tra so luong nhan vien
    public int check_in(){
        int i=0;
        for ( NhanVien a : list_emp ) {
            return 1;
        }
        return 0;
    }
    
    //dem so luong nhan su
    public int count(){
        int i=0;
        for ( NhanVien a : list_emp ) {
            i++;
        }
        return i;
    }
    
    //tim nhan vien theo id
    public boolean findEmployeebyUsername(String id){
        for (Iterator<NhanVien> it = list_emp.iterator(); it.hasNext();) {
            NhanVien e = it.next();
            if(e.getTenDangNhap().compareToIgnoreCase(id)==0){
                e.display();
                return true;
            }
        }
        return false;
    }
    
    //tim nhan vien theo ten
    public boolean findEmployeebyName(String name){
        System.out.println(" _____________________________________________________________________________________________________________________________________________");
        //                              1                 2            3            4               5              6               7             8              9            
        System.out.println("|    TEN DANG NHAP    |   HO VA TEN   |   TUOI   |   GIOI TINH  |    CHUC VU    |     SDT     |     PHUONG    |     QUAN     |    THANH_PHO   |");
        System.out.println("|_____________________|_______________|__________|______________|_______________|_____________|_______________|______________|________________|");
        int k=0;
        for (Iterator<NhanVien> it = list_emp.iterator(); it.hasNext();) {
            NhanVien e = it.next();
            if(e.getName().compareToIgnoreCase(name)==0){
                System.out.printf( 
                        //   1     2       3     4         5        6      7      8       9    10        11
                    "| %-20s| %-14s|  %-8d|     %-8s | %-14s|  %-9s| %-14s| %-13s| %-15s| \n"
                        , e.getTenDangNhap(), e.getName() 
                        , e.getAge() , e.getGender()
                        , e.getChucVu() , e.getSDT() 
                        , e.getNew_DiaChi().getWard()
                        , e.getNew_DiaChi().getDistrict()
                        , e.getNew_DiaChi().getCity()
                );
                k++;
            }
        }
        System.out.println("|_____________________|_______________|__________|______________|_______________|_____________|_______________|______________|________________|");
        System.out.println("");
       
        if (k!=0 ) return true;
        return false;
    }
    
    //tim nhan vien theo gioi tinh
    public boolean findEmployeebyGender(String gender){
        System.out.println(" _____________________________________________________________________________________________________________________________________________");
        //                              1                 2            3            4               5              6               7             8              9            
        System.out.println("|    TEN DANG NHAP    |   HO VA TEN   |   TUOI   |   GIOI TINH  |    CHUC VU    |     SDT     |     PHUONG    |     QUAN     |    THANH_PHO   |");
        System.out.println("|_____________________|_______________|__________|______________|_______________|_____________|_______________|______________|________________|");
        int k=0;
        for (Iterator<NhanVien> it = list_emp.iterator(); it.hasNext();) {
            NhanVien e = it.next();
            if(e.getGender().compareToIgnoreCase(gender)==0){
                System.out.printf( 
                        //   1     2       3     4         5        6      7      8       9    10        11
                    "| %-20s| %-14s|  %-8d|     %-8s | %-14s|  %-9s| %-14s| %-13s| %-15s| \n"
                        , e.getTenDangNhap(), e.getName() 
                        , e.getAge() , e.getGender()
                        , e.getChucVu() , e.getSDT() 
                        , e.getNew_DiaChi().getWard()
                        , e.getNew_DiaChi().getDistrict()
                        , e.getNew_DiaChi().getCity()
                );
                k++;
            }
        }
        System.out.println("|_____________________|_______________|__________|______________|_______________|_____________|_______________|______________|________________|");
        System.out.println("");
        
        
        if (k!=0 ) return true;
        return false;
    }
    
    
    
    public void display(){
        System.out.println(" _____________________________________________________________________________________________________________________________________________");
        //                         1          2            3           4               5            6           7                 8              9               10         11
        System.out.println("|    TEN DANG NHAP    |   HO VA TEN   |   TUOI   |   GIOI TINH  |    CHUC VU    |     SDT     |     PHUONG    |     QUAN     |    THANH_PHO   |");
        System.out.println("|_____________________|_______________|__________|______________|_______________|_____________|_______________|______________|________________|");
        
        for (Iterator<NhanVien> it = list_emp.iterator(); it.hasNext() ; ) {
            NhanVien e = it.next();
            //System.out.println(e.toString());
            System.out.printf( 
                     //   1     2       3     4         5        6      7      8       9    10        11
                    "| %-20s| %-14s|  %-8d|     %-8s | %-14s|  %-9s| %-14s| %-13s| %-15s| \n"
                    , e.getTenDangNhap(), e.getName() 
                    , e.getAge() , e.getGender()
                    , e.getChucVu(), e.getSDT()  
                    , e.getNew_DiaChi().getWard()
                    , e.getNew_DiaChi().getDistrict()
                    , e.getNew_DiaChi().getCity()
            );
        }
        System.out.println("|_____________________|_______________|__________|______________|_______________|_____________|_______________|______________|________________|");
        System.out.println("");
    }
    
    @Override
    public void writeFile() throws IOException{
        
        BufferedWriter out_Full = new BufferedWriter(new FileWriter(File_Employee));
        for ( NhanVien a : list_emp ) {
            //viet tung thanh phan cua list
                a.writeFile(out_Full);
        }
        out_Full.close();
    }
    
    @Override
    public void readFile() throws IOException{
        
        BufferedReader inp_Full = null;
        try {
            inp_Full = new BufferedReader(new FileReader(File_Employee));
            String s = null;
            do {
                //doc tung dong
                s = inp_Full.readLine();
                NhanVien a = new NhanVien();
                if ( a.readFile(s) )
                    addEmployee(a);
            } while ( s!=null);
            
            inp_Full.close();
        } catch (Exception e) {
            System.out.println("Something wrong when reading Emp_Full file");
        }
    }
    
    @Override
    public void sort(){
        System.out.println("Which sort?     \n"
                + "1.Sort by Name           \n"
                + "2.Sort by Age            \n"
                + "3.Sort by Username             \n"
                + "4.Sort by Gender         \n");
        int k = cin.nextInt();
        switch( k ){
            case 1:
                //sap xep theo ten
                System.out.println("1.Ascending\n"
                        + "2.Decrease\n");
                k = cin.nextInt();
                sortbyName(k-1);
                break;
            case 2:
                //sap xep theo tuoi
                System.out.println("1.Ascending\n"
                        + "2.Decrease\n");
                k = cin.nextInt();
                sortbyAge(k-1);
                break;
            case 3:
                //sap xep theo id
                System.out.println("1.Ascending\n"
                        + "2.Decrease\n");
                k = cin.nextInt();
                sortbyUsername(k-1);
                break;
            case 4:
                //sap xep theo gioi tinh
                System.out.println("1.Male\n"
                        + "2.FeMale\n");
                k = cin.nextInt();
                sortbyGender(k-1);
                break;
        }
        display();
    }
     
    //cac ham sap xep
    public void sortbyName(int k){
        //sap xep theo ten sach tu a-z
        if ( k==0 ){
            Collections.sort(list_emp, NhanVien::NameTangdan);
        }
        //tu z-a
        else{
            Collections.sort(list_emp, NhanVien::NameGiamdan);
        }
    }
    public void sortbyUsername(int k){
        //sap xep theo so tu nho toi lon
        if ( k==0 ){
            Collections.sort(list_emp, NhanVien::TenDangNhapTangdan);
        }
        //tu lon toi nho
        else{
            Collections.sort(list_emp, NhanVien::TenDangNhapGiamdan);
        }
    }
    public void sortbyAge(int k){
        //sap xep theo so tu nho toi lon
        if ( k==0 ){
            Collections.sort(list_emp, NhanVien::AgeTangdan);
        }
        //tu lon toi nho
        else{
            Collections.sort(list_emp, NhanVien::AgeGiamdan);
        }
    }
    public void sortbyGender(int k){
        //Nam
        if ( k==0 ){
            Collections.sort(list_emp , NhanVien::Nam);
        }
        else {
            Collections.sort(list_emp , NhanVien::Nu);
        }
    }
    
}
