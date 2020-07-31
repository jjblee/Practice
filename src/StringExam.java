
public class StringExam {

	public static void main(String[] args) {
		//new 연산자 사용 x
		String str1="hello";
		String str2="hello"; //str1과 str2은 동일한 인스턴스를 참조
		
		//new 연산자 사용
		String str3=new String("hello"); //new는 무조건 새로운 인스턴스 생성
		String str4=new String("hello");
		
		if(str1==str2) { 
			System.out.println("1. 같음");
		} //변수의 레퍼런스(주소) 비교
		if(str1==str3) {
			System.out.println("2. 같음");
		}
		if(str3==str4) {
			System.out.println("3. 같음");
		}
		
		if(str3.equals(str4)) {
			System.out.println("4. 같음");
		} //변수가 저장하는 문자열이 같은지 비교
		
		
		
		System.out.println(str1);
		System.out.println(str1.substring(2));//index지점에서 문자열 자른 결과
		System.out.println(str1);//string 클래스의 내부 값은 변하지 않음
		
	}

}
