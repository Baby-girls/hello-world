
public class Danyi2 {  //直接修改Vehicle1的类，添加其他的方法
   public static void main(String[]args) {
	   Vehicle1 vehicle=new Vehicle1();
	   vehicle.roadrun("汽车");
	   vehicle.waterrun("轮船");
	   vehicle.airrun("飞机");
   }
}
   class Vehicle1{
	   public void roadrun(String vehicle) {
         System.out.println(vehicle+"在路上跑....");
       }
	   public void waterrun(String vehicle) {
		   System.out.println(vehicle+"在水上走....");
	   }
	   public void airrun(String vehicle) {
		   System.out.println(vehicle+"在天上飞....");
	   }
  
   }
   //此方式比第一种方法简单，但都可以体现单一职责原则