package pertemuan3;
//class Scanner merupakan class yang berada di dalam java untuk membuat 
//sebuah inputan dan dapat membaca semua tipe jenis data. Baik itu string, 
//char, int, float, dan tipe data lainnya. Sedangkan BufferReader merupakan 
//class untuk membuat sebuah inputan namun hanya bisa membaca tipe data String. 
//Walaupun bisa menggunakan tipe data lain, tipe data tersebut harus di konversi 
//kan ke dalam String agar dapat dibaca oleh program.
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScannerdanBufferReader {
    public static void main(String[] args) throws IOException{
        System.out.println("== INI SCANNER ==");
        //instansiasi objek scanner
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan Umur : ");
        int umur = input.nextInt();
        
        System.out.print("Masukkan Gaji : ");
        double gaji = input.nextDouble();
        
        System.out.println("== INI BUFFEREADER ==");
        //instansiasi objek bufferreader
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );
        
        System.out.print("Masukkan Nama : ");
        String nama1 = br.readLine();
        
        System.out.print("Masukkan Umur : ");
        int umur2 = Integer.parseInt(br.readLine()); //konversi integer ke string
        
        System.out.print("Masukkan Gaji : ");
        double gaji2 = Double.parseDouble(br.readLine()); //konversi double ke string
    }
}
