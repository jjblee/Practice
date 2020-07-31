
public class ReferenceTypeExam {

	public static void main(String[] args) {
		ReferenceTypeExam exam=new ReferenceTypeExam();
		
		int value=10;
		exam.addOne(value);
		System.out.println("기본형 변수의 값을 다른 메소드에서 변경한 결과:"+value);
		//기본형 타입은 다른 메소드에 매개변수로 전달될때, 10이라는 값이 그대로 전달됩니다.따라서 addOne에서 1을 더하더라도 value라는 변수에는 아무 영향이 없습니다.
		int[] arr= {10,3,1};
		exam.addOne(arr);
		System.out.println("참조형 변수의 값을 다른 메소드에서 변경한 결과:"+arr[0]+","+arr[1]+","+arr[2]);
		//참조형 타입은 다른 메소드에 매개변수로 전달될때, 변수의 주소가 전달됩니다
	}
		
		public void addOne(int value) {
			value=value+1;
		}
		
		public void addOne(int[] arr) {
			for(int i=0;i<arr.length;i++) {
				arr[i]++;
			}
		}
	
	}

