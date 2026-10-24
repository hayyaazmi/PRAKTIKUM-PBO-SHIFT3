//nomor 4
package pertemuan4;
import java.util.Scanner;

public class TahunKabisat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataTahun t = new DataTahun();
        
        System.out.print("Masukkan Tahun : ");
        t.tahun = input.nextInt();
        
        t.menentukanTahun();
    }
}

class DataTahun{
    int tahun;
    
    void menentukanTahun(){
        if((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)){
            System.out.println(tahun + " adalah tahun kabisat");
        } else{
            System.out.println(tahun + " bukan tahun kabisat");
        }
    }
}