
public class Clerk {//��Ա

	/**
	 * @param args
	 */
    int product;
    public synchronized void addProduct(){//������Ʒ
    	if(product>=20)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO �Զ����� catch ��
				e.printStackTrace();
			}
		else
    	{
    		product++;
    		System.out.println(Thread.currentThread().getName()+":�����˵�"+product+"����Ʒ");
    		notifyAll();
    	}
    }
        public synchronized void consumeProduct() throws InterruptedException{//���Ѳ�Ʒ
        	if(product<=0)
        	   wait();
        	else
        	{
        		System.out.println(Thread.currentThread().getName()+":�����˵�"+product+"����Ʒ");
        		product--;
        		notifyAll();
        	}
        }
    }
	


