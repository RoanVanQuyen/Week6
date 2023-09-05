package Bài1;

import java.util.Scanner;

public class GauGau extends Animal{
    private String character ;

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public GauGau(String name, Byte age, Float weight, String character) {
        super(name, age, weight);
        this.character = character;
    }

    public GauGau(String character) {
        this.character = character;
    }

    public GauGau(){}
    Scanner Ip = new Scanner(System.in) ;
    @Override
    public void Input(){
        System.out.println("Nhập tên  + tuổi  + cân nặng + tính cách của con chó");
        super.Input() ;
        character = Ip.nextLine() ;
    }
    public void Out(){
        System.out.println("Đây là con mèo và dưới đây là thông tin về nó : ");
        super.Out() ;
        System.out.printf("%-18s" , character);
    }

    public void tiengKeu(){
        System.out.println("Gau Gau ngoc ngech");
    }
}
