import java.util.*;
import java.io.*;
public class Arithmetic_maddmmaddmmm{
    
	//��Ŀ����s=a+aa+aaa+aaaa+aa...a��ֵ������a��һ�����֡�����2+22+222+2222+22222(��ʱ����5�������)������������м��̿��ơ�
	public static void main(String[] args) {
			/*Scanner in = new Scanner(System.in);
        	System.out.println("��������ֵ:");
        	int num = in.nextInt();
        	System.out.println("���������:");
        	int count = in.nextInt();
			countNum(num,count);*/
			
			BufferedReader stadin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("��������ֵ:");
			String input =stadin.readLine();
			int num = Integer.valueOf(input);
			System.out.println("���������:");
			String countString =stadin.readLine();
			int count = Integer.valueOf(countString);
        	countNum(num,count);
	}
	
	//���ܺ�
	public static void countNum(int num,int count) {
		int i = 0;
		int sum = 0;
		int gewei = num;
		do {
			i++;
			System.out.println("��ǰֵΪ"+num);
			sum+=num;    //���
			num=num*10+gewei;   //��һλnum��ֵ�����ڼ�һλ���ֵ�����
		} while (i<count);
		System.out.println("�ܺ�Ϊ:"+sum);
    	}
}