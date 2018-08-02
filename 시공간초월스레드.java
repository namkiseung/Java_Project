package 환생하기프로젝트발표용.copy;

import java.util.Random;

public class 시공간초월스레드 extends Thread {
private int num=0;
	public 시공간초월스레드(int num) {
	// TODO Auto-generated constructor stub
	this.num = num;
	}	
	
	  public void run(){
		  
		  Random sc = new Random(); 
			int 가공전숫자 = num;
			int 가공후숫자 = 가공전숫자/2;
			int x,z,y,r;
			
			for(x=0; x<가공후숫자; x++) {
				if(x > 가공후숫자/2) {
					r = 가공후숫자-x;
				}else 
					r = x;
					for(y=가공후숫자; y>x+1; y--) {
						System.out.print(" ");
					}	
					for(z=0; z<2*(x+1); z++) {
						System.out.print("*");
					}
				System.out.println();
			}
			for(x=0; x<가공후숫자; x++) {
				for(y=0; y<x; y++) {
					System.out.print(" ");
				}	
				for(z=0; z<(가공후숫자-x)*2; z++) {
					System.out.print("*");
				}
				System.out.println();		
			}	
	    try {
	      Thread.sleep(350);
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }
	  }
	}


