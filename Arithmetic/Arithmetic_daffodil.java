/*��ӡ�����е� "ˮ�ɻ��� "����ν "ˮ�ɻ��� "��ָһ����λ�������λ���������͵��ڸ����������磺153��һ�� "ˮ�ɻ�
�� "����Ϊ153=1�����η���5�����η���3�����η���*/
public class Arithmetic_daffodil{
    public static void main(String[] args){
        for(int i=100;i<=999;i++){
            if(isDaffodial(i)){
                System.out.println(i); 
            }
        }
    }

    public static boolean isDaffodial(int num){
        int single = num%10;
        int ten = (num/10)%10;
        int hundred = (num/100)%10;
        /*System.out.println(num);
        System.out.println(single);
        System.out.println(ten);
        System.out.println(hundred);
        System.out.println("�ܺ�:"+(single*single*single+ten*ten*ten+hundred*hundred*hundred)); 
        */
        if((single*single*single+ten*ten*ten+hundred*hundred*hundred)==num){
            return true;
	}
        return false;
    }
}