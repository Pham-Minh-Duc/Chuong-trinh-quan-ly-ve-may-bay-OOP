package QuanLyBanVeMayBay;

import java.io.BufferedWriter;
import java.io.IOException;

/**
 *
 * @author hung its
 */
public class NhanVien extends ConNguoi{
    
    private String tenDangNhap;
    private String chucVu;    //chuc vu
    private String SDT;

    public NhanVien() {
    }

    public NhanVien(String tenDangNhap, String chucVu, String SDT, String name, int age, String gender, DiaChi new_DiaChi) {
        super(name, age, gender, new_DiaChi);
        this.tenDangNhap = tenDangNhap;
        this.chucVu = chucVu;
        this.SDT = SDT;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
    
    //Lay thong tin nguoi di lam
    @Override
    public void setInfo(){
        //nhap thong tin ve nguoi
        //goi ham nhap tu superclass (Person)
        super.setInfo();
        //nhap thong tin cua nguoi di lam
        //System.out.println("Enter the id ");
       // this.setId(gets.nextLine());
        System.out.println("Enter the id_room ");
        this.setTenDangNhap(cin.nextLine());
        System.out.println("Enter the salary ");
        this.setChucVu(cdou.nextLine());
        System.out.println("Enter the position ");
        this.setSDT(gets.nextLine());
    }
    
    public void display(){
        System.out.println(" _____________________________________________________________________________________________________________________________________________");
        //                              1                 2            3            4               5              6               7             8              9            
        System.out.println("|    TEN DANG NHAP    |   HO VA TEN   |   TUOI   |   GIOI TINH  |    CHUC VU    |     SDT     |     PHUONG    |     QUAN     |    THANH_PHO   |");
        System.out.println("|_____________________|_______________|__________|______________|_______________|_____________|_______________|______________|________________|");
        System.out.printf( 
            //   1     2       3     4         5        6      7      8       9    10        11
                    "| %-12s| %-14s|  %-8d|     %-8s | %-14s|  %-9s| %-14s| %-13s| %-15s| \n"
            , this.getTenDangNhap(), super.getName()             // 1   2
            , super.getAge() , super.getGender()        // 3   4
            , this.getChucVu(),this.getSDT()// 5    6
            , super.getNew_DiaChi().getWard()                  // 7  
            , super.getNew_DiaChi().getDistrict()              // 8   
            , super.getNew_DiaChi().getCity()                  // 9
        );
        System.out.println("|_____________________|_______________|__________|______________|_______________|_____________|_______________|______________|________________|");
        System.out.println("");
    }
    
    public void writeFile(BufferedWriter out) throws IOException{
        try {
            // khi viet file viet them dau | vao giua
            out.write(super.getName() + ";");
            out.write(String.valueOf(super.getAge()) + ";");
            out.write(super.getGender() + ";");
            out.write(super.getNew_DiaChi().getWard() + ";");
            out.write(super.getNew_DiaChi().getDistrict() + ";");
            out.write(super.getNew_DiaChi().getCity() + ";");
            out.write(this.getTenDangNhap()+ ";");
            out.write(this.getChucVu()+ ";");  
            out.write(this.getSDT()+ ";");
            out.newLine();
        } catch (IOException e) {
            System.out.println("Error in writing ");
        }
    }
    
    public boolean readFile(String s){ 
        if (s!=null){
            // khi doc file doc toi dau |
            String[] inp = s.split(";");
            super.setName(inp[0]);
            super.setAge( Integer.parseInt( inp[1] ) );
            super.setGender(inp[2]);
            super.setNew_DiaChi(new DiaChi(inp[3],inp[4],inp[5]));
            this.setTenDangNhap(inp[6]);
            this.setChucVu((inp[7]));
            this.setSDT(inp[8]);
            return true;
        }
        return false;
    }
    
    //cac ham so sanh
    //so sanh ten
    public static int NameTangdan(NhanVien a, NhanVien b){
        return a.getName().compareTo(b.getName());
    }
    public static int NameGiamdan(NhanVien a, NhanVien b){
        return b.getName().compareTo(a.getName());
    }
    //so sanh id
    public static int TenDangNhapTangdan(NhanVien a, NhanVien b){
        int x = Integer.parseInt(a.getTenDangNhap());
        int y = Integer.parseInt(b.getTenDangNhap());
        if ( x < y ) {
            return -1;
        } 
        else {
            if (x == y ) {
                return 0;
            }
            else {
                return 1;
            }
        }
    }
    public static int TenDangNhapGiamdan(NhanVien a, NhanVien b){
        int x = Integer.parseInt(a.getTenDangNhap());
        int y = Integer.parseInt(b.getTenDangNhap());
        if ( x > y ) {
            return -1;
        } 
        else {
            if (x == y ) {
                return 0;
            }
            else {
                return 1;
            }
        }
    }
    //so sanh tuoi
    public static int AgeTangdan(NhanVien a, NhanVien b){
        if (a.getAge() < b.getAge()) {
            return -1;
        } 
        else {
            if (a.getAge() == a.getAge()) {
                return 0;
            }
            else {
                return 1;
            }
        }
    }
    public static int AgeGiamdan(NhanVien a, NhanVien b){
        if (a.getAge() > b.getAge()) {
                    return -1;
        } 
        else {
            if (a.getAge() == a.getAge()) {
                return 0;
            }
            else {
                return 1;
            }
        }
    }

    //sap xep theo gioi tinh
    public static int Nam(NhanVien a, NhanVien b){
        return a.getGender().compareTo(b.getGender());
    }
    public static int Nu(NhanVien a, NhanVien b){
        return b.getGender().compareTo(a.getGender());
    }
    
}
