package ȯ���ϱ�������Ʈ��ǥ��.copy;

public class �����7�ʽ����� extends Thread{
	  public void run(){
		    int n = 7;
		    while(n>0){
		      n--;
		      try {
		        Thread.sleep(1000);
		      } catch (InterruptedException e) {
		        e.printStackTrace();
		      }
		      System.out.print(n+"��     |");
		    }
		  }
}
