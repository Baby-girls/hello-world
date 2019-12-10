
public class Consumer implements Runnable {
  Clerk clerk;
  public Consumer(Clerk clerk)
  {
	  this.clerk=clerk;
  }
	@Override
	public void run() {
		// TODO 自动生成的方法存根
      System.out.println("消费者开始消费产品");
      while(true){
    	 try {
			clerk.consumeProduct();
		} catch (InterruptedException e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
      }
      
	}

}
