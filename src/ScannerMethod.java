import java.util.Scanner;
public class ScannerMethod {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("���� �Է�:");
		int i=scan.nextInt();
		System.out.println(i);
		
		System.out.println("���ڿ� �Է�:");
		String st=scan.next();
		System.out.println(st);
		
		System.out.println("���ڿ� �Է�:");
		String str=scan.nextLine();
		System.out.println(str);
		
		System.out.println("���ڿ� �Է�:");
		String stt=scan.next();
		System.out.println(stt);
		
		System.out.println("�Ǽ� �Է�:");
		double j=scan.nextDouble();
		System.out.println(j);
		
		System.out.println(st+stt);
		
		scan.close();
	}
}
