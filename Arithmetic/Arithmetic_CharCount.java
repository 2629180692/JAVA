public class Arithmetic_CharCount{
        //��Ŀ������һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ�����
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        	System.out.println("�������ַ�:");
        	String m = in.nextLine();
        	countNum(m);
	}
	
	public static void countNum(String m) {
		int english = 0;
		int blank = 0;
		int number = 0;
		int other = 0;
		int chinese = 0;
		String Echinese="[\u4e00-\u9fa5]";  //���ķ�Χ
		
		char[] charr= m.toCharArray();
		String[] strArr = new String[charr.length];
		for (int i = 0; i < charr.length; i++) {
			strArr[i] = String.valueOf(charr[i]);  //��char����ת����string����
			System.out.print("�ַ�: "+m.charAt(i));
			System.out.println(";�ֶ�Ӧ��ֵ: "+Integer.valueOf(m.charAt(i)));
		}
		
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i].matches(Echinese)) {
				chinese++;
			}else if (Character.isLetter(strArr[i].charAt(0))) {  //strArr[i].charAt(0)>=65&&strArr[i].charAt(0)<=90||strArr[i].charAt(0)>=97&&strArr[i].charAt(0)<=122
				english++;
			}else if (Character.isDigit(strArr[i].charAt(0))) {   //charr[i]>=48&&charr[i]<=57
				number++;
			}else if (charr[i]==32) {    //Character.isSpaceChar(strArr[i].charAt(0))
				blank++;
			}else {
				other++;
			}
		}
		System.out.println("��������:"+chinese);
		System.out.println("Ӣ������:"+english);
		System.out.println("�ո�����:"+blank);
		System.out.println("��������:"+number);
		System.out.println("�����ַ�����:"+other);
    }	
}