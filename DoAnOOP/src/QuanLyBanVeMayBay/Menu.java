
package QuanLyBanVeMayBay;

import java.util.*;
import java.io.*;

public class Menu {
    
    public static int k;                            //dung de nhap so
    public static String s;                         //dung de nhap chuoi
    public static String tenDangNhap;                        //dung de luu ten dang nhap
    public static int capbac;                       //cap do tai khoan : giam dan
    public static String exit="khong";
    public static String filename = null;
    static Scanner cin = new Scanner(System.in);
    static Scanner gets = new Scanner(System.in);
//    public static Saraly saraly = new Saraly();
    public static QuanLy_TaiKhoan list_user = new QuanLy_TaiKhoan(); 
    public static QuanLy_NhanVien list_emp = new QuanLy_NhanVien();
//    public static HR_Department list_depar = new  HR_Department();
    
    public static void readFile() throws IOException{
        list_emp.deleteAll();
        list_user.deleteAll();
        //list_depar.deleteAll();
        list_emp.readFile();
        list_user.readFile();
        //list_depar.readFile();
        System.out.println("ReadFile Done");
    }
    
    public static void writeFile() throws IOException{
        list_emp.writeFile();
        list_user.writeFile();
        //list_depar.writeFile();
        System.out.println("WriteFile Done");   
    }
    
    
    
    
//    public static void Process_Depart() throws IOException{
//        Department p = new Department();
//        switch( k ){
//            case 0:
//                exit = "co";
//                break;
//            case 1:
//                //Display list Department
//                list_depar.display();
//                break;
//            case 2:
//                //display your phong ban
//                list_depar.findDepartby_Id(String.valueOf(list_emp.getIdroom_Id(id)));
//                break;
//            case 3:
//                //Add department
//                list_depar.add();
//                break;
//            case 4:
//                //Delete 1 Department 
//                list_depar.display();
//                System.out.println("nhap ma phong: ");
//                s = gets.nextLine();
//                if ( list_depar.deletePB(s) ){
//                    System.out.println("Success");
//                }
//                break;
//            case 5:
//                //Edit information Department
//                do{
//                    System.out.println("Pleaze Enter id");
//                    s = gets.nextLine();
//                }while(!list_depar.searchID(s));
//                System.out.println("Which type? \n"
//                        + "1.id phong           \n"
//                        + "2.name phong         \n"
//                        + "3.id truong phong    \n");
//                k = cin.nextInt();
//                switch (k){
//                    case 1:
//                        String ss;
//                        System.out.println("Enter new id department");
//                        do{ss = gets.nextLine();}while(list_depar.checkMaP(ss));
//                        list_depar.setId(s,ss);
//                        list_emp.setIdRoom(Integer.parseInt(s), Integer.parseInt(ss));
//                        break;
//                    case 2:
//                        System.out.println("Enter new name department");
//                        do{ss = gets.nextLine();}while(ss==null);
//                        list_depar.setName(s,ss);
//                        break;
//                    case 3:
//                        System.out.println("Enter new id boss department");
//                        do{ss = gets.nextLine();}while(ss==null);
//                        list_depar.setName(s,ss);
//                        break;    
//                }
//                break;    
//            case 6:
//                //Sorting Departmnet
//                list_depar.sort();
//                break;
//        }
//    }
    
    public static void Process_Acc() throws IOException{
        switch ( k ){
            case 0:
                exit = "co";
                break;
            case 1:
                //Change your Password
                list_user.changePass(tenDangNhap);
                break;
            case 2:
                //Display list Acc
                list_user.display();
                break;
            case 3:
                //Forget Password
                System.out.printf("Enter username:");
                if ( list_user.forgetPass(gets.nextLine()) )
                    System.out.println("Success");
                else
                    System.out.println("We dont have that username");
                break;
        }
    }
    
    public static void find_emp(){
        //id name gender idroom
        k = cin.nextInt();
        switch ( k-1 ){
            case 0:
                System.out.println("Enter ten dang nhap:");
                if ( list_emp.findEmployeebyUsername(gets.nextLine()) )
                    System.out.println("Success");
                else
                    System.out.println("We dont have that Employee's id");
                break;
            case 1:
                System.out.println("Enter name:");
                if ( list_emp.findEmployeebyName(gets.nextLine()) )
                    System.out.println("Success");
                else
                    System.out.println("We dont have that Employee's name");
                break;
            case 2:
                System.out.println("Enter gender(Nam or Nu):");
                if ( list_emp.findEmployeebyGender(gets.nextLine()) )
                    System.out.println("Success");
                else
                    System.out.println("We dont have any Employee u want");
                break;
        }
    }
    
    public static void Process_Emp() throws IOException{
        switch( k ){
            case 0:
                //thoat
                exit = "co";
                break;
            case 1:
                //hien thi thong tin nguoi dung
                if ( list_emp.findEmployeebyUsername(tenDangNhap) )
                    System.out.println("Success");
                break;
            case 2:
                //hien thi danh sach nhan vien
                if (list_emp.check_in()==0)
                    System.out.println("We have no Employee");
                else
                    list_emp.display();
                break;
            case 3:    
                //tim kiem nhan vien
                if (list_emp.check_in()==0)
                    System.out.println("We have no Employee");
                else{
                    System.out.println(
                             "What type is it?  \n"
                            +"1. by username          \n"
                            +"2. by name        \n"
                            +"3. by gender      \n"
                    );    
                    find_emp();
                }
                break;
            case 4:
                //sap xep nhan vien
                if (list_emp.check_in()==0)
                    System.out.println("We have no Employee");
                else
                    list_emp.sort();
                break;
            case 5:
//                //Thong ke 
//                System.out.println("Thong ke theo:");
//                System.out.println("1. Age\n2. Gender\n3. Working Time");
//                k = cin.nextInt();
//                switch (k){
//                    case 1:
//                        list_emp.thongke_Age();
//                        break;
//                    case 2:
//                        list_emp.thongke_Gender();
//                        break;
//                    case 3:
//                        list_emp.thongke_Full_Hafl();
//                        break;
//                }
                break;
            case 6:
//                //hien thi lich su nhan vien
//                list_emp.display_History();
//                System.out.println("Success");
                break;
            case 7:
//                //tao nhan vien moi
//                System.out.println(
//                         "Which type?\n"
//                        +"1. Fulltime\n"
//                        +"2. Parttime\n"
//                );
//                addEmp();
//                break;
            case 8:
//                //sua thong tin nhan vien
//                if (list_emp.check_in()==0)
//                    System.out.println("We have no Employee");
//                else
//                    setinfor();
//                break;
            case 9:
//                //xoa nhan vien
//                System.out.println("Enter Employee's id:");
//                s = gets.nextLine();
//                list_emp.findEmployeebyId(s);
//                Transfer();
//                break;        
        }
    }
    
    public static void Form_HR_Emp(){  
        System.out.printf(
                 "0. EXIT                               \n"
                +"1. Display your information           \n"         
                +"2. Display list of employees          \n"
                +"3. Find an employee                   \n"
                +"4. Sorting Employee                   \n"
                // menu dieu chinh thong tin ca nhan
                /*
                    sua them cho nhieu nhan vien
                    vao lam 1
                */ 
        );
        if ( capbac==1 ){
            System.out.println(
                 "5. Statistical(thong ke)              \n"   
                +"6. Display history                    \n"
                +"7. Create a new employee              \n"
                +"8. Edit information an employee       \n"        
                +"9.Delete employee                    \n"      
            );
        }
    }
    
//    public static void Form_HR_Depar() throws IOException{
//        System.out.printf(
//                  "0. Exit                              \n"
//                + "1. Display list Department           \n"
//                + "2. Display your Department           \n"
//        );
//        if (capbac==1)
//            System.out.println(
//                  "3. Add department                    \n"
//                + "4. Delete 1 Department               \n"
//                + "5. Edit information Department       \n"
//                + "6. Sorting Departmnet                \n"
//            );
//    }
    
    public static void Form_HR_Acc() throws IOException{
        System.out.printf(
                  "0. Exit                              \n"
                + "1. Change your Password              \n"
        );
        if (capbac==1)
            System.out.println(
                  "2. Display list Account              \n"
                + "3. User forget Password              \n"
            );
        
    }
    
    public static void Menu_HR_Emp() throws IOException{
        exit = "khong";
        do{  
            System.out.printf("Display Menu:(yes or no): ");
            s = gets.nextLine();
            s = s.toLowerCase();
            if ( s.equals("yes") ) Form_HR_Emp(); 
            System.out.printf("Select number: ");
            if ( capbac!=1 )
                do {
                    k = cin.nextInt();
                    if ( k>5 || k<0 )
                        System.out.println("PLeaze try again");
                } while (k>5 || k<0);
            else
                k = cin.nextInt();
            Process_Emp();
        }while ( exit.equals("khong") );
        Menu();
    }
    
    public static void Menu_HR_Acc() throws IOException{
        exit = "khong";
        do{  
            System.out.printf("Display Menu:(yes or no): ");
            s = gets.nextLine();
            s = s.toLowerCase();
            if ( s.equals("yes") ) Form_HR_Acc(); 
            System.out.printf("Select number: ");
            if ( capbac!=1 )
                do {
                    k = cin.nextInt();
                    if ( k>2 || k<0 )
                        System.out.println("PLeaze try again");
                } while (k>2 || k<0);
            else
                k = cin.nextInt();
            Process_Acc();
            //writeFile_Backup();
        }while ( exit.equals("khong") );
        Menu();
    }
    
    public static void Menu() throws IOException{ 
        exit = "khong";
        do{  
            System.out.println(
                      "\nPlease choice:             \n"
                    + "0. Exit System               \n"
                    + "1. HR Employee               \n"
                    + "2. HR Department             \n"
                    + "3. HR Account                \n"
                    + "4. Write File                  "
            );
            System.out.printf("Number:");
            k = cin.nextInt();
            switch ( k ){
                case 0:
                    exit = "co";
                    break;
                case 1:
                    Menu_HR_Emp();
                    break;
                case 2:    
                    //Menu_HR_Depart();
                    break;
                case 3:
                    Menu_HR_Acc();
                    break;
                case 4:
                    writeFile();
                    break;
            }
        }while ( exit.equals("khong") );
    }
    
    public static void Main(String tenDangNhap,String loaiTaiKhoan)throws IOException {
        readFile();
        Menu.tenDangNhap = tenDangNhap;
        //kiem tra cap do
        if (loaiTaiKhoan.equals("Admin")) {
            Menu.capbac = 1;
        } else {
            Menu.capbac = 2;
        }
        Menu();    
        
        
    }
}
