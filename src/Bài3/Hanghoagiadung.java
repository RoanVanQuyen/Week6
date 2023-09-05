package Bài3;

public class Hanghoagiadung extends Hanghoa{
    private String chucnang ;

    public Hanghoagiadung(String id, String name, Float soluong, Float price, Vatlieu dsVL, String chucnang) {
        super(id, name, soluong, price, dsVL);
        this.chucnang = chucnang;
    }

    public Hanghoagiadung(String chucnang) {
        this.chucnang = chucnang;
    }

    public Hanghoagiadung(){}
    public String getChucnang() {
        return chucnang;
    }

    public void setChucnang(String chucnang) {
        this.chucnang = chucnang;
    }

    public void Input(){
        super.Input() ;
        System.out.print("Nhap chuc nang : ");

        chucnang = Ip.nextLine() ;
    }

    public void Out(){
        super.Out() ;

        System.out.printf("Chức năng : " + "%-18s"  , chucnang);
    }
}
