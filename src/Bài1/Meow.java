package Bài1;

import java.util.Scanner;

public class Meow  extends  Animal{
    private String color ;
    private String preferences ;
    private String ownerName ;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPreferences() {
        return preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Meow(String name, Byte age, Float weight, String color, String preferences, String ownerName) {
        super(name, age, weight);
        this.color = color;
        this.preferences = preferences;
        this.ownerName = ownerName;
    }

    public Meow(String color, String preferences, String ownerName) {
        this.color = color;
        this.preferences = preferences;
        this.ownerName = ownerName;
    }
    public Meow(){}
    Scanner Ip = new Scanner(System.in) ;
    @Override
    public void Input() {
        System.out.println("Nhập tên  + tuổi  + cân nặng + màu lông + sở thích + tên chủ của con mèo");
        super.Input();
        color = Ip.nextLine() ;
        preferences = Ip.nextLine()  ;
        ownerName = Ip.nextLine() ;
    }
    public void Out(){
        super.Out() ;
        System.out.printf("%-16s" , color);
        System.out.printf("%-16s" , preferences);
        System.out.printf("%-16s" , ownerName);
    }

    public void tiengKeu(){
        System.out.println("MeowMeow Dang iu");
    }
}
