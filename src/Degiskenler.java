/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nejdetkadirr
 */
public class Degiskenler {
    public static void main(String[] args) {
        //int
        int dogumYili = -2000;
        
        int yas;
        yas = 20;
        
        final int ugurluSayi = 13;
        //ugurluSayi = 12; bu satırı yazdığımızda hata alıyoruz çünkü final oluşturulan değişkenimize sadece 1 kere değer atayabiliriz, sonrasında güncelleme yapamayız.
        
        /**********************************/
        //String
        String eposta = "nejdetkadir.550@gmail.com";
        
        String dogduguAy;
        dogduguAy = "Ocak";
        
        /**********************************/
        //float
        float fltDegisken = 1.99f;
        
        float fltDegiskenIki;
        fltDegiskenIki = -23.99f;
        
        /**********************************/
        //char
        char basHarf = 'D';
        
        char sonHarf;
        sonHarf = 'n';
        
        /**********************************/
        //boolean
        boolean ogrenciMi = true;
        
        boolean stoktaVarMı;
        stoktaVarMı = false;        
        
        //NOT: final değişkenin nasıl tanımlandığını öğrendiğimiz için diğer değişkenlerimiz tanımlarken tekrarlamaya gerek duymadım. 
        
        //BİLGİ : Değişkenlerimizi konsolda yazdırmak istersek aşağıdaki metodu kullanırız.
        System.out.println(dogumYili);
        
        System.out.println(dogduguAy);
        
        System.out.println(fltDegisken);
        
        System.out.println(basHarf);
        
        System.out.println(stoktaVarMı);
    }
}
