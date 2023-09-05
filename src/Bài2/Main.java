package Bài2;
import java.util.ArrayList ;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner Ip = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>() ;
        System.out.print("Nhập vào số học sinh : ");
        int n = Ip.nextInt() ;
        System.out.println("Nhập tên + tuổi + địa chỉ  + năm sinh + tháng sinh + ngày sinh  + mã SV + lớp  + trường  ");
        for(int i = 0 ; i < n ; i++){
            System.out.println("Nhap Vao Hoc Sinh Thu " + (i+1) + " : ");
            Student One = new Student() ;
            One.Input();
            students.add(i,One) ;
        }
        for(int i = 0 ; i < n ; i++){
            students.get(i).Out();
        }
    }
}
