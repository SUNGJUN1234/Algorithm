package JavaCodingTest;

import java.util.ArrayList;

public class ex221231 {

    /* 팩토리얼 
    i팩토리얼 (i!)은 1부터 i까지 정수의 곱을 의미합니다. 
    예를들어 5! = 5 * 4 * 3 * 2 * 1 = 120 입니다. 
    정수 n이 주어질 때 다음 조건을 만족하는 가장 큰 정수 
    i를 return 하도록 solution 함수를 완성해주세요. */

    class Solution1 {
        public int solution(int n) {
            int ans = 1;
            int mul_num = 1;
            while(n>=ans){
                ans*=++mul_num;
            }
            return --mul_num;
        }
    }

    /* A로 B만들기 --오답
    문자열 before와 after가 매개변수로 주어질 때, 
    before의 순서를 바꾸어 after를 만들 수 있으면 1을, 
    만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요. */

    class Solution2 {
        public int solution(String before, String after) {
            int answer = 0;
            
            String already = "";
            int index = 0;
            for(int i=0; i<before.length();i++){
                if(before.charAt(index)==after.charAt(i)
                && !already.contains(String.valueOf(i))
                && index<before.length()){
                    already+=i;
                    index++;
                    i=-1;
                }
                if(index>=before.length()){
                    break;
                }
            }
            if(already.length()==before.length()){
                answer=1;
            }
            return answer;
        }
    }
        
    





}