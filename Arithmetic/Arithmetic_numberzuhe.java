public class Arithmetic_numberzuhe{
    //��Ŀ����1��2��3��4�����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣�
    public static void main(String[] args){
        int bai = 0;
		int shi = 0;
		int ge = 0;
		for (bai = 1; bai <= 4; bai++) {
			for ( shi = 1; shi <= 4; shi++) {
				for (ge = 1; ge <= 4; ge++) {
					if (bai!=shi&&bai!=ge&&shi!=ge) {
						System.out.println(bai*100+shi*10+ge);
					}
				}
			}
		}
    }
}