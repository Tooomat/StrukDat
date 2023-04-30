package Praktikum.Tugas2;
import java.util.ArrayList;

//Kegiatan1
public class Hewan {
	public static void main(String[] args) {
		ArrayList<String> kumpulanHewan = new ArrayList<>();
		kumpulanHewan.add("Angsa");
		kumpulanHewan.add("Bebek");
		kumpulanHewan.add("Cicak");
		kumpulanHewan.add("Domba");
		kumpulanHewan.add("Elang");
		kumpulanHewan.add("Gajah");
		kumpulanHewan.add("Badak");
		kumpulanHewan.add("Bebek");
		
		System.out.println("Output:");
		System.out.println(kumpulanHewan);
		
		//mencari jumlah bebek
		int jumlahBebek = 0;
		for(int i=0; i<kumpulanHewan.size(); i++) {
			if(kumpulanHewan.get(i).equalsIgnoreCase("Bebek")) {
				jumlahBebek++;
			}
		}
		System.out.println("Bebek = " + jumlahBebek);
		
		//mencari indek dr bebek
		System.out.print("Posisi Indek Bebek: ");
		for(int i=0;i<kumpulanHewan.size();i++) {
			if(kumpulanHewan.get(i) == "Bebek") {
				System.out.print(i+", ");
			}
		}
		
		//menghapus posisi bebek pertama
		System.out.println("\n\nOutput2: ");
		kumpulanHewan.remove(1);
		System.out.println(kumpulanHewan);
		
		//Tampilkan elemen pada index ke-0 dan ke-2, selanjutnya hapus index ke-0.
		System.out.println("\nOutput3: ");
		System.out.println("Index ke-0: "+kumpulanHewan.get(0));
		System.out.println("Index ke-2: "+kumpulanHewan.get(2));
		kumpulanHewan.remove("Angsa");
		System.out.println(kumpulanHewan);
		
		
		System.out.println("\nOutput4: ");
		kumpulanHewan.set(0, "ular");
		System.out.println(kumpulanHewan);
		kumpulanHewan.add(2, "itik");
		System.out.println(kumpulanHewan);
		
		System.out.println("\nOutput5: ");
		int fromIndex = 1;
		int toIndex = 5;
		int n = (toIndex-fromIndex)-1;
		for(int i=1; i<n+1; i++) {
			kumpulanHewan.remove(fromIndex+1);
		}
		System.out.println(kumpulanHewan);

		System.out.println("\nOutput6: ");
		System.out.println("Element pertama: " + kumpulanHewan.get(0));
		System.out.println("Element terakhir: " + kumpulanHewan.get(kumpulanHewan.size()-1));
		
		System.out.println("\nOutput7: ");
		System.out.println("Size: " + kumpulanHewan.size());
		//mencari indek dr badak
		System.out.print("Posisi Indek Badak: ");
		for(int i=0;i<kumpulanHewan.size();i++) {
			if(kumpulanHewan.get(i) == "Badak") {
				System.out.print(i+", ");
			}
		}
		
	}

}
