public class Question3{
	public statis void main(String[] args){
		Thread m=Thread.currentThread();
		ThreadA t1= new ThreadA();
		t1.start();
	}
}

class ThreadA extend Thread{
	public void run(){
		for (int i=0; i<1000; i++){
			System.out.println("ThreadA");
			try(this.sleep(1000);) catch (Exception e) ()
 		}	
	}
}