/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nejdetkadirr
 */
public class Operatorler {
    public static void main(String[] args) {
        //Aritmetik Operatörler
        
        //Yaşımızı hesaplayalım
        int yas = 2020-2000;
        //bulunduğumuz yıl - doğum yılı
        System.out.println(yas + " yaşındasın."); //20 yaşındasın.
        
        
        //Babaımızın ve kendi yaşımızın toplamını bulalım
        int babaminYasi = 2020-1966;
        int benimYasim = yas; // Yukarıda kendi yaşımızı zaten hesapladığımız için buradan tekrar aynı işlemi yapmadık.
        int yaslarimizinToplami = benimYasim + babaminYasi;
        System.out.println("Benim ve babamın yaşının toplamı " + yaslarimizinToplami);  //Benim ve babamın yaşının toplamı 74
        
        //Vücut kitle indeksi hesaplama örneği
        //VKİ = Kilo / (Boy * Boy)
        double boy = 1.78;
        int kilo = 75;
        double VKI = kilo / (boy * boy);
        System.out.println("Vücüt kitle indeksiniz " + VKI); //Vücüt kitle indeksiniz 23.671253629592222
        
        //Kilomuzun 10 a bölümünden kalanı bulalım
        int kalan = kilo % 10;
        System.out.println("Kilonuzun 10'a bölümünden kalan " + kalan); //Kilonuzun 10'a bölümünden kalan 5
        
        //Kilomuzu 1 arttıralım 
        kilo++;
        System.out.println("Kilonuzun 1 artımış hali " + kilo); //Kilonuzun 1 artımış hali 76
        
        //Yaşımızı 1 azaltalım
        yas--;
        System.out.println("Yaşınızın 1 azaltılmış hali " + yas); //Yaşınızın 1 azaltılmış hali 19
        
        /**************************************************************/
        
        //Atama Operatörleri
        
        //NOT: Şimdiye kadar değişken tanımlarken = kullandık, = operatörü değişkene verdiğimiz değeri atadığınızı biliyoruz o yüzden şimdi tekrar etme gereği duymadım.
        
        int rastgeleSayi = 2;
        
        //Rastgele sayıyı arttırma  
        
        //Uzun yöntem        
        rastgeleSayi = rastgeleSayi + 10; //rastgeleSayi = 2 + 10 anlamına gelmektedir.   
        System.out.println("rastgeleSayi değişkenimizin şu anki değeri " + rastgeleSayi); //rastgeleSayi değişkenimizin şu anki değeri 12
        //Fakat kod kalabalığı istemediğimiz için bu çok kullanılan bi yöntem değildir.
        
        //Kısa yöntem 
        rastgeleSayi+=10; //Yukarıdaki aynı işlemi yapar hiçbir farkı yoktur.
        System.out.println("rastgeleSayi değişkenimizin şu anki değeri " + rastgeleSayi); //rastgeleSayi değişkenimizin şu anki değeri 22
        
        //NOT: Uzun yöntemi bundan sonra sadece yorum satırı olarak bırakacağım, tekrar tekrar yazarak kod kalabalığı yapmak istemiyorum.
        
        //Rastgele sayıyı azaltma
        
        /*
        Uzun yöntem
        rastgeleSayi = rastgeleSayi - 10;
        System.out.println("rastgeleSayi değişkenimizin şu anki değeri " + rastgeleSayi); //rastgeleSayi değişkenimizin şu anki değeri 12        
        */
        
        //Kısa yöntem
        rastgeleSayi -= 10;
        System.out.println("rastgeleSayi değişkenimizin şu anki değeri " + rastgeleSayi); //rastgeleSayi değişkenimizin şu anki değeri 12
        
        //Rastgele sayıyı çarpma
        
        /*
        Uzun yöntem
        rastgeleSayi = rastgeleSayi * 3;
        System.out.println("rastgeleSayi değişkenimizin şu anki değeri " + rastgeleSayi); //rastgeleSayi değişkenimizin şu anki değeri 36        
        */
        
        //Kısa yöntem
        rastgeleSayi *= 3;
        System.out.println("rastgeleSayi değişkenimizin şu anki değeri " + rastgeleSayi); //rastgeleSayi değişkenimizin şu anki değeri 36
        
        //Rastgele sayıyı bölme
        
        /*
        Uzun yöntem
        rastgeleSayi = rastgeleSayi / 2;
        System.out.println("rastgeleSayi değişkenimizin şu anki değeri " + rastgeleSayi); //rastgeleSayi değişkenimizin şu anki değeri 18        
        */
        
        //Kısa yöntem
        rastgeleSayi /= 2;
        System.out.println("rastgeleSayi değişkenimizin şu anki değeri " + rastgeleSayi); //rastgeleSayi değişkenimizin şu anki değeri 18
        
        //Rastgele sayının bölümünden kalnını bulma
        
        /*
        Uzun yöntem
        rastgeleSayi = rastgeleSayi % 2;
        System.out.println("rastgeleSayi değişkenimizin şu anki değeri " + rastgeleSayi); //rastgeleSayi değişkenimizin şu anki değeri 0       
        */
        
        //Kısa yöntem
        rastgeleSayi %= 2;
        System.out.println("rastgeleSayi değişkenimizin şu anki değeri " + rastgeleSayi); //rastgeleSayi değişkenimizin şu anki değeri 0
        
        
        /*        
        En çok kullanılan kalıpları yukarıda örneklerle belirttik. 
        Diğer atama operatörleri çok kullanmadığımız için burada örnek verip kafanızı karıştırmak istemiyorum.
        İşinize yarayan herhangi biri olursa, uygulama içinde nasıl tanımlanıp kullanıldığı belirten tablodan yararlanabilirsiniz.        
        */
        
        //Karşılaştırma Operatörleri
        
        boolean durum = true; //durum değişkeninin değerini başlangıçta true olarak tanımladık. 
        
        // a, b ve c değikenlerimizi de tanımladık.
        int aSayisi = 5;
        int bSayisi = 5;
        int cSayisi = 10;
        
        
        durum = aSayisi == cSayisi; 
        //Yukarıdaki satırın türkçe karşılığı şudur: 
        //"5, 10'a eşit mi?" eğer eşitse, yani bu ifade doğruysa true, eğer eşit değilse yani bu ifade yanlışsa false değerini değer olarak döner.
        System.out.println("durum değişkenimizin şu anki değeri " + durum); //durum değişkenimizin şu anki değeri false
        
        
        durum = aSayisi != cSayisi;
        //Yukarıdaki satırın türkçe karşılığı şudur: 
        //"5, 10'a eşit değil mi?" eğer eşit değilse, yani bu ifade doğruysa true, eğer eşitse yani bu ifade yanlışsa false değerini değer olarak döner.
        System.out.println("durum değişkenimizin şu anki değeri " + durum); //durum değişkenimizin şu anki değeri true
        
        
        durum = aSayisi == bSayisi;
        //Yukarıdaki satırın türkçe karşılığı şudur: 
        //"5, 5'e eşit mi?" eğer eşitse, yani bu ifade doğruysa true, eğer eşit değilse yani bu ifade yanlışsa false değerini değer olarak döner.
        System.out.println("durum değişkenimizin şu anki değeri " + durum); //durum değişkenimizin şu anki değeri true
        
        
        durum = aSayisi < bSayisi;
        //Yukarıdaki satırın türkçe karşılığı şudur: 
        //"5, 5'den küçük mü?" eğer küçükse, yani bu ifade doğruysa true, eğer büyükse değilse yani bu ifade yanlışsa false değerini değer olarak döner.
        System.out.println("durum değişkenimizin şu anki değeri " + durum); //durum değişkenimizin şu anki değeri false
        
        
        durum = aSayisi >= bSayisi;
        //Yukarıdaki satırın türkçe karşılığı şudur: 
        //"5, 5'den büyük veya 5, 5'e eşit mi?" eğer büyük yada eşitse, yani bu ifade doğruysa true, eğer büyük yada eşit değilse yani bu ifade yanlışsa false değerini değer olarak döner.
        System.out.println("durum değişkenimizin şu anki değeri " + durum); //durum değişkenimizin şu anki değeri true
        
        
        //Mantıksal Operatörler
        
        boolean mantikDurum = false;
        //Şimdi gereksiz olarak fazladan değişkenler oluşturup bunları karşılaştırma yapmadan direkt sayılarla karşılaştırma yababiliriz.
        
        //&& (ve - and) operatörü
        
        mantikDurum = 5 > 7 && 7 % 2 == 1;
        //Yukarıdaki satırın türkçe karşılığı şudur: 
        //"5, 7'den büyüktür ve 7'nin 2'ye bölümününden kalan 1 midir?" 5, 7'den büyük değildir fakat 7'nin 2'ye bölümünden kalan 1'dir. 
        //Bu durumda iki ifadeden sadece biri doğrudur. Fakat and operatörünün (&&) true değer dönmesi için her iki taraftaki ifadenin de doğru olması, yani her iki tarafın da true olması lazımdır.
        //Bu durumda iki taraftan biri false olduğu için mantikDurum değişkeni false değerini alır.
        
        System.out.println("mantikDurum değişkenimizin şu anki değeri " + mantikDurum); //mantikDurum değişkenimizin şu anki değeri false
        
        //|| (yada - or) operatörü
        
        mantikDurum = 0 != 1 || 0 > 1;
        //Yukarıdaki satırın türkçe karşılığı şudur: 
        //"0, 1'e eşit değil midir veya 0, 1'den büyük müdür?" 0, 1 eşit değil midir? evet eşit değildir yani sol ifade bloğu true değer döner.
        //0, 1'den büyük müdür? hayır 0, 1'den büyük değildir, bu durumda sağ ifade bloğu false değer döner.
        // or operatörünün (||) true değer dönmesi için iki taraftan herhangi birinin true değer dönmesi yeterlidir yani mantikDurum değişkeni true değer alır.
        
        System.out.println("mantikDurum değişkenimizin şu anki değeri " + mantikDurum); //mantikDurum değişkenimizin şu anki değeri true
        
        //! (değildir - not) operatörü
        
        mantikDurum = !(1 == 1);
        //Böyle bir ifadeyle karşılaştığımızda ilk önce ünlem yokmuş gibi hesaplama yaparız ve çıkan sonucu tersine çeviririz.
        //Yukarıdaki satırın türkçe karşılığı şudur:
        //"1, 1'e eşit midir?" ünlemi okumadan baktığımızda bu şekilde okuruz. Ünlem ise soruyu şu hale getirir, "1, 1'e eşit değil midir?"
        //Biz burada şöyle bir yol izleyebiliriz ilk önce ünlem yokmuş gibi hesaplarız,
        //yani 1, 1'e eşit mi? evet eşit. Yani true, ünlem ise dönen değeri tam tersine çevirir.
        //Son durumda true değeri false olarak mantikDurum değişkenimize atanmış olur.
        
        System.out.println("mantikDurum değişkenimizin şu anki değeri " + mantikDurum); //mantikDurum değişkenimizin şu anki değeri false        
    }
}
