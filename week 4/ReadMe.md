# Week-2

- [SOLID nedir?](#SOLID-nedir)
- [1-Single Responsibility](#1--single-responsibility)
- [2-Open/Closed](#2--openclosed)
- [3-Liskov Substitution](#3--liskov-substitution)
- [4-Interface Segregation](#4--interface-segregation)
- [5-Dependency Incersion](#5--dependency-incersion)
- [Single Design Pattern nedir?](#singleton-design-pattern-nedir)
- [Springte Application Proporties nedir?](#springde-application-proporties-nedir)
## SOLID nedir?
Solid nesene yönelik tasarımlarda daha anlaşılabilir, sürdürülebilir olmayı amaçlayan 5 tasarım ilkesinin baş harflerini temsil eder.
Bunlar;
Single Responsibility
Open Closed
Liskov Substitution
Interface Segregation
Dependecy Inversion
'dir.

## 1- Single Responsibility 
Single Responsibility(Tek sorumluluk), programda yazılan bir fonksiyonun sadece tek bir amacı olması gerektiğini temsil eden ilkedir. Bitkiler sınıfımız varsa, bu sınıf hayvanlarla ilgili bir görev yapmamalıdır.

## 2- Open/Closed 
Open/Closed(açık/kapalı), projedeki nesneler geliştirilebilir ama değiştirilemeaz anlayışını temsil eder. 

## 3- Liskov Substitution
Liskov Substitution(yerine geçme), yeni türettiğimiz sınıflar, üst sınıfın özelliklerini kullanabilmesine ve kendi de özellikler tanımlayabilmesine denir.

## 4- Interface Segregation
Interface Segregation(arayüz ayrımı) prensibiyle bir Interface oluşturup her şeyi ona yazmak yerine birden fazla Interface oluşturup daha rahat kod yazılabilir. 

## 5- Dependency Incersion
Dependency Inversion(Bağımlılıkları tersine çevirme) prensibine göre üst sınıfların alt sınıflara bağlı olmaması gereklidir. Bağımlılıklar en aza indirilmelidir.

## Singleton Design Pattern nedir?
Tekil tasarım deseni, bir nesnenin sadece bir örneği olmasını ve herhangi bir yerde çağrıldığında bu tek örneğin çalışması sağlar.

Singleton Design Pattern için basit bir kod örneği;
```
public class SingletonObject {

    private static SingletonObject name;

    private  SingletonObject(){}

    public static SingletonObject getName(){
        if (name == null){
            name = new SingletonObject();
        }
        return name;
    }

}
```

Main class'ında ise şu şekilde bunu kullanabiliriz;

```
public class Main {
    public static void main(String[] args) {
        SingletonObject name1 = SingletonObject.getName();
        SingletonObject name2 = SingletonObject.getName();
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name1 == name2); //true
    }
}
```
## Springde Application proporties nedir?
Yapılan uygulamanın ayarlarını yönetilen bir dosyadır. Bu dosyalar projemizin proportiler üzerinde değişiklik yapmamıza, değişkenlere değer atamamıza ve istediğimiz zaman değiştirmemize olanak sağlar.