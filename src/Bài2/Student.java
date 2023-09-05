package Bài2;

import java.util.Scanner ;
public class Student extends Person{
    private String  id ;
    private String lop ;
    private String school ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Student(String name, Byte age, String address, Date birthDay, String id, String lop, String school) {
        super(name, age, address, birthDay);
        this.id = id;
        this.lop = lop;
        this.school = school;
    }

    public Student(String id, String lop, String school) {
        this.id = id;
        this.lop = lop;
        this.school = school;
    }

    public Student(){}

    Scanner Ip = new Scanner(System.in) ;
    public void Input(){
        super.Input() ;
        id = Ip.nextLine() ;
        lop = Ip.nextLine() ;
        school = Ip.nextLine() ;

    }
    public void Out(){
        super.Out() ;
        System.out.print("id : ");
        System.out.printf("%-18s" , id) ;
        System.out.print("lop : ");
        System.out.printf("%-12s" , lop) ;
        System.out.print("school : ");
        System.out.println(school);


    }
}
