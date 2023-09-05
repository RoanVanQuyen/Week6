package Bài3;

import java.util.Scanner;

public class Hanghoa {
    private String id ;
    private String name ;
    private Float soluong ;
    private Float price ;
    private Vatlieu dsVL ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getSoluong() {
        return soluong;
    }

    public void setSoluong(Float soluong) {
        this.soluong = soluong;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Vatlieu getDsVL() {
        return dsVL;
    }

    public void setDsVL(Vatlieu dsVL) {
        this.dsVL = dsVL;
    }

    public Hanghoa(String id, String name, Float soluong, Float price, Vatlieu dsVL) {
        this.id = id;
        this.name = name;
        this.soluong = soluong;
        this.price = price;
        this.dsVL = dsVL;
    }
    public Hanghoa(){}
    Scanner Ip = new Scanner(System.in);
    public void Input(){
        System.out.print("Nhap vao ma hang : ");
        id = Ip.nextLine() ;
        System.out.print("Nhap vao ten hang : ");
        name = Ip.nextLine() ;
        System.out.print("Nhap vao so luong : ");
        soluong = Ip.nextFloat() ;
        System.out.print("Nhap vao gia hang : ");
        price = Ip.nextFloat() ;
        Ip.nextLine() ;
        dsVL= new Vatlieu()  ;
        dsVL.Input();
    }
    public void Out(){
        System.out.printf("Mã sản phẩm : "+"%-18s" , id);
        System.out.printf("Tên sản phẩm : " +"%-18S" , name);
        System.out.printf("Số lượng : " + "%-18f" , soluong);
        System.out.printf("Giá : " + "%-18f" , price);
        dsVL.Out() ;
    }

    public Float Tongtien(){
        return soluong*price ;
    }
}
