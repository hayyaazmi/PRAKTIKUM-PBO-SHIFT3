package pertemuan3;
import java.io.*;
import java.util.Scanner;

public class HitungBelanja {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //inputan data
        Scanner data = new Scanner(System.in);
        
        System.out.print("Masukkan Nama          : ");
        String namaplg = data.nextLine();
        
        System.out.print("Masukkan Total Belanja : ");
        double totbelanja = data.nextDouble();
        
        System.out.print("Masukkan Diskon        : ");
        float diskon = data.nextFloat();
        
        double total = totbelanja - (totbelanja/100)*diskon ;
        System.out.println("Total                  : " + total);
        
        System.out.print("Bayar                  : ");
        double bayar = data.nextDouble();
        
        double kembalian = bayar - total;
        
        //data output stream
        DataOutputStream output = new DataOutputStream(
                new FileOutputStream("belanja.txt")
        );
        output.writeUTF(namaplg);
        output.writeDouble(totbelanja);
        output.writeFloat(diskon);
        output.writeDouble(total);
        output.writeDouble(bayar);
        output.writeDouble(kembalian);
        output.close();
        
        System.out.println("\nData Berhasil Dimasukkan!");
        
        //data input stream
        DataInputStream input = new DataInputStream(
                new FileInputStream("belanja.txt")
        );
        String nama = input.readUTF();
        double totalblj = input.readDouble();
        float disc = input.readFloat();
        double totharga = input.readDouble();
        double totbayar = input.readDouble();
        double change = input.readDouble();
        
        System.out.println("\n== STRUK PEMBELANJAAN ANDA ==");
        System.out.println("Nama          : " + nama);
        System.out.println("Total Belanja : " + totalblj);
        System.out.println("Diskon(%)     : " + disc + "%");
        System.out.println("Total         : " + totharga);
        System.out.println("Bayar         : " + totbayar);
        System.out.println("Kembalian     : " + change);
    }
}
