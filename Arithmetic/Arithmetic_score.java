import java.util.Scanner;

public class Arithmetic_score{
    //��Ŀ�����������������Ƕ������ɴ��⣺ѧϰ�ɼ�> =90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60�����µ���C��ʾ��
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        System.out.println("������ɼ���");
        int N = in.nextInt();
        socerType(N);
	}

	public static void socerType(int n) {
	char result = '0';
        result = n>=90?'A':(n<60?'C':'B');
        //����д��n>=90?result='A':(n<60?result='C':result='B'); //��Ԫ�����Ҳ�Ƿ���һ��ֵ��
        System.out.println(result);
    }
}