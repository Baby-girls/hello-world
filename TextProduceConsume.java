
public class TextProduceConsume {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
     Clerk clerk=new Clerk();
     Producer p1=new Producer(clerk); 
     Consumer c1=new Consumer(clerk); 
     Thread t1=new Thread(p1);
     Thread t2=new Thread(c1);
     t1.setName("������1");    
     t2.setName("������2");
     t1.start();
     t2.start();
	} 

}
