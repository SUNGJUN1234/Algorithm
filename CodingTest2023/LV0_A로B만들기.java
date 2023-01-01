package CodingTest2023;

import java.util.Arrays;

/* 문자열 before와 after가 매개변수로 주어질 때, 
before의 순서를 바꾸어 after를 만들 수 있으면 1을, 
만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요. */
public class LV0_A로B만들기 {
    class Solution {
        public int solution(String before, String after) {
            int answer = 0;

            int [] arr_bf = new int[before.length()];
            int [] arr_af = new int[after.length()];

            for(int i=0; i<before.length();i++){
                arr_bf[i] = Integer.valueOf(before.charAt(i));
                arr_af[i] = Integer.valueOf(after.charAt(i));
            }                

            Arrays.sort(arr_bf);
            Arrays.sort(arr_af);

            int count = 0;

            for(int i=0; i<arr_bf.length;i++){
                if(arr_af[i]==arr_bf[i]){
                    count++;
                }
            }
            if(count==arr_bf.length){
                answer++;
            }

            return answer;
        }
    }
}
