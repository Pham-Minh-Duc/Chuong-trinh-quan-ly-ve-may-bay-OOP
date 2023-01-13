package QuanLyBanVeMayBay;

import java.util.*;
import java.io.*;
//import java.nio.file.*;
//import static java.nio.file.StandardOpenOption.APPEND;

/**
 *
 * @author hung its
 */
public class TaiKhoan {

    private String tenDangNhap;
    private String matKhau;
    private String loaiTaiKhoan;

    //public static ArrayList<TaiKhoan> arrayListTaiKhoan = new ArrayList<TaiKhoan>();
    //public static TaiKhoan tk = new TaiKhoan();
    Scanner s = new Scanner(System.in);
    
    protected List<TaiKhoan> list_user;

    public TaiKhoan() {
        list_user = new ArrayList<>();
    }

    public TaiKhoan(String tenDangNhap, String matKhau, String loaiTaiKhoan) {
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.loaiTaiKhoan = loaiTaiKhoan;
       
    }
    
    public TaiKhoan(List<TaiKhoan> list_user) {
        this.list_user = list_user;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public String getLoaiTaiKhoan() {
        return loaiTaiKhoan;
    }


    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public void setLoaiTaiKhoan(String loaiTaiKhoan) {
        this.loaiTaiKhoan = loaiTaiKhoan;
    }
    
    public void setInfo (){
        System.out.printf("enter usename: ");
        this.setTenDangNhap(s.nextLine());
        System.out.printf("enter password: ");
        this.setMatKhau(s.nextLine());
    }
    
    public void writeFile(BufferedWriter out) throws IOException{
        try {
            out.write(this.getTenDangNhap()+ ";");
            out.write(this.getMatKhau()+ ";");
            out.write(this.getLoaiTaiKhoan()+ ";");
            out.newLine();
        } catch (IOException e) {
            System.out.println("Error in writing ");
        }
    }
    
    public boolean readFile(String s){ 
        if (s!=null){
            String[] inp = s.split(";");
            this.setTenDangNhap(inp[0]);
            this.setMatKhau(inp[1]);
            this.setLoaiTaiKhoan(inp[2]);
            return true;
        }
        return false;
    }

//    public void create(){
//        try {
//            Path path = Paths.get(filename.toString());
//            OutputStream output = new BufferedOutputStream(Files.newOutputStream(path, APPEND));
//            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
//            
//            InputStream input = Files.newInputStream(path);
//            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
//            
//            
//            System.out.println("Enter username: ");
//            tk.setTenDangNhap(s.nextLine());
//            String _temp = null;
//            String _user;
//            boolean found = false;
//            while((_temp = reader.readLine()) != null){
//                String[] account = _temp.split(",");
//                _user = account[0];
//                if(_user.equals(tk.getTenDangNhap())){
//                    found = true;
//                }
//            }
//            
//            if(found==false){
//                System.out.println("Enter password: ");
//            tk.setMatKhau(s.nextLine());
//                
//                writer.write(tenDangNhap + "," + matKhau);
//            writer.newLine();
//            System.out.println("Access granted!");
//            System.out.println("Account has been successfully saved!");
//            
//            }
//            else{
//                System.out.println("Access denied! Invalid username or password!");
//                System.out.println("Press any key to continue...");
//                String proc = s.nextLine();
//                new TaiKhoan().create();
//            }
//            writer.close();
//            output.close();
//            
////            writer.write(tenDangNhap + "," + matKhau);
////            writer.newLine();
////            System.out.println("Account has been successfully saved!");
////            writer.close();
////            output.close();
//            
//            System.out.println("Press any key to continue...");
//            String proc = s.nextLine();
//            
//            new TaiKhoan().menuLogin();
//        } catch (IOException e) {
//            System.out.print(e.getMessage());
//        }
//    }
//    
//    
//    
//    
//    
//    public void dangNhap(){
//        try {
//            Path path = Paths.get(filename.toString());
//            InputStream input = Files.newInputStream(path);
//            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
//            System.out.println("\n L O G I N \n");
//            System.out.println("Enter username: ");
//            tk.setTenDangNhap(s.nextLine());
//            System.out.println("Enter password: ");
//            tk.setMatKhau(s.nextLine());
//            String _temp = null;
//            String _user;
//            String _pass;
//            boolean found = false;
//            while((_temp = reader.readLine()) != null){
//                String[] account = _temp.split(",");
//                _user = account[0];
//                _pass = account[1];
//                if(_user.equals(tk.getTenDangNhap()) && _pass.equals(tk.getMatKhau())){
//                    found = true;
//                }
//            }
//            
//            if(found==true){
//                System.out.println("Access granted!");
//            }
//            else{
//                System.out.println("Access denied! Invalid username or password!");
//                System.out.println("Press any key to continue...");
//                String proc = s.nextLine();
//                new TaiKhoan().dangNhap();
//            }
//            
//            reader.close();
//            
//            
//            
//        } catch (IOException e) {
//        }
//
//    }
//    
//    public void menuLogin(){
//        try {
//            System.out.println("------------------------------");
//            System.out.println("1. Create user account");
//            System.out.println("2. Login user account");
//            System.out.println("------------------------------");
//            System.out.println("Enter choice: ");
//            String choice = s.nextLine();
//            if(choice.equals("1")){
//                tk.create();
//            }
//            else if(choice.equals("2")){
//                tk.dangNhap();
//            }
//            else{
//                System.out.println("Invalid choice!");
//                System.out.println("Press any key to continue...");
//                String proc = s.nextLine();
//                new TaiKhoan().menuLogin();
//            }
//        } catch (Exception e) {
//            System.out.print(e.getMessage());
//        }
//    }
    
}
