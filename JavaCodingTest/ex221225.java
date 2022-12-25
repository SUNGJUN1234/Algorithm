package JavaCodingTest;

public class ex221225 {

    /** 중앙값 구하기 
    중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 
    가장 중앙에 위치하는 값을 의미합니다. 
    예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다. 
    정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 
    하도록 solution 함수를 완성해보세요. */
    import java.util.*;
    import java.io.*;

    class Solution1 {
    public int solution(int[] array) {
                
                Arrays.sort(array);;
                int answer = array[array.length/2];
                return answer;
            }
    }

    /** 문자열안에 문자열 
    문자열 str1, str2가 매개변수로 주어집니다. 
    str1 안에 str2가 있다면 1을 없다면 2를 
    return하도록 solution 함수를 완성해주세요.*/
    class Solution2 {
        public int solution(String str1, String str2) {
            int answer = 2;
            if(str1.contains(str2)){
                answer=1;
            }
            return answer;
        }
    }

    /* 배열의 유사도 
    두 배열이 얼마나 유사한지 확인해보려고 합니다. 
    문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 
    return하도록 solution 함수를 완성해주세요.*/
    class Solution3 {
        public int solution(String[] s1, String[] s2) {
            int answer = 0;
            for(int i=0; i<s1.length; i++){
                for(int j=0;j<s2.length; j++){
                    if(s1[i].equals(s2[j])){
                        answer++;
                    }
                }
            }
            return answer;
        }
    }

    /* 순서쌍의 개수 
    순서쌍이란 두 개의 숫자를 순서를 정하여 짝지어 나타낸 쌍으로 
    (a, b)로 표기합니다. 자연수 n이 매개변수로 주어질 때 
    두 숫자의 곱이 n인 자연수 순서쌍의 개수를 return하도록 
    solution 함수를 완성해주세요. */
    class Solution4 {
        public int solution(int n) {
            int answer = 0;
            for(int i=1; i<=n;i++){
                if(n%i ==0){
                        answer++;
                    
                }
            }
            return answer;
        }
    }

    /* 제곱수 판별하기 
    어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다. 
    정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을 
    아니라면 2를 return하도록 solution 함수를 완성해주세요.*/
    class Solution5 {
        public int solution(int n) {
            int answer = 2;
            for(int i=1; i<=n;i++){
                if(n%i ==0){
                        if(i*i==n){
                            answer=1;
                        }
                    
                }
            }
            return answer;
        }
    }

    /**  자릿수 더하기 
    정수 n이 매개변수로 주어질 때 n의 각 자리 
    숫자의 합을 return하도록 solution 함수를 완성해주세요*/
    class Solution6 {
        public int solution(int n) {
            int answer = 0;
            String num = String.valueOf(n);
            for(int i=0; i<num.length(); i++){
                answer+= Integer.valueOf(num.substring(i,i+1));
            }
            return answer;
        }
    }

    /* 옷가게 할인 받기 
    머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 
    50만 원 이상 사면 20%를 할인해줍니다.구매한 옷의 가격 price가 주어질 때, 
    지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.*/
    class Solution7 {
        public int solution(int price) {
            
            int answer = price;
            if(price>=50*10000){
                answer = price*80/100;
            }else if(price>=30*10000){
                answer = price*90/100;
            }else if(price>=10*10000){
                answer = price*95/100;
            }
            return answer;
        }
    }

    /* 숨어있는 숫자의 덧셈 (1) 
    문자열 my_string이 매개변수로 주어집니다. 
    my_string안의 모든 자연수들의 합을 
    return하도록 solution 함수를 완성해주세요. */
    class Solution8 {
        public int solution(String my_string) {
            int answer = 0;
            String[] arr = new String[my_string.length()];
            for(int i=0; i<my_string.length();i++){
                arr[i] = my_string.substring(i,i+1);
            }
            for(int i=0; i<arr.length;i++){
                if(arr[i].equals("0") || arr[i].equals("1") ||arr[i].equals("2") 
                ||arr[i].equals("3") ||arr[i].equals("4") ||arr[i].equals("5") 
                ||arr[i].equals("6") ||arr[i].equals("7") ||arr[i].equals("8") 
                ||arr[i].equals("9")){
                    answer+=Integer.valueOf(arr[i]);
                }
            }
            return answer;
        }
    }

    /* 개미 군단 
    개미 군단이 사냥을 나가려고 합니다. 
    개미군단은 사냥감의 체력에 딱 맞는 병력을 데리고 나가려고 합니다. 
    장군개미는 5의 공격력을, 병정개미는 3의 공격력을 일개미는 1의 공격력을 
    가지고 있습니다. 예를 들어 체력 23의 여치를 사냥하려고 할 때, 
    일개미 23마리를 데리고 가도 되지만, 장군개미 네 마리와 병정개미 
    한 마리를 데리고 간다면 더 적은 병력으로 사냥할 수 있습니다. 
    사냥감의 체력 hp가 매개변수로 주어질 때, 사냥감의 체력에 딱 맞게 
    최소한의 병력을 구성하려면 몇 마리의 개미가 필요한지를 
    return하도록 solution 함수를 완성해주세요. */
    class Solution9 {
        public int solution(int hp) {
            int answer = 0;
            answer += hp/5;
            answer += hp%5/3;
            answer += hp%5%3;
            return answer;
        }
    }   

    /* 모음 제거 
    영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다. 
    문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 
    return하도록 solution 함수를 완성해주세요. */
    class Solution {
        public String solution(String my_string) {
            String answer = "";
            String[] arr = my_string.split("");
            for(int i=0; i<arr.length;i++){
                if(arr[i].equals("a")||arr[i].equals("e")||
                arr[i].equals("i")||arr[i].equals("o")||
                arr[i].equals("u")){
                    answer+= "";
                }else{
                     answer+=arr[i];
                }
               
            }

            return answer;
        }
    }





}