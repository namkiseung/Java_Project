package 환생하기프로젝트발표용.copy;

import java.util.Random;

public class NPC유닛 extends 초재기스레드{
	int 기분파추가점수;
	int 소심파추가점수;
	int 도박파추가점수;
	
	public int 실적; //점 수를 채운 횟수마다 실적이 1씩 증가한다
	public int 추가변호받기=0;//사용자가 선택한 차사의 value 저장
	Random 체벌할점수범위 = new Random(); // 체벌 점수범위를 가져올 클래스 인스턴스화
	
	int 정규체벌 = 5; //정규직판관 체벌점수
	int 도박파차사횟수=7;int 소심파차사횟수=5;int 기분파차사횟수=3;//기분파 추가변호점수 횟수
	public int 변동점수 = 0;
	public int 인턴체벌하기(int 현재점수) {
		//망자의 점수를 깎는다
		this.변동점수 = 현재점수 - 체벌할점수범위.nextInt(3)-2;
		return this.변동점수;
	}
	public int 계약직체벌하기(int 현재점수) {
		//망자의 점수를 깎는다
		this.변동점수 = 현재점수 - 체벌할점수범위.nextInt(3)-5;;
		return this.변동점수;
	}
	public int 정규직체벌하기(int 현재점수) {
		//망자의 점수를 깎는다
		this.변동점수 = 현재점수 - 정규체벌;
		return this.변동점수;
	}
	public int 추가변호인자(int 번호) {
		this.추가변호받기 = 번호;
		return this.추가변호받기;
	}	
	public int 변호하기(int 현재점수) {
	//망자의 점수를 채워준다
		this.변동점수 = 현재점수 + 3;
		return this.변동점수;
	}
	public void 추가변호(int 값) {
		
		if(추가변호받기==1) {
			//망자의 추가변호 받을 죄(점수) : 0 ~ 15점 사이
			//추가변호 받을 죄(횟수) : 3회
			if(기분파차사횟수>0) {
			this.기분파추가점수 = 체벌할점수범위.nextInt(16);//기분파 추가변호점수 횟수,범위
				System.out.println("          ○ 망자의 담당 차사는 : 기분파 차사 입니다.");
				System.out.println("          ○ 추가로 변호한 점수 : (+"+기분파추가점수+"점) 입니다.");
					//컨디션관리로직
					if(기분파추가점수>9) {//추가변호시 나타냄
						System.out.println("          ○ 망자의 컨디션 상태 : '최상' 입니다.");
					}else if(기분파추가점수>0 && 기분파추가점수<10) {
						System.out.println("          ○ 망자의 컨디션 상태 : '불안' 입니다.");
					}else {
						System.out.println("          ○ 망자의 컨디션 상태 : '멘붕' 입니다.");
					}
				기분파차사횟수--;
				System.out.println("          ○ 사용가능 변호 횟수 : ("+기분파차사횟수+"회/3회) 입니다.");
				if(기분파차사횟수==0) {
					System.out.println("          ○ 망자의 담당 차사는 : 기간만료 되었습니다.");
				}
			}else{
			System.out.println("          ○ 망자의 담당 차사는 : 소심파 차사 였습니다.");
			System.out.println("          ○ 추가로 변호한 점수 : (0점) 입니다.");
			System.out.println("          ○ 망자의 담당 차사는 : 계약만료 되었습니다.");
			}
		}else if(추가변호받기==2) {
			//추가변호 받을 죄(점수) : 0 ~ 05점
			//추가변호 받을 죄(횟수) : 5회
				if(소심파차사횟수>0) {
				this.소심파추가점수= 체벌할점수범위.nextInt(6);//기분파 추가변호점수 횟수, 범위
				System.out.println("          ○ 망자의 담당 차사는 : 소심파 차사 입니다.");
				System.out.println("          ○ 추가로 변호한 점수 : (+"+소심파추가점수+"점) 입니다.");
					//컨디션관리로직
					if(소심파추가점수>3) {//추가변호시 나타냄
						System.out.println("          ○ 망자의 컨디션 상태 : '긴장' 입니다.");
					}else if(소심파추가점수>0 && 소심파추가점수<4) {
						System.out.println("          ○ 망자의 컨디션 상태 : '불안초조' 입니다.");
					}else {
						System.out.println("          ○ 망자의 컨디션 상태 : '멘붕' 입니다.");
					}
				
				소심파차사횟수--;
				System.out.println("          ○ 사용가능 변호 횟수 : ("+소심파차사횟수+"회/5회) 입니다.");
				}else{
					System.out.println("          ○ 망자의 담당 차사는 : 소심파 차사 였습니다.");
					System.out.println("          ○ 추가로 변호한 점수 : (0점) 입니다.");
					System.out.println("          ○ 망자의 담당 차사는 : 계약만료 되었습니다.");
				}
		}else if(추가변호받기==3) {
			//추가변호 받을 죄(점수) : -5 ~ 10점
			//추가변호 받을 죄(횟수) : 7회
				if(도박파차사횟수>0) {
				this.도박파추가점수= 체벌할점수범위.nextInt(16)-5;//기분파 추가변호점수 횟수, 범위
				System.out.println("          ○ 망자의 담당 차사는 : 도박파 차사 입니다.");
				System.out.println("          ○ 추가로 변호한 점수 : (+"+도박파추가점수+"점) 입니다.");
					//컨디션관리로직
					if(도박파추가점수>5) {//추가변호시 나타냄
						System.out.println("          ○ 망자의 컨디션 상태 : '천만다행' 입니다.");
					}else if(도박파추가점수>0 && 도박파추가점수<6) {
						System.out.println("          ○ 망자의 컨디션 상태 : '애매' 입니다.");
					}else {
						System.out.println("          ○ 망자의 컨디션 상태 : '기절직전' 입니다.");
					}
				도박파차사횟수--;
				System.out.println("          ○ 사용가능 변호 횟수 : ("+도박파차사횟수+"회/7회) 입니다.");
				}else{
					System.out.println("          ○ 망자의 담당 차사는 : 도박파 차사 였습니다.");
					System.out.println("          ○ 추가로 변호한 점수 : (0점) 입니다.");
					System.out.println("          ○ 망자의 담당 차사는 : 계약만료 되었습니다.");
				}	
		}else {
			System.out.println("          ○ 망자의 담당 차사는 : '다시 추가변호를 받으시면 됩니다.'");
			System.out.println("          ○ 추가로 변호한 점수 : (0점) 입니다.");
			System.out.println("          ○ 망자의 담당 차사는 : 계약만료 되었습니다.");
		}
	}
			
		public String 환생결정(int 점수) {
			//점수로 환생 결정
				if(점수>=80) {
					return "축 [인간] 환생";
				}else if(점수<80 || 점수>60) {
					return "축 [짐승] 환생";
				}else
					return "축 [식물] 환생";
			}
		
		
}

