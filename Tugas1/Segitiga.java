package Praktikum.Tugas1;

public class Segitiga <T extends Number>{
	private T a, t;
	
	//constructor
	public Segitiga(T alas, T tinggi) {
		this.a = alas;
		this.t = tinggi;
	}
	
	public T getAlas() {
		return a;
	}

	public T getTinggi() {
		return t;
	}

	public int getResultAsInt() {
		return ((int)getAlas()*(int)getTinggi())/2;	
	}

	public double getResultAsDouble() {
		return ((double)getAlas()*(double)getTinggi())/2;
	}
}