package JavaCodingTest;

import java.util.ArrayList;

public class ex221230 {

    /* 피보나치 수
    피보나치 수는 F(0) = 0, F(1) = 1일 때, 1 이상의 n에 대하여 
    F(n) = F(n-1) + F(n-2) 가 적용되는 수 입니다.예를들어

    F(2) = F(0) + F(1) = 0 + 1 = 1
    F(3) = F(1) + F(2) = 1 + 1 = 2
    F(4) = F(2) + F(3) = 1 + 2 = 3
    F(5) = F(3) + F(4) = 2 + 3 = 5
    와 같이 이어집니다.
    
    2 이상의 n이 입력되었을 때, n번째 피보나치 수를 1234567으로 
    나눈 나머지를 리턴하는 함수, solution을 완성해 주세요. */

    class Solution1 {
        public int solution(int n) {
            int answer = 0;
            ArrayList<Integer> fibo = new ArrayList<>(); 
            fibo.add(0);
            fibo.add(1);
            for(int i=0;i<n;i++){
                fibo.add((fibo.get(i)+fibo.get(i+1))%1234567);
            }

            answer = fibo.get(n);

            return answer;
        }
    }

    /* 문자열 나누기 
    문자열 s가 입력되었을 때 다음 규칙을 따라서 
    이 문자열을 여러 문자열로 분해하려고 합니다.
    먼저 첫 글자를 읽습니다. 이 글자를 x라고 합시다.
    이제 이 문자열을 왼쪽에서 오른쪽으로 읽어나가면서, 
    x와 x가 아닌 다른 글자들이 나온 횟수를 각각 셉니다. 
    처음으로 두 횟수가 같아지는 순간 멈추고, 지금까지 읽은 문자열을 분리합니다.
    s에서 분리한 문자열을 빼고 남은 부분에 대해서 이 과정을 반복합니다. 
    남은 부분이 없다면 종료합니다.만약 두 횟수가 다른 상태에서 
    더 이상 읽을 글자가 없다면, 역시 지금까지 읽은 문자열을 분리하고, 종료합니다.
    문자열 s가 매개변수로 주어질 때, 위 과정과 같이 문자열들로 분해하고, 
    분해한 문자열의 개수를 return 하는 함수 solution을 완성하세요.*/

    class Solution {
        public int solution(String s) {
                 
                 //String[]arr_s = s.split("");
     
                 int answer=0;
                 for(int i=0; i<s.length();i++){
                     int o=0;
                     int x=0;
                     for(int j=i; j<s.length();j++){
                         if(s.charAt(i)==s.charAt(j)){
                             o++;
                         }else{
                             x++;
                         }
                         if(o==x){
                             answer++;
                             i=j;
                             break;
                         }
                         if(s.length()-i<=1 ){
                             answer++;
                         }
                         
                     }
                 }
                 return answer;
             }
         
     }
}
