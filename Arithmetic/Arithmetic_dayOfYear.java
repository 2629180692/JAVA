public class Arithmetic_dayOfYear{
    public static void main(String[] args){
		 int day=0;
         int month=0;
         int year=0;
         int sum=0;
         int leap;  
         System.out.print("��������,��,��\n");  
         Scanner input = new Scanner(System.in);
         year=input.nextInt();
         month=input.nextInt();
         day=input.nextInt();
         switch(month) /*�ȼ���ĳ����ǰ�·ݵ�������*/ 
         {  
         case 1:
             sum=0;break;  
         case 2:
             sum=31;break;  
         case 3:
             sum=59;break;  
         case 4:
             sum=90;break;  
         case 5:
             sum=120;break;  
         case 6:
             sum=151;break;  
         case 7:
             sum=181;break;  
         case 8:
             sum=212;break;  
         case 9:
             sum=243;break;  
         case 10:
             sum=273;break;  
         case 11:
             sum=304;break;  
         case 12:
             sum=334;break;  
         default:
             System.out.println("data error");break;
         }  
         sum=sum+day; /*�ټ��������µ�����*/ 
         if(year%400==0||(year%4==0&&year%100!=0))/*�ж��ǲ�������*/ 
             leap=1;  
         else 
             leap=0;  
         if(leap==1 && month>2)/*������������·ݴ���2,������Ӧ�ü�һ��*/ 
             sum++;  
         System.out.println("It is the the day:"+sum);
    }
}