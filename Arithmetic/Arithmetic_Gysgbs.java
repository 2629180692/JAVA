public class Arithmetic_Gysgbs{
    //��Ŀ����������������m��n���������Լ������С��������
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("�������һ�����֣�");
        int m = in.nextInt();
        System.out.println("������ڶ������֣�");
        int n = in.nextInt();
        System.out.println("���Լ��:"+getMaxMult(m,n));
        System.out.println("--------------------------");
        System.out.println("��С������:"+gbs(m,n));
	}
	//�������������Լ��
	public static int getMaxMult(int m,int n) {
		if (n == 0) {
			return m;
		} else {
			System.out.println("mֵΪ"+m+"��nֵΪ"+n);
			return getMaxMult(n, m % n);   //շת�����
		}
        }
	//������������С������
	public static int gbs(int m,int n) {
		int gys = getMaxMult(m,n);
		return m*n/gys;    //������˳������Լ��������С������
        }
}