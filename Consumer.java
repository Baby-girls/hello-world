
public class Consumer implements Runnable {
  Clerk clerk;
  public Consumer(Clerk clerk)
  {
	  this.clerk=clerk;
  }
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
      System.out.println("�����߿�ʼ���Ѳ�Ʒ");
      while(true){
    	 try {
			clerk.consumeProduct();
		} catch (InterruptedException e) {
			// TODO �Զ����� catch ��
			e.printStackTrace();
		}
      }
      
	}

}
