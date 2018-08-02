package 환생하기프로젝트발표용.copy;



public class 차사 extends NPC유닛{
	
	//int 스트레스; //판관에게 받은 스트레스
	//int 요청; //회복요청
	public void 추가변호(int i) {
		//망자에게 질문하고 5초를 센다 Thread적용하기
		switch(i) {
		case 1:
			//망자의 추가변호 받을 죄(점수) : 0 ~ 15점 사이
			//추가변호 받을 죄(횟수) : 3회
				System.out.println("          ○ 망자의 담당 차사는 : 기분파 차사 입니다.");
			break;
		case 2:
			//추가변호 받을 죄(점수) : 0 ~ 05점
			//추가변호 받을 죄(횟수) : 5회
				System.out.println("          ○ 망자의 담당 차사는 : 소심파 차사 입니다.");
			break;
		default:
			//추가변호 받을 죄(점수) : -5 ~ 10점
			//추가변호 받을 죄(횟수) : 7회
				System.out.println("          ○ 망자의 담당 차사는 : 도박파 차사 입니다.");
			break;
	}
		
	}
	public void 재심요청() {
	//망자 점수를 채운 후 천왕에게 다시한번 재심요청을 한다.
	}
	public void 환생() {
		//환생될 가능성을 나타낸다.
	}
	public void 추가점수() {
	//랜덤으로 (차사 성격대로나눠넛)추가점수 주기
	}
	
	/*public void 욕하기() {
	//판관에게 욕한다
	}*/
	
	
}
