package Praktikum.Tugas4;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DataPraktikan {
	private HashMap<String, String> tabelData;
	
	public DataPraktikan() {
		tabelData =  new HashMap<>();
	}
	boolean tambahData(String nimPraktikan, String namaAsisten) {
		if(nimPraktikan.charAt(0) == 'I' && nimPraktikan.charAt(1) == 'F'){
			System.out.println("--Tambah Data Baru--");
			System.out.println("Masukkan Nim : "+nimPraktikan);
			System.out.println("Masukkan Nama Asisten : "+namaAsisten);
			tabelData.put(nimPraktikan, namaAsisten);
			return true;
		}	
		return false;
		
	}
	
	void tampil() {
		System.out.println("\nTotal Data Yang Tersimpan : " + totalEmail());
		for(Map.Entry<String, String> e : tabelData.entrySet()) {
			System.out.println("Nim : "+ e.getKey() + "\tNama Asisten : "+ e.getValue());
		}
	}
	
	void listNimPraktikan() {
		for(String key : tabelData.keySet()) {
			System.out.println("Nim : "+ key);
		}
	}
	
	void listNamaAsisten() {
		for(String value : tabelData.values()) {
			System.out.println("Nama Asisten : "+value);
		}
	}
	
	int totalEmail() {
		int count = 0;
		for(Map.Entry<String, String> data: tabelData.entrySet()) {
			count++;
		}
		return count;
	}
	
	boolean hapusData(String nimPraktikan, String namaAsisten) {
		for(Map.Entry<String, String> keyValue: tabelData.entrySet()) {
			if(keyValue.getKey().equals(nimPraktikan) && keyValue.getValue().equals(namaAsisten)) {
				tabelData.remove(keyValue.getKey(), keyValue.getValue());
				return true;
			}
		}
		return false;
	}
	
	void editData(String nimPraktikan, String namaAsisten) {
		if(tabelData.containsKey(nimPraktikan)) {
			tabelData.remove(tabelData.values());
			tabelData.put(nimPraktikan, namaAsisten);
		}else if(totalEmail() == 0){
			System.out.println("Data Masih Kosong");
		}else if(!tabelData.containsKey(namaAsisten)) {
			System.out.println("Tidak ada yang cocok untuk diedit");
		}
	}
	
	public static void main(String[] args) {
	    DataPraktikan data = new DataPraktikan();
	    Scanner in = new Scanner(System.in);
	    Scanner in2 = new Scanner(System.in);
	    String nim, asisten;
	    
	    int menu;
	    do {
	        System.out.println("---------------Pilih Menu---------------");
	        System.out.println("1. Tambah Data        2. Tampilkan Data");
	        System.out.println("3. Ubah Data          4. Hapus Data");
	        System.out.println("5. Total Data         6. List Nim");
	        System.out.println("7. List Nama Asisten  8. Keluar");
	        System.out.print("Pilih Menu : ");
	        menu = in.nextInt();
	        
	        switch (menu) {
	        case 1:
	            System.out.println("\n--Tambah Data--");
	            System.out.print("Nim : ");
	            nim = in2.nextLine(); 
	            System.out.print("Nama Asisten : ");
	            asisten = in2.nextLine();    
	            data.tambahData(nim, asisten);
	            break;
	        case 2:
	            data.tampil();
	            break;
	        case 3:
	            System.out.println("\n--Edit Data--");
	            System.out.print("Nim : ");
	            nim = in2.nextLine();
	            System.out.print("Nama Asisten Baru : ");
	            asisten = in2.nextLine();    
	            data.editData(nim, asisten);
	            break;
	        case 4:
	            System.out.println("\n--Hapus Data--");
	            System.out.print("Nim : ");
	            nim = in2.nextLine(); 
	            System.out.print("Nama Asisten : ");
	            asisten = in2.nextLine();    
	            data.hapusData(nim, asisten);
	            break;
	        case 5:
	            System.out.println("Total Data : "+data.totalEmail());
	            break;
	        case 6:
	            data.listNimPraktikan();
	            break;
	        case 7:
	            data.listNamaAsisten();
	            break;
	        case 8:
	            System.exit(0);
	            break;
	        default:
	            System.out.println("Pilihan tidak valid!");
	            break;
	        }
	        
	        System.out.println();
	    } while (menu != 8);
	}
}