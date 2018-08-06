
class Syn {
	synchronized void printTable(int n){ 
		   for(int i=1;i<=5;i++){  
		     System.out.println(n*i);  
		     try{  
		      Thread.sleep(400);  
		     }catch(Exception e){System.out.println(e);}  
		   }  
		  
		 }  
		}  
		  
		class MyThread1 extends Thread{  
		Syn t;  
		MyThread1(Syn t){  
		this.t=t;  
		}  
		public void run(){  
		t.printTable(5);  
		}  
		}
		
		class MyThread2 extends Thread{  
		Syn t;  
		MyThread2(Syn t){  
		this.t=t;  
		}  
		public void run(){  
		t.printTable(100);  
		}
		}
		
		
		  
		public class ThreadSyn{
		public static void main(String args[]){  
	    Syn obj = new Syn(); 
		MyThread1 t1=new MyThread1(obj);  
		MyThread2 t2=new MyThread2(obj);  
		t1.start();  
		t2.start();  
		}
		}
		
	
