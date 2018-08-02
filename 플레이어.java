package 환생하기프로젝트발표용.copy;

import java.util.Random;

public class 플레이어 extends 유닛 {	
	int 레벨=0; // 레벨이 오를 수록 다음단계의 지옥   
	int 상태=0; // 채워진 점수에 따라서 컨디션이 바뀐다. 50이상은 최상 아니면 언짢
	public int 점수=60;// 생전의 죄값이며 마지막 단계 지옥에서 일정점수를 받으면 인간으로 환생할지 동물로 환생할지 정해진다
	//int 현재점수; // 현재 가지고 있는 점수를 알려준다	
	//int 망자의요청; // 차사에게 추가 변호를 요청하는 것인데, 그러면 차사가 한번 더 체력을 회복시켜준다
	Random 플레이어나이 = new Random();
	Random 좌표 = new Random();
	
	public int 년도 = 플레이어나이.nextInt(118)+1900; 
	public int 월 = 플레이어나이.nextInt(11)+1;
	public static int x;
	public int y = 좌표.nextInt(255)+1;
	
	public double 레벨업(int 레벨) {
		this.레벨 = this.레벨 + 레벨;
		double 진행율 = Math.round((레벨 / 21.0) * 100);
		return 진행율;	
	}	
	public void 내정보(int 점수) {
	//내정보 메소드를 호출하면 점수 값을 돌려준다.
		System.out.println("          ○ 망자의 현재 죄 값은"+this.점수+"점 입니다.");
	}
	public void 내정보업데이트(int 점수) {
	//점수를 세팅한다.
		this.점수 = 점수; 
	}

	/*public void 컨디션관리(int 컨디션) {
		//차사 추가로 채워준 점수가 3점 이하면 컨디션이 ‘나쁨’ 4점이상은 ‘최상’
		if(컨디션>3) {//조건문으로 랜덤값으로 채워주는 점수에 따라 컨디션변화
			System.out.println("          ○ 망자의 컨디션 상태 : '최상' 입니다.");
		}else if(컨디션==3) {
			System.out.println("          ○ 망자의 컨디션 상태 : '불안' 입니다.");
		}else {
			System.out.println("          ○ 망자의 컨디션 상태 : '멘붕' 입니다.");
		}
	}*/
}

