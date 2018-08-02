package 환생하기프로젝트발표용.copy;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;

public class 사망대기스레드 extends Thread{
	

	  public void run(){
		  Hashtable<String, Integer> 해시예제 = new Hashtable<String, Integer>();
	        Random 년도별랜덤값 = new Random();//일단 년도 랜덤값넣을거
	        try {
	        // 해시 테이블에 키와 값 집어 넣기
	        해시예제.put("											이모군", 년도별랜덤값.nextInt(100)+1900);
	        해시예제.put("											윤모씨", 년도별랜덤값.nextInt(100)+1900);
	        해시예제.put("											박모씨", 년도별랜덤값.nextInt(100)+1900);
	        해시예제.put("											최모씨", 년도별랜덤값.nextInt(100)+1900);
	        해시예제.put("											전모군", 년도별랜덤값.nextInt(100)+1900);
	        해시예제.put("											노모양", 년도별랜덤값.nextInt(100)+1900);
	        해시예제.put("											김모양", 년도별랜덤값.nextInt(100)+1900);
	        해시예제.put("											노모양", 년도별랜덤값.nextInt(100)+1900);
	        해시예제.put("											이모군", 년도별랜덤값.nextInt(100)+1900);
	        해시예제.put("											박모군", 년도별랜덤값.nextInt(100)+1900);
	        해시예제.put("											문모씨", 년도별랜덤값.nextInt(100)+1900);
	        해시예제.put("											김모군", 년도별랜덤값.nextInt(100)+1900);
	        해시예제.put("											김모군", 년도별랜덤값.nextInt(100)+1900);
	        해시예제.put("											김모양", 년도별랜덤값.nextInt(100)+1900);
	        해시예제.put("											노모양", 년도별랜덤값.nextInt(100)+1900);
	        해시예제.put("											이모군", 년도별랜덤값.nextInt(100)+1900);
	        해시예제.put("											박모군", 년도별랜덤값.nextInt(100)+1900);
	        해시예제.put("											문모씨", 년도별랜덤값.nextInt(100)+1900);
	        해시예제.put("											김모군", 년도별랜덤값.nextInt(100)+1900);
	        해시예제.put("											아모군", 년도별랜덤값.nextInt(100)+1900);
	        해시예제.put("											곽모군", 년도별랜덤값.nextInt(120)+1900);
	        해시예제.put("											노모군", 년도별랜덤값.nextInt(100)+1900);
	        해시예제.put("											이모군", 년도별랜덤값.nextInt(100)+1900);
	        해시예제.put("											궁모양", 년도별랜덤값.nextInt(100)+1900);
	        해시예제.put("											서모양", 년도별랜덤값.nextInt(100)+1900);
	        해시예제.put("											이모군", 년도별랜덤값.nextInt(100)+1900);
	        // 해시 테이블에 있는 값 꺼내오기
	        Enumeration<String> 뽑기 = 해시예제.keys();
	        System.out.println("		[명명]   **천왕 명명 : 현 시차 부터 명단을 들고 망자들을 호출한다 *");
	        System.out.println("						======= 동시간대 사망자 명단 (성함,출생년도) =======");
	        while(뽑기.hasMoreElements())
	        {
	            String 뽑은명단 = 뽑기.nextElement().toString();
	            Thread.sleep(년도별랜덤값.nextInt(300)+50);//0.05초~0.5초 사이
	            System.out.println(뽑은명단 + " : "+해시예제.get(뽑은명단));
	        }
	        System.out.println("스토리를 계속 진행하려면 [Enter] 입력하세요.");
		      } catch (InterruptedException e) {
		        e.printStackTrace();
		      }
		    }
}		
	