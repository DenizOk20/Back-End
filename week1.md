# Week-1
- [JVM nedir ne işe yarar?](#1-jvm-nedir-ne-işe-yarar)
- [JDK nedir ne işe yarar?](#2-jdk-nedir-ne-işe-yarar)
- [Garbage Collector görevi nedir? Nasıl çalışır?](#3-garbage-collector-görevi-nedir-nasıl-çalışır)
- [.jar formatı nedir?](#4-jar-formatı-nedir)
- [Javada .class .ve .java formatının farkı nedir?](#5-javada-class-ve-java-formatının-farkı-nedir)
- [Abstract class nedir,nasıl çalışır,ne işe yarar, 1 tane abstract class örneği.](#6-abstract-class-nedirnasıl-çalışırne-işe-yarar-1-tane-abstract-class-örneği)


## 1-JVM nedir ne işe yarar?
JVM (Java Virtual Machine) programın çalıştığı platform ile java programı arasında bir ara katman görevi görür. Geliştirme yapılacak platforma ( Windows, Linux) göre uygun uygulamaları vardır. JVM  içerisinde bytecode içeren .class uzantılı dosyaları anlayabilir. Bytecode’lar sayesinde ise uygulama herhangi bir platformda çalışabilir halde oluyor. Buna ise “Write once, run eveywhere” denir.



## 2-JDK nedir ne işe yarar? 
JDK (Java Development Kit) java ile geliştirme yapanlar için yorumlayıcı ve derleyici görevini üstlenir. 
JVM’e kütüphane sağlayan JRE (Java Runtime Environment), hata ayıklayıcılar ve  derleyicilerin bileşimi de denebilir. Program JDK olmadan çalışabilir. JRE programın çalışması için gerekli alyapıyı barındırır. Fakat JDK, JRE’den daha büyük bir pakettir.


## 3-Garbage Collector görevi nedir, Nasıl çalışır?
JVM ve onun içindeki Garbage Collector arka planda bellek yönetimini programcı yerine yapar. Bellek yönetimi ve serbest bırakma işlemleri yaparak önemli bir yere sahiptir. Garbage Collector’ı anlayarak daha efektif kod yazmak mümkündür.
Garbage Collection, kullanılmayan nesnelerin silinmesi ve bellekte alan açılması üzerine kuruludur. 3 farklı şekilde çalışır. 
1-	Minor GC: Nesneler ilk olarak başlangıç alanında oluşturulmuştu. Bu alan dolduğunda Minor GC devreye girer ve belirli olgunluğa ulaşan nesneleri alanlarından boş olanına taşır ve kullanılmayan nesneleri başlangıç alanından temizler.
2-	Major GC: Eski nesil alanda çalışıp, temizleme yapar. Minor GC sonrası çalışır.
3-	Full GC: Tüm heap alanında çalışır ve kullanılmayan tüm nesneleri heap alanından temizler.



## 4-.jar formatı nedir?
Jar java arşivi anlamında kullanılır. Amacı taşınabilirlik, depolama alanı kazancı gibi konularda avantaj sağlamasıdır. ZIP dosyaları ile aynıdır diyebiliriz. JRE tarafından Java dosyalarını ve bunula ilgili bilgileri saklayan dosya formatıdır.
Derli toplu bir şekilde bilgilerin saklanmasını sağlar. Sıkıştırılma özelliği ile indirme süresi kısalır.


## 5-Javada .class ve .java formatının farkı nedir?
.java formatı en başta derlenecek olan dosyadır. .Class formatı ise derlenen java dosyasını içerir. İçerdiği Bytecode sayesinde de istenilen platformda çalıştırılabilir.



## 6-Abstract class nedir,nasıl çalışır,ne işe yarar, 1 tane abstract class örneği.
Alt sınıflardan ortak kullanılacak sınıfa Abstrac class denir. Büyük projelerde kullanılan Abstract class’lar kalıtım özelliği ile kod tekrarını azaltmaya yarar. Nesne türetemezler. Gövde alt sınıf tarafından sağlanır.



```java
package com.company;

public class Main {

    public static void main(String[] args) {

        Engineers engineers = new Engineers();
        engineers.Maas(); //10.000 Mühendis Maaşı 
        engineers.çalışmaSaati(); // 8-17 çalışma saati

        Company engineers1 = new Engineers(); 
        engineers1.Maas(); // 10.000 Company ile oluşturdum sonuç değişmedi.
        engineers1.çalışmaSaati(); // 8-17

        productManager mng = new productManager();
        mng.Maas(); // 8000 manager maaşı
        mng.çalışmaSaati(); // 8-17

        Company mng2 = new productManager();
        mng2.çalışmaSaati(); // 8-17
        mng2.Maas(); // 8000
    }
}


abstract class Company{


    public Company() {

    }

    public abstract void Maas();

    public void çalışmaSaati(){
        System.out.println("8:00-17:00");
    }
}

class Engineers extends Company{
    
    @Override
    public void Maas() {
        System.out.println(10000);
    }
}

class productManager extends Company{

    @Override
    public void Maas() {
        System.out.println(8000);
    }
}

```