import java.util.Scanner;
public class IfElse {
	public static void main(String[] args) {
	System.out.println("����� ��: ");
	Scanner scanner=new Scanner(System.in);
	int num=scanner.nextInt();
	
	if (num<2) {
		System.out.println("2�̻� 9������ ���� �Է��ϼ���");
	} else if (num>9) {
		System.out.println("2�̻� 9������ ���� �Է��ϼ���");		
	} else {
		int i=1;
		while (i<10) {
			System.out.println(num*i);	
			i++;
		}
	}
	scanner.close();
}
}
