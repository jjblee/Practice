
public class Array {
	public static void main(String[] args) {
		//배열 생성하기
		int[] array1=new int[4];
		array1[0]=4;
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		int value=array1[0];
		System.out.println(value);
		
		int[] array2=new int[] {1,2,3,4};
		System.out.println(array2[2]);
		
		int[] array3= {1,2,3,4};
		System.out.println(array3[3]);
		
		//배열에 1부터 100까지 값 넣기
		int[] iarray=new int[100];
		iarray[0]=1;
		iarray[1]=2;
		
		System.out.println(iarray.length);
		for(int i=0; i<iarray.length; i++) {
			iarray[i]=i+1;
		}
		System.out.println(iarray[55]);
		
		//배열에 저장된 값 모두 더해주기
		int sum=0;
		for(int i=0; i<iarray.length; i++) {
			sum+=iarray[i];
		}
		System.out.println(sum);
		
		//길이 10인 배열에 0부터 2씩 커지는 값 넣기
		int[] tarray=new int[10];
		for(int i=0; i<tarray.length; i++) {
			tarray[i]=2*i;
		}
		
		//배열 원소 모두 곱해주기
		int mul=1;
		for(int i=0; i<5; i++) {
			mul=mul*iarray[i];
		}
		System.out.println(mul);
	}
}
