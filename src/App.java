import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        
        //toko telur
        System.out.println("harga telur:");
        Double HargaPerKg = inputan.nextDouble();
        System.out.println("total bayar:");
        Double KgTelur = inputan.nextDouble();
        Double UangMasuk = inputan.nextDouble();
        Double Kembalian =  UangMasuk - (HargaPerKg * KgTelur);
        System.out.println("jadi harganya:" + Kembalian);

        // Merubah celcius ke fahrenheit
        System.out.println("masukkan suhu dalam celcius ");
        Double celcius = inputan.nextDouble();
        Double fahrenheit = (celcius*9/5)+32;
        System.out.println("Suhu dalam fahrenheit: " +fahrenheit);


        //Keliling lingkaran
        System.out.println ("masukkan jari jari lingkaran");
        Double jariJari = inputan.nextDouble();
        Double kelilingLingkaran = 2 * Math.PI *jariJari;
        System.out.println("Keliling lingkaran adalah:" + kelilingLingkaran);

        //Luas persegi panjang
        System.out.println("Masukkan nilai panjang daan lebar");
        Double panjang = inputan.nextDouble();
        Double lebar = inputan.nextDouble();
        Double Luas = panjang * lebar; 
        System.out.println("Luasnya adalah:" + Luas);

        //Volume kubus
        System.out.println("Masukkan panjang sisi");
        Double sisi = inputan.nextDouble();
        Double volume = sisi * sisi * sisi;
        System.out.println("Volume dari kubus tersebut adalah:" + volume);

        inputan.close();

    }
}
