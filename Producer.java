
public class Producer implements Runnable {
    Clerk clerk;
    public Producer(Clerk clerk){
    	this.clerk=clerk;
    }
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
      System.out.println("�����߿�ʼ������Ʒ");
      while (true){
    	  try {
			Thread.currentThread();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO �Զ����� catch ��
			e.printStackTrace();
		}
    	  clerk.addProduct();
      }
	}
}
