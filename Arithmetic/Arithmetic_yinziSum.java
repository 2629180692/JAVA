import java.util.Scanner;

public class Arithmetic_yinziSum{
    //��Ŀ��һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ "���� "������6=1��2��3.���   �ҳ�1000���ڵ�����������
    	public static void main(String[] args) {
		for(int i=1;i<=1000;i++){
			boolean result=isWanShu(i);
			if(result){
				System.out.println(i);
			}
		}
	}
	
	public static boolean isWanShu(int number) {
		int sum = 0;
		for(int i=1;i<number;i++){
			if(number%i==0){
				sum+=i;
			}
		}
		if(sum==number){
			return true;
		}else{
			return false;
		}
    	}
}