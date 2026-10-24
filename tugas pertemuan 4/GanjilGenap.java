//soal nomor 1
package pertemuan4;
import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataAngka d = new DataAngka();
        
        System.out.print("Masukkan Angka : ");
        d.angka = input.nextInt();
        
        d.cekAngka();
        d.info();
    }
}

class DataAngka {
    int angka;
    String hasil;
    
    void cekAngka(){
        if(angka % 2 == 0){
            hasil = "Genap";
        } else {
            hasil = "Ganjil";
        }
    }
    
    void info(){
        System.out.println(angka + " Adalah Bilangan " + hasil);
    }
}
