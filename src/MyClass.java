
public class MyClass {
	//public ����Ÿ�� �޼ҵ�� (�Ű�����) {����}
	
	//�Ű������� ���� �����ϴ� �͵� ���� ������ �޼ҵ�
	public void method1() {
		System.out.println("m1�� �����");
	 }
	//������ �޾Ƶ��� ��, �������� �ʴ� �޼ҵ�
	public void method2(int x) {
		System.out.println(x+"�� �̿��� m2 ����");		
	}
	//�ƹ��͵� �޾Ƶ����� �ʰ�, ������ ��ȯ�ϴ� �޼ҵ�
	public int method3() {
		System.out.println("m3 ����");
		return 3;
	}
	//������ 2�� �Ű������� �ް�, �ƹ��͵� ��ȯ���� �ʴ� �޼ҵ�
	public void method4(int x, int y) {
		System.out.println(x+"��"+y+"�� �̿��� m4 ����");		
	}
	//������ �Ѱ� �޾Ƶ��� ��, ������ ��ȯ�ϴ� �޼ҵ�
	public int method5(int x) {
		System.out.println(x+"�� �̿��� m5 ����");
		return x*2;
	}
}