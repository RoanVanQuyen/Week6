package Bài2;

import java.util.Scanner;

public class Date {
    private Byte year ;
    private Byte month ;
    private Byte day  ;

    public Date(Byte year, Byte month, Byte day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public Date(){}
    Scanner Ip = new Scanner(System.in) ;
    public void Input(){
        year = Ip.nextByte() ;
        month = Ip.nextByte() ;
        day = Ip.nextByte() ;
    }
    public void Out(){
        System.out.print("Năm sinh : ");
        System.out.printf("%-12s" , year);
        System.out.print("Tháng sinh : ");
        System.out.printf("%-12s" , month);
        System.out.print("Ngày Sinh : ");
        System.out.printf("%-12s" , day);
    }
}
