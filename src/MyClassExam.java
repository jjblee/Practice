
public class MyClassExam {

	public void main(String[] args) {
		MyClass myclass=new MyClass();
		myclass.method1();
		myclass.method2(5);
		int value=myclass.method3(); //return값을 저장
		System.out.println("m3이 return한 값"+value);
		myclass.method4(6, 8);
		int value2=myclass.method5(7);
		System.out.println("m5이 return한 값"+value2);
		
	}

}
