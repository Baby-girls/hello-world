
public class Producer implements Runnable {
    Clerk clerk;
    public Producer(Clerk clerk){
    	this.clerk=clerk;
    }
	@Override
	public void run() {
		// TODO 自动生成的方法存根
      System.out.println("生产者开始生产产品");
      while (true){
    	  try {
			Thread.currentThread();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
    	  clerk.addProduct();
      }
	}
}
