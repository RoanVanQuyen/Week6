package Bài3;
import java.util.ArrayList ;
import java.util.Scanner ;
public class Main {
    public static void main(String [] args){
        Scanner Ip = new Scanner(System.in);
        System.out.print("Nhập vào số lượng hàng hoá : ");
        int n = Ip.nextInt() ;
        ArrayList<Hanghoadientu> hangdientus  = new ArrayList<>() ;
        ArrayList<Hanghoagiadung> hanggiadungs = new ArrayList<>() ;
        for(int i = 0 ; i < n ; i++){
            System.out.println("Nhập vào thông tin mặt hàng ĐIỆN TỬ thứ " + (i+1) + "!");
            Hanghoadientu One = new Hanghoadientu();
            One.Input() ;
            hangdientus.add(One)  ;
        }

        for(int i = 0 ; i < n ; i++){
            System.out.println("Nhập vào thông tin mặt hàng GIA DỤNG thứ " + (i+1) );
            Hanghoagiadung One = new Hanghoagiadung();
            One.Input() ;
            hanggiadungs.add(One)  ;
        }

        System.out.println("Thông tin các mặt hàng điện tử ! ");
        for(int i = 0 ; i < n  ; i++){
            hangdientus.get(i).Out()  ;
        }

        System.out.println("Thông tin các mặt hàng gia dụng ! ");
        for(int i = 0 ; i < n  ; i++){
            hanggiadungs.get(i).Out()  ;
        }
    }
}
