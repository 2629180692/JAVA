public class Arithmetic_pingfangshu{
    public static void main(String[] args){
		//һ��������������100����һ����ȫƽ����������168����һ����ȫƽ���������ʸ����Ƕ��٣� 
        for(int i=0;i<=100000;i++){
			if(Math.sqrt(i+100)%1==0&&Math.sqrt(i+268)%1==0){
				System.out.println(i);
			}
		}
    }
}