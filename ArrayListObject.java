package ASD3;

import java.util.ArrayList;
public class ArrayListObject {

	public static void main(String[] args) {
	ArrayList<Mahasiswa> Data = new ArrayList<Mahasiswa>();
	Data.add(new Mahasiswa("ALIEF TAUFIK", "D0217385", "E", "saleppa"));
	Data.forEach(data ->{
	System.out.println("NAMA   : "+data.getNama());
	System.out.println("NIM    : "+data.getNim());
	System.out.println("KELAS  : "+data.getKelas());
	System.out.println("ALAMAT : "+data.getAlamat());	
	});
	}
}
