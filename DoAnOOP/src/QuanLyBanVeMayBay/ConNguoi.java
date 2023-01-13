package QuanLyBanVeMayBay;

import java.util.Scanner;

/**
 *
 * @author hung its
 */
public abstract class ConNguoi {
    protected String name;         //ho va ten
    protected int age;             //tuoi
    protected String gender;     //gioi tinh
    protected DiaChi new_DiaChi; //dia chi

    Scanner cin = new Scanner(System.in);
    Scanner gets = new Scanner(System.in);
    Scanner cdou = new Scanner(System.in);
    
    public ConNguoi(){
    }
    
    public ConNguoi(String name, int age, String gender, DiaChi new_DiaChi) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.new_DiaChi = new_DiaChi;
    }

    @Override
    public String toString() {
        return "ConNguoi{" + "name=" + name + ", age=" + age + ", gender=" + gender + ", new_DiaChi=" + new_DiaChi + '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNew_DiaChi(DiaChi new_DiaChi) {
        this.new_DiaChi = new_DiaChi;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public DiaChi getNew_DiaChi() {
        return new_DiaChi;
    }
    
    //Sua doi thong tin con nguoi
    public void setInfo(){
        System.out.println("Enter the name ");
        this.setName(gets.nextLine());
        System.out.println("Enter the age ");
        this.setAge(cin.nextInt());
        System.out.println("Enter the gender");
        this.setGender(gets.nextLine());
        //tao 1 bien nhap thong tin
        DiaChi add = new DiaChi();
        add.setInfo(); // nhap thong tin dia chi
        this.setNew_DiaChi(add); // lay thong tin dia chi
    }
}
