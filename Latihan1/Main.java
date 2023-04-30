package Praktikum.Latihan1;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Konsumsi> listKonsumsi  = new ArrayList<>();
		Konsumsi<Makanan, Minuman> breakfast = new Konsumsi<>();
		Konsumsi <Makanan, Minuman> Lunch  = new Konsumsi<>();

		Makanan roti  = new Makanan();
		roti.setNamaHidangan ("Roti Tawan");
		
		Minuman susu = new Minuman();
		susu.setNamaHidangan ("Susu Sani"); 
		breakfast.setKonsumsi (roti, susu);
		listKonsumsi.add(breakfast);

		Makanan nasi= new Makanan();
		nasi.setNamaHidangan ("Nasi Putih");
		Minuman air = new Minuman(); air.setNamaHidangan("Air Putih");
		
		Lunch.setKonsumsi (nasi, air);
		listKonsumsi.add(Lunch);
		System.out.println("Menu Konsumsi");

		for (Konsumsi<Makanan, Minuman> konsumsi: listKonsumsi){
			Makanan makanan = konsumsi.getM();
			Minuman minuman = konsumsi.getI();
			
			System.out.println(makanan.disantap());
			System.out.println(minuman.disantap());
		}
	}
}
