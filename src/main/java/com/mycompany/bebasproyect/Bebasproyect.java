/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bebasproyect;

/**
 *
 * @author User
 */

import java.util.Scanner;

public class Bebasproyect {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double angka1, angka2, hasil;
        int menu;

        System.out.println("=== KALKULATOR SEDERHANA ===");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Pangkat");

        System.out.print("Pilih menu: ");
        menu = input.nextInt();

        System.out.print("Masukkan angka pertama: ");
        angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        angka2 = input.nextDouble();

        if (menu == 1) {
            hasil = angka1 + angka2;
            System.out.println("Hasil penjumlahan = " + hasil);

        } else if (menu == 2) {
            hasil = angka1 - angka2;
            System.out.println("Hasil pengurangan = " + hasil);

        } else if (menu == 3) {
            hasil = angka1 * angka2;
            System.out.println("Hasil perkalian = " + hasil);

        } else if (menu == 4) {
            if (angka2 != 0) {
                hasil = angka1 / angka2;
                System.out.println("Hasil pembagian = " + hasil);
            } else {
                System.out.println("Tidak bisa dibagi dengan 0!");
            }

        } else if (menu == 5) {
            hasil = Math.pow(angka1, angka2);
            System.out.println("Hasil pangkat = " + hasil);

        } else {
            System.out.println("Menu tidak tersedia!");
        }

        input.close();
    }
}