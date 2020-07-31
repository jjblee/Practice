
public class VariableScopeExam {
	int globalScope=10;
	static int staticVal=7;
	
	public void scopeTest(int value) {
		int localScope=20;
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
		
	}
	public void scopeTest2(int value2) {
		System.out.println(globalScope);
//���Ұ�		System.out.println(localScope);
//���Ұ�		System.out.println(value);
		System.out.println(value2);
		System.out.println(staticVal);
	}
	
	public static void main(String[] args) {
	//����ƽ �޼ҵ� ������ ����ƽ���� ���� �ʵ带 ����� �� ����. 
//���Ұ�		System.out.println(globalScope);
//���Ұ�		System.out.println(localScope);
//���Ұ�		System.out.println(value);
		System.out.println(staticVal);

		VariableScopeExam v1=new VariableScopeExam();
		System.out.println(v1.globalScope);
		VariableScopeExam v2=new VariableScopeExam();
		v1.globalScope=11;
		v2.globalScope=12;		
		System.out.println(v1.globalScope);
		System.out.println(v2.globalScope);
		
		System.out.println(v1.staticVal);
		v1.staticVal=30;
		v2.staticVal=40;
		System.out.println(v1.staticVal);
		System.out.println(VariableScopeExam.staticVal);
		
	}
	
	
}
