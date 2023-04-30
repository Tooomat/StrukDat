package Praktikum.Tugas1;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int pilihan;
		int[] arr = new int[2];
		Scanner In = new Scanner(System.in);
		
		System.out.println("=== HITUNG LUAS SEGITIGA ===\n");
		try {
			System.out.println("Mau menampilkan hasil luas dalam bentuk? :\n"
							+ "1. Hasil to integer\n"
							+ "2. Hasil to double\n"
							+ "Masukkan pilihan 1/2");
			pilihan = In.nextInt();
		
			System.out.println("Masukkan Nilai Alas Dan Tinggi Secara Berurutan :");
			for(int i =0; i<arr.length; i++) {
				arr[i] = In.nextInt();
			}
		
			if(pilihan == 1) {
					Segitiga<Integer> luasTipeInt = new Segitiga<>(arr[0], arr[1]);
					System.out.println("luas Segitiga Dalam Integer: " + luasTipeInt.getResultAsInt());
			}else if(pilihan == 2) {
					Segitiga<Double> luasTipeDouble = new Segitiga<>((double)arr[0],(double)arr[1]);
					System.out.println("luas Segitiga Dalam Double: " + luasTipeDouble.getResultAsDouble());
			}else {
					throw new Exception("INPUTAN HARUS 1 DAN 2 !!!");
			}
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			Scanner inp = new Scanner(System.in);
			String pilih;
			System.out.println("apakah anda ingin melanjutkan program? [y/n] ");
			pilih = inp.next();
			if(pilih.equalsIgnoreCase("y")) {
				main(args);
			}
			inp.close();
		}
		In.close();
	}
}