package ȯ���ϱ�������Ʈ��ǥ��.copy;

public class ȯ�������5�ʽ����� extends Thread{
	  public void run(){
		    int n = 6;
		    while(n>0){
		      n--;
		      try {
		        Thread.sleep(900);
		      } catch (InterruptedException e) {
		        e.printStackTrace();
		      }
		      System.out.println(n+"�� ��");
		    }
		  }
}
