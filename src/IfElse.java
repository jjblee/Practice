import java.util.Scanner;
public class IfElse {
	public static void main(String[] args) {
	System.out.println("출력할 단: ");
	Scanner scanner=new Scanner(System.in);
	int num=scanner.nextInt();
	
	if (num<2) {
		System.out.println("2이상 9이하의 값을 입력하세요");
	} else if (num>9) {
		System.out.println("2이상 9이하의 값을 입력하세요");		
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
