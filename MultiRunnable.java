
public class MultiRunnable implements Runnable{
	public void run(){  
		System.out.println("Thread is running...");  
		}  
		  
		public static void main(String args[]){  
		MultiRunnable m1=new MultiRunnable();  
		Thread t1 =new Thread(m1);  
		t1.start();  
		 }  
}
