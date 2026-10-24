//nomor 7
package pertemuan4;
import java.util.Scanner;

public class LuasBangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataBgDatar bd = new DataBgDatar();
        
        System.out.println("== MENU LUAS BANGUN DATAR ==");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Luas Segitiga");
        System.out.println("3. Luas Lingkaran");
        System.out.println("4. Luas Trapesium");
        System.out.println("5. Luas Layang-layang");
        System.out.print("Pilih menu (1-5) : ");
        bd.pilih = input.nextInt();
        
        System.out.println("");
        switch (bd.pilih) {
            case 1:
                System.out.print("Masukkan sisi : ");
                bd.a = input.nextDouble();
                break;
            case 2:
                System.out.print("Masukkan alas : ");
                bd.a = input.nextDouble();
                System.out.print("Masukkan tinggi : ");
                bd.b = input.nextDouble();
                break;
            case 3:
                System.out.print("Masukkan jari-jari : ");
                bd.a = input.nextDouble();
                break;
            case 4:
                System.out.print("Masukkan sisi sejajar a : ");
                bd.a = input.nextDouble();
                System.out.print("Masukkan sisi sejajar b : ");
                bd.b = input.nextDouble();
                System.out.print("Masukkan tinggi : ");
                bd.c = input.nextDouble();
                break;
            case 5:
                System.out.print("Masukkan diagonal 1 : ");
                bd.a = input.nextDouble();
                System.out.print("Masukkan diagonal 2 : ");
                bd.b = input.nextDouble();
                break;
        }

        bd.hitungLuas();
        bd.info();
    }
}

class DataBgDatar{
    int pilih;
    double a, b, c, luas;
    String nama;
    
    
    void hitungLuas(){
        switch(pilih){
            case 1:
                nama = "Persegi";
                luas = a * a;
                break;
            case 2:
                nama = "Segitiga";
                luas = 0.5 * a * b;
                break;
            case 3:
                nama = "Lingkaran";
                luas = 3.14 * a * a;
                break;
            case 4:
                nama = "Trapesium";
                luas = 0.5 * (a + b) * c;
                break;
            case 5:
                nama = "Layang-layang";
                luas = a * a;
                break;
            default:
                nama = "Data Tidak Valid";
                luas = 0;
        }
    }
    
    void info(){
        System.out.println("\n== HASIL ==");
        System.out.println("Bangun Datar : " + nama);
        System.out.println("Luas         : " + luas);
    }
}
