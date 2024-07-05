import Interfaces.*;
import Islemler.*;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args)
    {
        Doktor doktor = new Doktor();
        Doktor doktor1 = new Doktor( "cafer", "adıgibi", "doktor", "psikiyatri", 40, 60000.0 );
        Hemsire hemsire = new Hemsire( "neriman", "yedidüvel", "hemşire", "cerrahi", 31, 35000.0 );

        List<Doktor> doktorListe = new ArrayList<>();
        List<Hemsire> hemsireListe = new ArrayList<>();

        //deneme
        int karar = 4;
        do{
            System.out.println("lütfen gerçekleştirmek istediğiniz işlem ile ilgili sayıyı giriniz:" +
                    "\nÇıkmak için \"0\"" +
                    "\nYeni deger al \"1\"" +
                    "\nMevcut değeri sil \"2\"" +
                    "\nBütün değerleri yazdır \"3\"");

            karar = DegerAl.ScanInt();
            switch(karar)
            {
                case(1):
                {
                    String meslek = "";
                    while(true)
                    {
                        System.out.println("\nHangi birime kayıt yapmak istiyorunuz? (doktor/hemşire)\nÇıkmak için \"0\" giriniz");
                        meslek = DegerAl.ScanString();
                        if(meslek.equals("doktor"))
                        {
                            doktorListe.add(doktorKayit());
                            System.out.println("kayıt işlemi başarıyla gerçekleştirildi");
                            break;
                        }
                        else if(meslek.equals("hemşire"))
                        {
                            hemsireListe.add(hemsireKayit());
                            System.out.println("kayıt işlemi başarıyla gerçekleştirildi");
                            break;
                        }
                        else if(meslek.equals("0"))
                        {
                            break;
                        }
                        else
                            System.out.println("\nyanlış bir değer girdiniz. lütfen tekrar deneyiniz\n");
                    }
                }
            }

            if(karar>=4)
                System.out.println("Lütfen uygun bir değer giriniz");

        }while(karar!=0);

        System.out.println("Program sonlandırıldı!");

    }

    static Doktor doktorKayit()
    {
        System.out.println("Lütfen isim giriniz:");
        String isim = DegerAl.ScanString();
        System.out.println("Lütfen soyisim giriniz:");
        String soyisim = DegerAl.ScanString();
        System.out.println("Lütfen görev yerini giriniz:");
        String gorev = DegerAl.ScanString();
        System.out.println("Lütfen yaş giriniz:");
        int yas = DegerAl.ScanInt();
        System.out.println("Lütfen maas giriniz:");
        double maas = DegerAl.ScanDouble();

        Doktor yeni = new Doktor(isim, soyisim, "doktor", gorev, yas, maas);
        return yeni;
    }

    static Hemsire hemsireKayit()
    {
        System.out.println("Lütfen isim giriniz:");
        String isim = DegerAl.ScanString();
        System.out.println("Lütfen soyisim giriniz:");
        String soyisim = DegerAl.ScanString();
        System.out.println("Lütfen görev yerini giriniz:");
        String gorev = DegerAl.ScanString();
        System.out.println("Lütfen yaş giriniz:");
        int yas = DegerAl.ScanInt();
        System.out.println("Lütfen maas giriniz:");
        double maas = DegerAl.ScanDouble();

        Hemsire yeni = new Hemsire(isim, soyisim, "hemşire", gorev, yas, maas);
        return yeni;
    }





}
