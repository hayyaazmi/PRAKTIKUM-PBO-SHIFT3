//nomor 2
package pertemuan4;
import java.util.Scanner;

public class Hari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataHari d = new DataHari();
        
        System.out.print("Masukkan Kode : ");
        d.kode = input.nextInt();
        
        d.kodeHari();
        d.info();
    }
}

class DataHari {
    int kode;
    String hari;
    
    void kodeHari(){
        switch(kode){
            case 1:
                hari = "Senin";
                break;
            case 2:
                hari = "Selasa";
                break;
            case 3:
                hari = "Rabu";
                break;
            case 4:
                hari = "Kamis";
                break;
            case 5:
                hari = "Jumat";
                break;
            case 6:
                hari = "Sabtu";
                break;
            case 7:
                hari = "Minggu";
                break;
            default:
                hari = "Data Tidak Valid";
        }     
    }
    
    void info(){
        System.out.println(hari);
    }
}
