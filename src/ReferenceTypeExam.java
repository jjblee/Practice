
public class ReferenceTypeExam {

	public static void main(String[] args) {
		ReferenceTypeExam exam=new ReferenceTypeExam();
		
		int value=10;
		exam.addOne(value);
		System.out.println("�⺻�� ������ ���� �ٸ� �޼ҵ忡�� ������ ���:"+value);
		//�⺻�� Ÿ���� �ٸ� �޼ҵ忡 �Ű������� ���޵ɶ�, 10�̶�� ���� �״�� ���޵˴ϴ�.���� addOne���� 1�� ���ϴ��� value��� �������� �ƹ� ������ �����ϴ�.
		int[] arr= {10,3,1};
		exam.addOne(arr);
		System.out.println("������ ������ ���� �ٸ� �޼ҵ忡�� ������ ���:"+arr[0]+","+arr[1]+","+arr[2]);
		//������ Ÿ���� �ٸ� �޼ҵ忡 �Ű������� ���޵ɶ�, ������ �ּҰ� ���޵˴ϴ�
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

