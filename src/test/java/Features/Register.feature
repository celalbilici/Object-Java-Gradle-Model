#language:tr
Özellik: Hepsiburada test
  @register

  Senaryo: Kullanici girisi yapilarak sepete urun eklenmesi hepsiburada
    Diyelim ki Hepsiburada sayfasini "https://www.hepsiburada.com/" acalim
    Ve "Giriş Yap" secenegine tiklanir
    Ve "email" alanına "deneme@gmail.com" yazılır
    Ve "password" alanına "test.123" yazılır
    Ve giriş butonuna tıklanır
    Ve kullanıcı ikonun yanında ad soyad kısmının "deneme deneme" olduğu görülür
    Ve arama bölümüne "Apple iPhone 8 64 GB (Apple Türkiye Garantili) (64 GB Gold)" yazılıp ara butonuna basılır
    Ve "Apple iPhone 8  64 GB (Apple Türkiye Garantili) (64 GB Gold)" adlı ürün seçilir
    Ve sepete iki adet ürün atılır
    Ve atılan ürünlerin "Apple iPhone 8 64 GB (Apple Türkiye Garantili) (64 GB Gold)" olduğu görülür

  @register
  Senaryo: Kullanici girisi yapilmadan sepete urun eklenmesi hepsiburada
    Diyelim ki Hepsiburada sayfasini "https://www.hepsiburada.com/" acalim
    Ve arama bölümüne "Apple iPhone 8 64 GB (Apple Türkiye Garantili) (64 GB Gold)" yazılıp ara butonuna basılır
    Ve "Apple iPhone 8  64 GB (Apple Türkiye Garantili) (64 GB Gold)" adlı ürün seçilir
    Ve sepete iki adet ürün atılır
    Ve atılan ürünlerin "Apple iPhone 8 64 GB (Apple Türkiye Garantili) (64 GB Gold)" olduğu görülür


