
public class Danyi2 {  //ֱ���޸�Vehicle1���࣬��������ķ���
   public static void main(String[]args) {
	   Vehicle1 vehicle=new Vehicle1();
	   vehicle.roadrun("����");
	   vehicle.waterrun("�ִ�");
	   vehicle.airrun("�ɻ�");
   }
}
   class Vehicle1{
	   public void roadrun(String vehicle) {
         System.out.println(vehicle+"��·����....");
       }
	   public void waterrun(String vehicle) {
		   System.out.println(vehicle+"��ˮ����....");
	   }
	   public void airrun(String vehicle) {
		   System.out.println(vehicle+"�����Ϸ�....");
	   }
  
   }
   //�˷�ʽ�ȵ�һ�ַ����򵥣������������ֵ�һְ��ԭ��