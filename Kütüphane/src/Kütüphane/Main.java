package Kütüphane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kitap kitap1 = new Kitap();
		kitap1.setName("Çalıkuşu");
		kitap1.setId(1);
		kitap1.setType("Roman");
		
		Kitap kitap2 = new Kitap();
		kitap2.setName("Araba Sevdası");
		kitap2.setId(2);
		kitap2.setType("Roman");
		
		OgrenciUye ogrenci1 = new OgrenciUye();
		ogrenci1.setName("Ugur");
		ogrenci1.setId(123);
		ogrenci1.setSubeNo("4");
		
		OgrenciUye ogrenci2 = new OgrenciUye();
		ogrenci2.setName("Baki");
		ogrenci2.setId(124);
		ogrenci2.setSubeNo("3");
		
		OgretmenUye ogretmen1 = new OgretmenUye();
		ogretmen1.setName("Ahmet");
		ogretmen1.setId(212);
		ogretmen1.setCalismaSenesi(6);
		
		OgretmenUye ogretmen2 = new OgretmenUye();
		ogretmen2.setName("Mehmet");
		ogretmen2.setId(213);
		ogretmen2.setCalismaSenesi(9);
		
		OgrenciUye[] ogrenciler = {ogrenci1,ogrenci2};
		
		for (OgrenciUye ogrenciUye : ogrenciler) {
			System.out.println(ogrenciler);
			
		}

	}

}
