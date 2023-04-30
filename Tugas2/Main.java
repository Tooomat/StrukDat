package Praktikum.Tugas2;

//kegiatan2
public class Main {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(8);
		list.add(4);
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(7);
		list.add(6);
		System.out.println("Before: ");
		list.show();
		System.out.println("\nAfter: ");
		list.shortList();
		list.show();
	}
}
