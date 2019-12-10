
public class Clerk {//店员

	/**
	 * @param args
	 */
    int product;
    public synchronized void addProduct(){//生产产品
    	if(product>=20)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO 自动生成 catch 块
				e.printStackTrace();
			}
		else
    	{
    		product++;
    		System.out.println(Thread.currentThread().getName()+":生产了第"+product+"个产品");
    		notifyAll();
    	}
    }
        public synchronized void consumeProduct() throws InterruptedException{//消费产品
        	if(product<=0)
        	   wait();
        	else
        	{
        		System.out.println(Thread.currentThread().getName()+":消费了第"+product+"个产品");
        		product--;
        		notifyAll();
        	}
        }
    }
	


