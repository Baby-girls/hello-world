
public class Danyi1 {  //将交通工具分类，分为路上、水上、天上三种
   public static void main(String[]args) {
	   RoadVehicle a=new RoadVehicle();
	   WaterVehicle b=new WaterVehicle();
	   AirVehicle c=new AirVehicle();
	   a.run("汽车");
	   b.run("轮船");
	   c.run("飞机");
   }
}
   class RoadVehicle{
      public void run(String a) {
    	  System.out.println(a+"在路上跑....");
      }
}
   class WaterVehicle{
	   public void run(String b) {
		   System.out.println(b+"在水上走....");
	   }
   }
   class AirVehicle{
	   public void run(String c) {
		   System.out.println(c+"在天上飞....");
	   }
   }
   //缺点；这种代码改写起来麻烦代价高