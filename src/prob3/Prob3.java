package prob3;

public class Prob3 {

	public static void main(String[] args) {
		String str = "모든 프로그램은 자바 언어로 개발 될 수 있습니다.";

		/* 코드를 작성합니다 */
		//indexof
		if( str.indexOf("자바") != -1){
			System.out.println("자바 문자열이 포함되어 있습니다.");
			System.out.println( "->"+str.replaceAll("자바", "Java"));
		}else {
			return;			
		}
		

	}
}
