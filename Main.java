package laptop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inisialisasi Laptop (Bisa ganti ke Toshiba() atau MacBook())
        Laptop laptopKu = new Lenovo(); 
        LaptopUser user = new LaptopUser(laptopKu);

        Scanner scanner = new Scanner(System.in);
        String action;

        System.out.println("=== APLIKASI KONTROL LAPTOP ===");
        System.out.println("Gunakan Perintah Berikut:");
        System.out.println("[ON]   : Nyalakan laptop");
        System.out.println("[OFF]  : Mematikan laptop");
        System.out.println("[UP]   : Menambah volume");
        System.out.println("[DOWN] : Mengurangi volume");
        System.out.println("[EXIT] : Keluar dari program");
        System.out.println("===============================");

        while (true) {
            System.out.print("\nMasukkan Perintah (ON/OFF/UP/DOWN/EXIT): ");
            action = scanner.nextLine().trim().toUpperCase();

            switch (action) {
                case "ON":
                    user.turnOnLaptop();
                    break;
                case "OFF":
                    user.turnOffLaptop();
                    break;
                case "UP":
                    user.makeLaptopLouder();
                    break;
                case "DOWN":
                    user.makeLaptopSilence();
                    break;
                case "EXIT":
                    System.out.println("Keluar dari program. Terima kasih!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Perintah salah! Silakan masukan ON, OFF, UP, DOWN, atau EXIT.");
                    break;
            }
        }
    }
}
