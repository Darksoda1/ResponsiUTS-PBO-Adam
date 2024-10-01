/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adam;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        
        Produk p1 = new Elektronik("Handphone", 3500000, 2);
        Produk p2 = new Makanan("Nasi Goreng", 12000, "01-02-2025");

        
        Pegawai pegawai1 = new PegawaiTetap("Sarah", 5000000, 7500000);
        Pegawai pegawai2 = new PegawaiKontrak("Omar", 10000000, 12);

        
        p1.tampilkanInfo();
        System.out.println();
        p2.tampilkanInfo();
        System.out.println();

        
        pegawai1.tampilkanInfo();
        System.out.println();
        pegawai2.tampilkanInfo();
        System.out.println();

    }
}
