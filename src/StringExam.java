
public class StringExam {

	public static void main(String[] args) {
		//new ������ ��� x
		String str1="hello";
		String str2="hello"; //str1�� str2�� ������ �ν��Ͻ��� ����
		
		//new ������ ���
		String str3=new String("hello"); //new�� ������ ���ο� �ν��Ͻ� ����
		String str4=new String("hello");
		
		if(str1==str2) { 
			System.out.println("1. ����");
		} //������ ���۷���(�ּ�) ��
		if(str1==str3) {
			System.out.println("2. ����");
		}
		if(str3==str4) {
			System.out.println("3. ����");
		}
		
		if(str3.equals(str4)) {
			System.out.println("4. ����");
		} //������ �����ϴ� ���ڿ��� ������ ��
		
		
		
		System.out.println(str1);
		System.out.println(str1.substring(2));//index�������� ���ڿ� �ڸ� ���
		System.out.println(str1);//string Ŭ������ ���� ���� ������ ����
		
	}

}
