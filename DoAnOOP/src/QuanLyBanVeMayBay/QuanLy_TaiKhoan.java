package QuanLyBanVeMayBay;

import java.util.*;
import java.io.*;

/**
 *
 * @author hung its
 */
public class QuanLy_TaiKhoan implements Interface{
    protected List<TaiKhoan> list_user;

    private final String File_Users ="./src/DataFile/account.txt";
    
    Scanner gets = new Scanner(System.in);

    public QuanLy_TaiKhoan(List<TaiKhoan> list_user) {
        this.list_user = list_user;
    }
    
    public QuanLy_TaiKhoan() {
        list_user = new ArrayList<>();
    }
    
    public void add_Acc(String loaiTaiKhoan){
        System.out.println("\n=============Create a new Account=============");
        TaiKhoan temp = new TaiKhoan();
        temp.setLoaiTaiKhoan(loaiTaiKhoan);
        do {
            System.out.println("enter usename: ");
            temp.setTenDangNhap(gets.nextLine());
        } while( checkUser(temp.getTenDangNhap()));
        System.out.println("enter password: ");
        temp.setMatKhau(gets.nextLine());
        list_user.add(temp);
    }
        
    public boolean checkUser(String user){
        for (Iterator<TaiKhoan> it = list_user.iterator(); it.hasNext();) {
            TaiKhoan u = it.next();
            if(u.getTenDangNhap().compareToIgnoreCase(user)==0){
                System.out.println("We already have that usename, Pleaze try again");
                return true;
            }
        }
        return false;
    }
    
    public TaiKhoan nhapinfo(){
        TaiKhoan newUser = new TaiKhoan();
        while(true){
            System.out.println("Enter the usename ");
            newUser.setTenDangNhap(gets.nextLine());
            if ( checkUser(newUser.getTenDangNhap()) )
                System.out.println("");
            else
                break;
        }
        newUser.setInfo();
        return newUser;
    }
    
    public boolean add(TaiKhoan u){
        if( checkUser(u.getTenDangNhap()) )
            return false;
        list_user.add(u);
        return true;
    }
    
    public boolean delete(String user){
        for (Iterator<TaiKhoan> it = list_user.iterator(); it.hasNext();) {
            TaiKhoan u = it.next();
            if(u.getTenDangNhap().compareToIgnoreCase(user)==0){
                it.remove();
                return true;
            }
        }
        return false;
    }
    
    public boolean changePass(String id){
        for (Iterator<TaiKhoan> it = list_user.iterator(); it.hasNext();) {
            TaiKhoan u = it.next();
            if(u.getTenDangNhap().compareToIgnoreCase(id)==0){
                System.out.printf("Enter new password:");
                u.setMatKhau(gets.nextLine());
                return true;
            }
        }
        return false;
    }
    
    //LOL
    public boolean forgetPass(String user){
        for (Iterator<TaiKhoan> it = list_user.iterator(); it.hasNext();) {
            TaiKhoan u = it.next();
            if(u.getTenDangNhap().compareToIgnoreCase(user)==0){
                System.out.printf("Enter new password:");
                u.setMatKhau(gets.nextLine());
                return true;
            }
        }
        return false;
    }
    
    public void deleteAll(){
        list_user.removeAll(list_user);
    }
    
    @Override
    public void writeFile() throws IOException {
        BufferedWriter xuat = new BufferedWriter(new FileWriter(File_Users));
        for ( TaiKhoan a : list_user ) 
            a.writeFile(xuat);
        xuat.close();
    }

    @Override
    public void readFile() throws IOException {
        BufferedReader nhap = null;
        try {
            nhap = new BufferedReader(new FileReader(File_Users));
            String s = null;
            do {
                s = nhap.readLine();
                TaiKhoan u = new TaiKhoan();
                if ( u.readFile(s) )
                    list_user.add(u);
            } while ( s!=null);
            
            nhap.close();
        } catch (Exception e) {
            System.out.println("Something wrong when reading Account file");
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void display(){
        System.out.println(" ____________________________________");
        System.out.println("|   Username        |    position    |");
        for (TaiKhoan a:list_user)
            System.out.printf("|   %-15s  | %-15s |\n",a.getTenDangNhap(),a.getLoaiTaiKhoan());
        System.out.println("|___________________|________________|");
    }

    

    public TaiKhoan log () throws IOException{
        Menu_HOME();
        TaiKhoan temp = new TaiKhoan();
        int k=0;
        do {
            temp.setInfo();
            for (Iterator<TaiKhoan> it = list_user.iterator(); it.hasNext();) {
                TaiKhoan u = it.next();
                if(u.getTenDangNhap().compareToIgnoreCase(temp.getTenDangNhap())==0 && u.getMatKhau().compareToIgnoreCase(temp.getMatKhau())==0){
                   System.out.printf(
                            " _______________________________________________\n" +
                            "|                                               |\n" +
                            "|   Ten: %-10s   CHUCVU: %-7s          |\n" +
                            "|_______________________________________________|\n",u.getTenDangNhap(),u.getLoaiTaiKhoan()
                    );
                    temp = u;
                }
            }   
            if (temp.getLoaiTaiKhoan()==null){
                System.out.println("=================PLeaze try again=================");
                k++;
                if (k==3){
                    k=0;
                }
            }    
        }while(temp.getLoaiTaiKhoan()==null);
        return temp;
    }
    
    public void Menu_HOME(){
        System.out.println(
                " _______________________________________________ \n" +
                "|                                               |\n" +
                "|         WELCOME TO OUR APPLICATION            |\n" +
                "|_______________________________________________|\n" +
                "|                                               |\n" +
                "|                    Login                      |\n" +
                "|_______________________________________________|\n"
        );
    }
    
    public void Menu_END(){
        System.out.println(
                " _______________________________________________ \n" +
                "|                                               |\n" +
                "|      THANKS FOR USING OUR APPLICATION         |\n" +
                "|                                               |\n" +
                "|                                               |\n" +
                "|     MERRY CHRISTMAS AND HAPPY NEW YEAR        |\n" +
                "|_______________________________________________|");
    }

    @Override
    public void sort() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
