package Praktikum.Latihan2;
import java.util.LinkedList;

public class LinkList {
	public static void main(String[] args) {
		LinkedList<String> hewan = new LinkedList<>();
		LinkedList<String> DeleteHewan = new LinkedList<>();
	
		hewan.add("sapi");
		hewan.add("kelinci");
		hewan.add("kambing");
		hewan.add("unta");
		hewan.add("domba");
		System.out.println("Hewan : "+hewan);
		
		DeleteHewan.add("kelinci");
		DeleteHewan.add("kambing");
		DeleteHewan.add("unta");
		System.out.println("Hewan yang dihapus: ");
		System.out.println(DeleteHewan);
		
		for(int i=0; i<hewan.size();i++) {
			for(int j=0; j<DeleteHewan.size();j++) {
				if(hewan.get(i) == DeleteHewan.get(j)) {
					hewan.remove(i);
				}
			}
		}
		
		System.out.println("Output hewan : ");
		System.out.println(hewan);
	}
}
