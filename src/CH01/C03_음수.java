package CH01;

public class C03_음수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 컴퓨터(CPU)는 감산(+) 처리가능 
		// 컴퓨터(CPU)는 감산(-) 처리불가
		// 뺄셈 요청 -> 결과 확인 ?
		// 보수 도입 -> 뺄셈과 동일한 결과를 만들어 낸다 
		
		// 2의 보수 : 1의보수(반전) + 1 예) 0000101 -> 1111010(1의보수)+1 -> 1111011
		// [0]000 0000 : 압자리가 0이면 +, 1이면 -
		/*
		 *	계산법 0111 1111 = 127
		 *	1000 0000 = -128 [1의 보수]
		 *1000 0001 = -128+1 = -127
		 *1000 0010 = -128+2 = -126
		 *1000 0011 = -128+3 = -125
		 * ... 1111 1111 = -128+127 = -1
		 * 0000 0001 = 1 
		*/
	}

}
