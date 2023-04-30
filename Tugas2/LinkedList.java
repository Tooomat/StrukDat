package Praktikum.Tugas2;

//kegiatan2
class Node{
	int data;/*data of the list */
	Node nextNode;/* alamat atau pointer dari element selanjutnya*/
	Node prevNode;
	
	// a new node
	public Node(int data) {
		this.data = data;
	}
}

public class LinkedList {
	Node head = null;
	
	public void add(int newData) {
		if(head == null) {
			head = new Node(newData);
		}
		//int cek = 0;
		Node currentNode = head;
		//System.out.println("head : "+ head);
		//System.out.println(cek++ +"curr : " + currentNode);
		while(currentNode.nextNode != null) {
			currentNode = currentNode.nextNode;
			//System.out.println(cek++ +"curr : " + currentNode);
		}
		currentNode.nextNode = new Node(newData);
		//System.out.println(cek++ +"next : " + currentNode.nextNode);
		
	}

	public void show() {
		System.out.print("Head->");
		if(head == null) {
			return;
		}else if(head != null) {
			Node currentNode = head;
			int data;
			while(currentNode.nextNode != null) {
				currentNode = currentNode.nextNode;//alamat element selanjutnya menjadi node saai ini
				data = currentNode.data;
				System.out.print(data+"->");
			}
		}
		System.out.print("None");
	}
	
	public void shortList() {
		Node currentNode = head;
		Node indexNode ;
		int temp;
		if(head == null) {
			return;
		}else{
			currentNode = currentNode.nextNode;
			while(currentNode != null) {
				indexNode = currentNode.nextNode;
				while(indexNode != null) {
				    if(currentNode.data > indexNode.data){
				    	temp = currentNode.data;
				    	currentNode.data = indexNode.data;
				    	indexNode.data = temp;
				    }
				    indexNode = indexNode.nextNode;
				}
				currentNode = currentNode.nextNode;
			}
		}
	}
}
