import java.util.Scanner;
public class ScannerMethod {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("정수 입력:");
		int i=scan.nextInt();
		System.out.println(i);
		
		System.out.println("문자열 입력:");
		String st=scan.next();
		System.out.println(st);
		
		System.out.println("문자열 입력:");
		String str=scan.nextLine();
		System.out.println(str);
		
		System.out.println("문자열 입력:");
		String stt=scan.next();
		System.out.println(stt);
		
		System.out.println("실수 입력:");
		double j=scan.nextDouble();
		System.out.println(j);
		
		System.out.println(st+stt);
		
		scan.close();
	}
}
