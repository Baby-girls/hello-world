
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;




public class ThreadPool {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
    ExecutorService pool=Executors.newFixedThreadPool(2);
    Thread t1=new MyThread();
    Thread t2=new MyThread();
    pool.execute(t1);
    pool.execute(t2);
    pool.shutdown();
	}
}
