# 🏦 Java Konsol ATM Simülasyonu

Bu proje, Java kullanılarak geliştirilmiş temel bir ATM (Bankamatik) simülasyonudur. Kullanıcıların şifreleri ile güvenli bir şekilde giriş yapıp, bankacılık işlemlerini konsol ekranı üzerinden gerçekleştirmesini sağlar.

## 🚀 Özellikler

* **Güvenli Giriş Sistemi:** Kullanıcıdan şifre istenir (Varsayılan şifre: `1234`). Art arda 3 kez hatalı şifre girildiğinde güvenlik amacıyla kart bloke olur ve sistemden çıkış yapılır.
* **Bakiye Sorgulama:** Güncel hesap bakiyesini anlık olarak görüntüleme.
* **Para Çekme:** Hesaptan para çekme işlemi. Yetersiz bakiye durumunda akıllı kontrol mekanizması devreye girer ve uyarı vererek işlemi engeller.
* **Para Yatırma:** Hesaba istenilen tutarda güvenli para ekleme.
* **Şifre Değiştirme:** Sistem içindeyken mevcut şifreyi yeni bir şifre ile güncelleyebilme.
* **Kullanıcı Dostu Döngü:** İşlem bitiminde ana menüye otomatik dönüş ve istenildiği zaman "Çıkış" yapabilme esnekliği.

## 💻 Kullanılan Teknolojiler

* **Dil:** Java
* **Kütüphaneler:** `java.util.Scanner` (Kullanıcı etkileşimi ve veri alma işlemleri için)
* **Temel Yapılar:** `do-while` döngüleri ve `if-else` koşullu karar mekanizmaları.

## 🛠️ Nasıl Çalıştırılır?

1. Bu projeyi bilgisayarınıza klonlayın veya indirin.
2. VS Code veya tercih ettiğiniz herhangi bir terminal üzerinden dosyanın bulunduğu dizine gidin.
3. Kodu derlemek için terminale şu komutu yazın:
   `javac atmSistem.java`
4. Programı başlatmak için şu komutu çalıştırın:
   `java atmSistem`

---
*Bu proje, algoritma kurma ve yazılım geliştirme temellerini pratik yapmak amacıyla hazırlanmıştır.*
