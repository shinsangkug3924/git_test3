package git_test3;

import java.util.Arrays;
import java.util.Random;

//Main.java에서 배열의 데이터를 랜덤하세 생성하는 기능을 먼저 구현해 달라는 요청을 받았다.
//quick sort 알고리즘 구현을 잠시 중단하고, 랜덤 데이터 생성기능 부터 구현 해야 합니다.

//quick_sort 브랜치는 실행은 커녕 컴파일 에러가 발생하기 떄문에,
//quick_sort 브랜치에서 랜덤 생성기능을 구현하기 어렵다.

//컴파일 가능하고 실행가능한 안정적인 버전이 있는 main브랜치를 기준으로 새 작업 브랜치를 만들어서 랜덤 데이터 생성기능을 구현하자.

public class Main {
	
	//랜덤 데이터 생성기능을 구현함
	static int[] createArray(int size, int minValue, int maxValue) {
		
		Random random = new Random();
		int[] a = new int[size];
		for(int i=0; i<a.length; ++i) {
			a[i] = random.nextInt(maxValue-minValue+1)+1;
		}
		return a;
	}
	
	
	public static void main(String[] args) {
		int[] a = { 4, 8, 2, 6, 10, 3, 1, 7, 9, 5 };
		Sort.sort(a);
		System.out.println(Arrays.toString(a));
	}

}
