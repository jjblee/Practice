
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
//사용불가		System.out.println(localScope);
//사용불가		System.out.println(value);
		System.out.println(value2);
		System.out.println(staticVal);
	}
	
	public static void main(String[] args) {
	//스태틱 메소드 내에서 스태틱하지 않은 필드를 사용할 수 없음. 
//사용불가		System.out.println(globalScope);
//사용불가		System.out.println(localScope);
//사용불가		System.out.println(value);
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
