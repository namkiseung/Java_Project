package 환생하기프로젝트발표용.copy;

public class 환생초재기5초스레드 extends Thread{
	  public void run(){
		    int n = 6;
		    while(n>0){
		      n--;
		      try {
		        Thread.sleep(900);
		      } catch (InterruptedException e) {
		        e.printStackTrace();
		      }
		      System.out.println(n+"초 전");
		    }
		  }
}
