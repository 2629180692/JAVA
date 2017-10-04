public class Arithmetic_zhiShu{
    public static void main(String[] args){
        int start = 1;
        int end = 100;
        if(args!=null&&args.length>=2){
            start = Integer.parseInt(args[0]);
            end = Integer.parseInt(args[1]);
        }
        int count = 0;
        System.out.println("��"+start+"ѭ����"+end);
        for(int i =start;i<=end;i++){
            if(isZhiShu(i)){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isZhiShu(int num){
         //System.out.println("��"+num);
        if(num==2){
            return true;
        }
        if(num<2||num%2==0){    //2����С������,����С��2���ܱ�2�����Ķ���������
            return false;
        }
        
        for(int i =3;i<Math.sqrt(num);i=i+2){    //������ʼһֱ��num�Ŀ�������������(ż��һ����������,����ȫ��ȡ����.��������Ϊһ������)
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}