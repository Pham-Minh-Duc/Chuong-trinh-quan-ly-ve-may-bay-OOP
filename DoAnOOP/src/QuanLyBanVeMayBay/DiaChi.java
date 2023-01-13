package QuanLyBanVeMayBay;

import java.util.Scanner;

/**
 *
 * @author hung its
 */
public class DiaChi {
    private String ward;
    private String district; 
    private String city; 

    Scanner scan=new Scanner(System.in);

    public DiaChi() {
    }
    
    

    public DiaChi(String ward, String district, String city) {
        this.ward = ward;
        this.district = district;
        this.city = city;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getWard() {
        return ward;
    }

    public String getDistrict() {
        return district;
    }

    public String getCity() {
        return city;
    }
    
    //sua doi toan bo thong tin dia chi
    public void setInfo(){
        System.out.println("Enter the ward ");
        this.setWard(scan.nextLine());
        System.out.println("Enter the district ");
        this.setDistrict(scan.nextLine());
        System.out.println("Enter the city ");
        this.setCity(scan.nextLine());
    }
    
    @Override
    public String toString() {
        return "DiaChi{" + "ward=" + ward + ", district=" + district + ", city=" + city + '}';
    }
    
    
}
