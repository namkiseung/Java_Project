package ȯ���ϱ�������Ʈ��ǥ��.copy;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;

public class �����⽺���� extends Thread{
	

	  public void run(){
		  Hashtable<String, Integer> �ؽÿ��� = new Hashtable<String, Integer>();
	        Random �⵵�������� = new Random();//�ϴ� �⵵ ������������
	        try {
	        // �ؽ� ���̺� Ű�� �� ���� �ֱ�
	        �ؽÿ���.put("											�̸�", �⵵��������.nextInt(100)+1900);
	        �ؽÿ���.put("											����", �⵵��������.nextInt(100)+1900);
	        �ؽÿ���.put("											�ڸ�", �⵵��������.nextInt(100)+1900);
	        �ؽÿ���.put("											�ָ�", �⵵��������.nextInt(100)+1900);
	        �ؽÿ���.put("											����", �⵵��������.nextInt(100)+1900);
	        �ؽÿ���.put("											����", �⵵��������.nextInt(100)+1900);
	        �ؽÿ���.put("											����", �⵵��������.nextInt(100)+1900);
	        �ؽÿ���.put("											����", �⵵��������.nextInt(100)+1900);
	        �ؽÿ���.put("											�̸�", �⵵��������.nextInt(100)+1900);
	        �ؽÿ���.put("											�ڸ�", �⵵��������.nextInt(100)+1900);
	        �ؽÿ���.put("											����", �⵵��������.nextInt(100)+1900);
	        �ؽÿ���.put("											���", �⵵��������.nextInt(100)+1900);
	        �ؽÿ���.put("											���", �⵵��������.nextInt(100)+1900);
	        �ؽÿ���.put("											����", �⵵��������.nextInt(100)+1900);
	        �ؽÿ���.put("											����", �⵵��������.nextInt(100)+1900);
	        �ؽÿ���.put("											�̸�", �⵵��������.nextInt(100)+1900);
	        �ؽÿ���.put("											�ڸ�", �⵵��������.nextInt(100)+1900);
	        �ؽÿ���.put("											����", �⵵��������.nextInt(100)+1900);
	        �ؽÿ���.put("											���", �⵵��������.nextInt(100)+1900);
	        �ؽÿ���.put("											�Ƹ�", �⵵��������.nextInt(100)+1900);
	        �ؽÿ���.put("											����", �⵵��������.nextInt(120)+1900);
	        �ؽÿ���.put("											���", �⵵��������.nextInt(100)+1900);
	        �ؽÿ���.put("											�̸�", �⵵��������.nextInt(100)+1900);
	        �ؽÿ���.put("											�ø��", �⵵��������.nextInt(100)+1900);
	        �ؽÿ���.put("											�����", �⵵��������.nextInt(100)+1900);
	        �ؽÿ���.put("											�̸�", �⵵��������.nextInt(100)+1900);
	        // �ؽ� ���̺� �ִ� �� ��������
	        Enumeration<String> �̱� = �ؽÿ���.keys();
	        System.out.println("		[���]   **õ�� ��� : �� ���� ���� ����� ��� ���ڵ��� ȣ���Ѵ� *");
	        System.out.println("						======= ���ð��� ����� ��� (����,����⵵) =======");
	        while(�̱�.hasMoreElements())
	        {
	            String ������� = �̱�.nextElement().toString();
	            Thread.sleep(�⵵��������.nextInt(300)+50);//0.05��~0.5�� ����
	            System.out.println(������� + " : "+�ؽÿ���.get(�������));
	        }
	        System.out.println("���丮�� ��� �����Ϸ��� [Enter] �Է��ϼ���.");
		      } catch (InterruptedException e) {
		        e.printStackTrace();
		      }
		    }
}		
	