package QuanLyBanVeMayBay;

import java.io.IOException;

/**
 *
 * @author hung its
 */
public class Main {

    public static void main(String[] args) throws IOException {          
//        TaiKhoan tk = new TaiKhoan();
//        tk.menuLogin();
        QuanLy_TaiKhoan a = new QuanLy_TaiKhoan();
        a.readFile();
        TaiKhoan b = new TaiKhoan();
        b = a.log();
        a.deleteAll();
        Menu.Main(b.getTenDangNhap(),b.getLoaiTaiKhoan());
        a.Menu_END();
    }
    
}
