package ȯ���ϱ�������Ʈ��ǥ��.copy;

import java.util.Random;

public class �ð����ʿ������� extends Thread {
private int num=0;
	public �ð����ʿ�������(int num) {
	// TODO Auto-generated constructor stub
	this.num = num;
	}	
	
	  public void run(){
		  
		  Random sc = new Random(); 
			int ���������� = num;
			int �����ļ��� = ����������/2;
			int x,z,y,r;
			
			for(x=0; x<�����ļ���; x++) {
				if(x > �����ļ���/2) {
					r = �����ļ���-x;
				}else 
					r = x;
					for(y=�����ļ���; y>x+1; y--) {
						System.out.print(" ");
					}	
					for(z=0; z<2*(x+1); z++) {
						System.out.print("*");
					}
				System.out.println();
			}
			for(x=0; x<�����ļ���; x++) {
				for(y=0; y<x; y++) {
					System.out.print(" ");
				}	
				for(z=0; z<(�����ļ���-x)*2; z++) {
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


