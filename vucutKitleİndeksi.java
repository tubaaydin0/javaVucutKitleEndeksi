package deneme;
import java.util.Scanner;

public class vucutKitle�ndeksi {
	public static void main(String[] args) {
		double boy,kilo,index;
		Scanner input=new Scanner(System.in);
		System.out.print("Boyunuzu giriniz");
		boy=input.nextDouble();
		System.out.print("Kilonuzu giriniz");
		kilo=input.nextDouble();
		index=kilo/(boy*boy);
		System.out.print("V�cut kilo indeksiniz: "+index);
		
	}

}
