package cn;

public class SyncThread implements Runnable {
	private static int count;

	public SyncThread() {
		count = 0;
	}

	//类锁，锁定静态方法
	public synchronized static void method() {
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println(Thread.currentThread().getName() + ":" + (count++));
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	//类锁，锁定代码块
	public static void method2() {
	      synchronized(SyncThread.class) {
	         for (int i = 0; i < 5; i ++) {
	            try {
	               System.out.println(Thread.currentThread().getName() + ":" + (count++));
	               Thread.sleep(100);
	            } catch (InterruptedException e) {
	               e.printStackTrace();
	            }
	         }
	      }
	   }

	public void run() {
		//分别使用以下两个方法来验证类锁。
		//method();
		method2();
	}
	
	public static void main(String args[]){
		SyncThread syncThread1 = new SyncThread();
		SyncThread syncThread2 = new SyncThread();
		Thread thread1 = new Thread(syncThread1, "SyncThread1");
		Thread thread2 = new Thread(syncThread2, "SyncThread2");
		thread1.start();
		thread2.start();
	}
	
}
