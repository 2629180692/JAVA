public class Arithmetic_threeNumSort{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
		System.out.println("������������");
		int i = scanner.nextInt();
		int j = scanner.nextInt();
		int k = scanner.nextInt();
		int temp = 0;
		if (i>j) {   //�����һ���ȵڶ�����,�򻥻�λ��
			temp = i;
			i=j;
			j=temp;
		}
		if (i>k) {  //�����һ���ȵ�������,�򻥻�λ��
			temp=i;
			i=k;
			k=temp;
		}
		if (j>k) {  //����ڶ����ȵ�������,�򻥻�λ��
			temp=j;
			j=k;
			k=temp;
		}
		System.out.println("��С��������:"+i+","+j+","+k);
    }
}