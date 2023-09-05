package Bài3;

public class Hanghoadientu extends Hanghoa{
    private Integer TGBH ;
    private Integer Congsuat ;

    public Hanghoadientu(Integer TGBH, Integer congsuat) {
        this.TGBH = TGBH;
        Congsuat = congsuat;
    }

    public Hanghoadientu(String id, String name, Float soluong, Float price, Vatlieu dsVL, Integer TGBH, Integer congsuat) {
        super(id, name, soluong, price, dsVL);
        this.TGBH = TGBH;
        Congsuat = congsuat;
    }
    public Hanghoadientu(){}

    public Integer getTGBH() {
        return TGBH;
    }

    public void setTGBH(Integer TGBH) {
        this.TGBH = TGBH;
    }

    public Integer getCongsuat() {
        return Congsuat;
    }

    public void setCongsuat(Integer congsuat) {
        Congsuat = congsuat;
    }
    @Override
    public void Input() {
        super.Input();
        System.out.print("Nhap vao thoi gian bao hanh : ");
        TGBH = Ip.nextInt() ;
        System.out.print("Nhap vao cong suat : ");
        Congsuat = Ip.nextInt() ;
    }

    public void Out(){
        super.Out() ;
        System.out.printf("Thoi gian bao hanh : " + "%-12d" , TGBH ) ;
        System.out.println("Cong suat : " +  Congsuat );
    }
}
