package com.sist.lang;
/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class MainClass1 {

	public static void main(String[] args) {
		/*
		String data="오늘 국민 여러분들께서도 짐작하시겠습니다마는 최근"
				+ " 여러 곳에서 발생하고 있는 변이바이러스의 유입과 "
				+ "확산 그리고 미접종자들, 특히 젊은층을 중심으로 이런 분들의 "
				+ "활동량이 증가하면서 따르는 여러 가지 "
				+ "상황이라고 생각됩니다마는 국민 여러분들께 다시 한 번 어려움을 "
				+ "끼쳐드릴 수밖에 없는 상황에 대해서 사과드립니다.";
		// matches => 정규식 => 이메일, IP, 전화번호 ....
		// 기본형식 - data.matches(" .*  입력값 .*  ")
		if(data.matches(".*접종자.*")){
			System.out.println("포함되어 있습니다");
		}
		else {
			System.out.println("미포함되어 있습니다");
		}
		// 영어문자 포함 data.matches(".*[a-zA-Z].*")
		// 숫자 포함 data.matches(".*[0-9].*")
		// 한글 포함 data.matches(".*[가-힣].*")
		 */
		
		String data="ABCDEFGHIJKLMN";
		for(int i=0; i<data.length();i++) {
			System.out.print(data.charAt(i));
		}
		System.out.println();
		for(int i=data.length()-1; i>0;i--) {
			System.out.print(data.charAt(i));
		}
		System.out.println();
		// reverse를 사용해도 똑같이 뒤집은 결과를 얻을 수 있다
		StringBuffer sb=new StringBuffer(data); // 그림도 가능
		System.out.println(sb.toString());
		String s=sb.reverse().toString();
		System.out.println(s);
	}

}
