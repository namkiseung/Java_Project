package 환생하기프로젝트발표용.copy;

public class 초재기7초스레드 extends Thread{
	  public void run(){
		    int n = 7;
		    while(n>0){
		      n--;
		      try {
		        Thread.sleep(1000);
		      } catch (InterruptedException e) {
		        e.printStackTrace();
		      }
		      System.out.print(n+"초     |");
		    }
		  }
}
