public class Arithmetic_FenJie{

    public static void getNumber(int number){
        int a = 2;
        System.out.print(number + "=");
        while(number > a){      //ȷ���ֽ��������2,��Ȼû������
            if(number % a == 0){    //�鿴���ֽ����Ƿ��ܱ�a����
                System.out.print(a + "*");    //������,���ӡ����
                number = number / a;    //number��ֵΪ����a��ʣ�µ���
            }else{
                a++;    //a�Լ�һ
            }
        }
        System.out.print(a);
    }

    public static void main(String[] args) {
        getNumber(Integer.parseInt(args[0]));
    }
}