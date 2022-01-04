/*
    2022-01-04 Level.1
    2021 Dev-Matching: 웹 백엔드 개발자(상반기)
    https://programmers.co.kr/learn/courses/30/lessons/77484?language=java
    로또의 최고 순위와 최저 순위
*/
package y_2022.m_01.level1;

import java.util.Arrays;

public class D_04_77484 {

	public static int[] solution(int[] lottos, int[] win_nums) {
		int none;
		
		Arrays.sort( lottos );
		for ( none = 0; none < lottos.length; none++ ) 
			if ( lottos[none] != 0 ) break;
		
		int[] answer = {0,0};
		
		Arrays.sort(win_nums);
        for(int j = 0; j < win_nums.length; j++) {
            for(int k = none; k < lottos.length; k++) {
                if(win_nums[j] != lottos[k])    continue;
                answer[0]++;
                answer[1]++;
            }
        }

        answer[0] += none;

        for(int i = 0; i < 2; i++) 
        	if ( answer[i] < 1 ) answer[i] = 6;
        	else answer[i] = 7 - answer[i];
		
		return answer;
	}

	public static void main(String[] args) {
		int[] lottos = {0, 0, 0, 0, 0, 0};
		int[] win_nums = {38, 19, 20, 40, 15, 25};
		System.out.println( solution(lottos, win_nums)[0] );
		System.out.println( solution(lottos, win_nums)[1] );
	}
}
