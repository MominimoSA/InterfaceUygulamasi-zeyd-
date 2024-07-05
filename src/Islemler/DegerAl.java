package Islemler;

import java.util.Scanner;

public class DegerAl
{
    static Scanner sc = new Scanner(System.in);


    // overloading yöntemini kullandım!

    public static int ScanInt()
    {
        int deger = sc.nextInt();
        sc.nextLine(); // Temizleme işlemi
        return deger;
    }

    public static double ScanDouble()
    {
        double deger = sc.nextDouble();
        sc.nextLine(); // Temizleme işlemi
        return deger;
    }

    public static Long ScanLong()
    {
        Long deger = sc.nextLong();
        sc.nextLine(); // Temizleme işlemi
        return deger;
    }

    public static String ScanString()
    {
        String deger = sc.nextLine();
        return deger ;
    }
}
