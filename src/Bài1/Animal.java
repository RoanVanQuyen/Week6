package Bài1;

import java.util.Scanner;

public class Animal {
    private  String name ;
    private Byte age ;
    private Float weight;

    public Animal(String name, Byte age, Float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public Animal(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }
    Scanner Ip = new Scanner(System.in) ;
    public void Input(){
        name = Ip.nextLine() ;
        age = Ip.nextByte() ;
        Ip.nextLine() ;
        weight = Ip.nextFloat() ;
    }

    public void Out() {
        System.out.printf("%-12s" , name);
        System.out.printf("%-8d" , age);
        System.out.printf("%-12f" , weight);
    }
    public void tiengKeu(){
        System.out.println("ec ec");
    }
}
