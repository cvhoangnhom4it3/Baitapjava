package hoang;

import java.util.Scanner;

public class stringbai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chuoi;
	    int doDai;
	    Scanner scanner = new Scanner(System.in);
	         
	    System.out.println("Nhập vào chuỗi bất kỳ từ bàn phím: ");
	    chuoi = scanner.nextLine();
	    doDai = chuoi.length();
	    System.out.println("Chuỗi " + chuoi + " có độ dài = " + doDai);
	}
	}


