//nomor 6
package pertemuan4;
import java.util.Scanner;

public class ProgramKasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataKasir dk = new DataKasir();

        System.out.print("Apakah memiliki kartu member? (ya/tidak) : ");
        dk.member = input.nextLine();
        System.out.print("Masukkan Total Belanja : ");
        dk.totBelanja = input.nextDouble();
        
        dk.infoDiskon();
        
        System.out.print("Masukkan Uang yang Diberikan : ");
        dk.totBayar = input.nextDouble();

        dk.hitungBayar();
        dk.info();
    }
}

class DataKasir{
    String member;
    double totBelanja, totAkhirBayar, totBayar, kembalian;
    int diskon;
    
    void infoDiskon(){
        if(member.equalsIgnoreCase("ya")){
            if(totBelanja > 500000){
                diskon = 50000;
            } else if(totBelanja > 100000) {
                diskon = 15000;
            } else{
                diskon = 0;
            }
        } else {
            if(totBelanja > 100000){
                diskon = 10000;
            } else{
                diskon = 0;
            }
        }
        
        totAkhirBayar = totBelanja - diskon;
        
        System.out.println("\nSelamat! Anda Mendapatkan Diskon!");
        System.out.println("Diskon               : " + diskon);
        System.out.println("Total Setelah Diskon : " + totAkhirBayar);
    }
    
    void hitungBayar(){
        kembalian = totBayar - totAkhirBayar;
    }
    
    void info(){
        System.out.println("\n== PROGRAM KASIR ==");
        System.out.println("Member               : " + member);
        System.out.println("Total Belanja        : " + totBelanja);
        System.out.println("Diskon               : " + diskon);
        System.out.println("Total Setelah Diskon : " + totAkhirBayar);
        System.out.println("Uang Diberikan       : " + totBayar);
        if(kembalian >= 0){
            System.out.println("Kembalian            : " + kembalian);
        } else{
            System.out.println("Uang Kurang          : " + (-kembalian));
        }
    }
}
