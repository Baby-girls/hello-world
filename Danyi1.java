
public class Danyi1 {  //����ͨ���߷��࣬��Ϊ·�ϡ�ˮ�ϡ���������
   public static void main(String[]args) {
	   RoadVehicle a=new RoadVehicle();
	   WaterVehicle b=new WaterVehicle();
	   AirVehicle c=new AirVehicle();
	   a.run("����");
	   b.run("�ִ�");
	   c.run("�ɻ�");
   }
}
   class RoadVehicle{
      public void run(String a) {
    	  System.out.println(a+"��·����....");
      }
}
   class WaterVehicle{
	   public void run(String b) {
		   System.out.println(b+"��ˮ����....");
	   }
   }
   class AirVehicle{
	   public void run(String c) {
		   System.out.println(c+"�����Ϸ�....");
	   }
   }
   //ȱ�㣻���ִ����д�����鷳���۸�