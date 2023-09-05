package Bài3;

import java.util.Scanner;

public class Vatlieu {
    private String ten ;
    private String color  ;
    private Integer doCung ;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getDoCung() {
        return doCung;
    }

    public void setDoCung(Integer doCung) {
        this.doCung = doCung;
    }

    public Vatlieu(String ten, String color, Integer doCung) {
        this.ten = ten;
        this.color = color;
        this.doCung = doCung;
    }
    public Vatlieu(){}

    Scanner Ip = new Scanner(System.in);
    public void Input(){
        System.out.print("Nhap ten vat lieu : ");
        ten = Ip.nextLine() ;
        System.out.print("Nhap mau vat lieu : ");
        color = Ip.nextLine() ;
        System.out.print("Nhap doCung vat lieu : ");
        doCung = Ip.nextInt() ;
        Ip.nextLine() ;
    }
    public void Out(){
        System.out.printf("Tên vật liệu : "+"%-12s" , ten);
        System.out.printf("Màu vật liệu : "+ "%-12s" , color);
        System.out.printf("Độ cứng : " + "%-12d" , doCung);
    }
}
