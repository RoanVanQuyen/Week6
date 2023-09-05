package Bài2;

import java.util.Scanner;

public class Person {
    private String name ;
    private byte age ;
    private String address ;
    private Date birthDay ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Person(String name, byte age, String address, Date birthDay) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.birthDay = birthDay;
    }
    public Person(){}
    Scanner Ip = new Scanner(System.in) ;
    public void Input(){
        name = Ip.nextLine() ;
        age = Ip.nextByte() ;
        Ip.nextLine() ;
        address = Ip.nextLine() ;
        birthDay = new Date() ;
        birthDay.Input() ;
    }

    public void Out(){
        System.out.print("name : ");
        System.out.printf("%-18s" , name);
        System.out.print("age : ");
        System.out.printf("%-10s" , age);
        System.out.print("address : ");
        System.out.printf("%-18s" , address);
        birthDay.Out() ;


    }
}
