public class Arithmetic_rabbit{
    public static void main(String[] args){
        int index =10;
        if(args!=null&&args.length>0){
            index = Integer.parseInt(args[0]);
        }
        
        //�ӵ�һ���¿�ʼ
        int i = 1;
        while(getNum(i)<index){
            i++;
        }
        System.out.println(index+"ֻ����,������Ҫ"+(i)+"����");
        /*�鿴ÿ�������ӵ�����
        for(int i=1;i<=index;i++){
            System.out.println("��"+i+"����,��"+getNum(i));   
        }*/
    }
    //�ݹ�,�����ϸ��µ����Ӻ�����¼����������ӻ����������ӵ��ܺ�
    public static int getNum(int month){
        if(month==1||month==2){
            return 1;
        }else{
            return getNum(month-1)+getNum(month-2);
        }
    }
}