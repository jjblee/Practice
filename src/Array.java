
public class Array {
	public static void main(String[] args) {
		//�迭 �����ϱ�
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
		
		//�迭�� 1���� 100���� �� �ֱ�
		int[] iarray=new int[100];
		iarray[0]=1;
		iarray[1]=2;
		
		System.out.println(iarray.length);
		for(int i=0; i<iarray.length; i++) {
			iarray[i]=i+1;
		}
		System.out.println(iarray[55]);
		
		//�迭�� ����� �� ��� �����ֱ�
		int sum=0;
		for(int i=0; i<iarray.length; i++) {
			sum+=iarray[i];
		}
		System.out.println(sum);
		
		//���� 10�� �迭�� 0���� 2�� Ŀ���� �� �ֱ�
		int[] tarray=new int[10];
		for(int i=0; i<tarray.length; i++) {
			tarray[i]=2*i;
		}
		
		//�迭 ���� ��� �����ֱ�
		int mul=1;
		for(int i=0; i<5; i++) {
			mul=mul*iarray[i];
		}
		System.out.println(mul);
	}
}
