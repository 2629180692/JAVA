public class Arithmetic_yeji{
    public static void main(String[] args){
        /*��Ŀ����ҵ���ŵĽ������������ɡ�����(I)���ڻ����10��Ԫʱ���������10%���������10��Ԫ������20��Ԫʱ������10��
    	Ԫ�Ĳ��ְ�10%��ɣ�����10��Ԫ�Ĳ��֣��ɿ����7.5%��20��40��֮��ʱ������20��Ԫ�Ĳ��֣������5%��40��60��֮��ʱ��
    	��40��Ԫ�Ĳ��֣������3%��60��100��֮��ʱ������60��Ԫ�Ĳ��֣������1.5%������100��Ԫʱ������100��Ԫ�Ĳ��ְ�1%��ɣ���
    	�������뵱������I����Ӧ���Ž���������*/
    	Scanner scanner = new Scanner(System.in);
    	double jj = 0;
    	System.out.println("����������(��Ԫ)");
    	int lirun= scanner.nextInt();
    	if (lirun<=10) {
			jj=lirun*0.1;
		}else if(lirun>10&&lirun<=20) {
			jj=10*0.1+(lirun-10)*0.75;
		}else if (lirun>20&&lirun<=40) {
			jj=10*0.1+10*0.75+(lirun-20)*0.05;
		}else if (lirun>40&&lirun<=60) {
			jj=10*0.1+10*0.75+20*0.05+(lirun-40)*0.03;
		}else if (lirun>60&&lirun<=100) {
			jj=10*0.1+10*0.75+20*0.05+20*0.03+(lirun-60)*0.015;
		}else if (lirun>100) {
			jj=10*0.1+10*0.75+20*0.05+20*0.03+40*0.015+(lirun-100)*0.01;
		}
    	System.out.println("���Ϊ"+jj+"��Ԫ");
    }
}