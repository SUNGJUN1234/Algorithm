package JavaCodingTest;

import java.util.ArrayList;
import java.util.Arrays;

public class ex221227 {
    
    /* 배열 회전시키기 
    정수가 담긴 배열 numbers와 문자열 direction가 
    매개변수로 주어집니다. 배열 numbers의 원소를 direction방향으로 
    한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요. */

    class Solution1 {
        public int[] solution(int[] numbers, String direction) {
            if(direction.equals("right")){
                int last =numbers[numbers.length-1];
                for(int i=numbers.length-1;i>0;i--){
                    numbers[i] = numbers[i-1];
                }
                numbers[0] = last;
            }else{
                int first = numbers[0];
                for(int i=0; i<numbers.length-1;i++){
                    numbers[i] = numbers[i+1];
                }
                numbers[numbers.length-1] = first; 
            }
            return numbers;
        }
    }

    /* 외계행성의 나이 
    우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 
    행성에 불시착하게 됐습니다. 입국심사에서 나이를 말해야 하는데, 
    PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다. 
    a는 0, b는 1, c는 2, ..., j는 9입니다. 예를 들어 23살은 cd, 
    51살은 fb로 표현합니다. 나이 age가 매개변수로 주어질 때 
    PROGRAMMER-962식 나이를 return하도록 solution 함수를 완성해주세요. */

    class Solution2 {
        public String solution(int age) {
            String answer = "";
            String str_age = String.valueOf(age);
            String[] arr_age = str_age.split("");
            for(int i=0; i<arr_age.length;i++){
                if(arr_age[i].equals("0")){
                    answer+="a";
                }else if(arr_age[i].equals("1")){
                    answer+="b";
                }else if(arr_age[i].equals("2")){
                    answer+="c";
                }else if(arr_age[i].equals("3")){
                    answer+="d";
                }else if(arr_age[i].equals("4")){
                    answer+="e";
                }else if(arr_age[i].equals("5")){
                    answer+="f";
                }else if(arr_age[i].equals("6")){
                    answer+="g";
                }else if(arr_age[i].equals("7")){
                    answer+="h";
                }else if(arr_age[i].equals("8")){
                    answer+="i";
                }else if(arr_age[i].equals("9")){
                    answer+="j";
                }
            }
            return answer;
        }
    }

    /* 피자 나눠 먹기 (2) 
    머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다. 
    피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때, 
    n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 
    조각을 먹어야 한다면 최소 몇 판을 시켜야 하는지를 
    return 하도록 solution 함수를 완성해보세요. */

    class Solution3 {
        public int solution(int n) {
            int answer = 1;
            while((answer*6)%n!=0){
                answer++;
            }
            return answer;
        }
    }

    /* 최댓값 만들기 (2) 
    정수 배열 numbers가 매개변수로 주어집니다. 
    numbers의 원소 중 두 개를 곱해 만들 수 있는 
    최댓값을 return하도록 solution 함수를 완성해주세요. */

    class Solution4 {
        public int solution(int[] numbers) {
            int answer = numbers[0]*numbers[1];
            for(int i=0;i<numbers.length;i++){
                for(int j=0;j<numbers.length;j++){
                    if(numbers[i]*numbers[j]>answer&& i!=j){
                        answer = numbers[i]*numbers[j];
                    }
                }
            }
            return answer;
        }
    }

    /* 인덱스 바꾸기 
    문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때, 
    my_string에서 인덱스 num1과 인덱스 num2에 해당하는 
    문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요. */

    class Solution5 {
        public String solution(String my_string, int num1, int num2) {
            String answer = "";
            String[] arr_str = my_string.split("");

            String temp = arr_str[num1];
            arr_str[num1] = arr_str[num2];
            arr_str[num2] = temp;

            for(int i=0; i<arr_str.length;i++){
                answer+=arr_str[i];
            }

            return answer;
        }
    }

    /* 숫자 찾기 
    정수 num과 k가 매개변수로 주어질 때, num을 이루는 숫자 중에 
    k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 없으면 
    -1을 return 하도록 solution 함수를 완성해보세요. */

    class Solution6 {
        public int solution(int num, int k) {
            int answer = -1;

            String[] arr_num = String.valueOf(num).split("");

            for(int i=0; i<arr_num.length;i++){
                if(arr_num[i].equals(String.valueOf(k))){
                    answer=i+1;
                    break;
                }
            }

            return answer;
        }
    }

    /* 369게임 
    머쓱이는 친구들과 369게임을 하고 있습니다. 
    369게임은 1부터 숫자를 하나씩 대며 3, 6, 9가 들어가는 
    숫자는 숫자 대신 3, 6, 9의 개수만큼 박수를 치는 게임입니다. 
    머쓱이가 말해야하는 숫자 order가 매개변수로 주어질 때, 
    머쓱이가 쳐야할 박수 횟수를 return 하도록 solution 함수를 완성해보세요. */

    class Solution7 {
        public int solution(int order) {
            int answer = 0;

            String[] arr_order = String.valueOf(order).split("");

            for(int i=0; i<arr_order.length;i++){
                if(arr_order[i].equals("3") ||arr_order[i].equals("6") 
                ||arr_order[i].equals("9")){
                    answer++;
                }
            }
            return answer;
        }
    }

    /* 문자열 정렬하기 (2) 
    영어 대소문자로 이루어진 문자열 my_string이 
    매개변수로 주어질 때, my_string을 모두 소문자로 
    바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 
    solution 함수를 완성해보세요. */

    class Solution8 {
        public String solution(String my_string) {
            String answer = "";

            String[] arr_str = my_string.split("");
            int[] arr_int = new int[arr_str.length];
            for(int i=0; i<arr_str.length;i++){
                if(arr_str[i].charAt(0)<91){
                    arr_int[i] = arr_str[i].charAt(0)+32;
                }else{
                    arr_int[i] = arr_str[i].charAt(0);
                }
            }
            Arrays.sort(arr_int);
            for(int i=0; i<arr_int.length;i++){
                answer+=(char)(arr_int[i]);
            }
            return answer;
        }
    }

    /* 합성수 찾기 
    약수의 개수가 세 개 이상인 수를 합성수라고 합니다. 
    자연수 n이 매개변수로 주어질 때 n이하의 합성수의 
    개수를 return하도록 solution 함수를 완성해주세요. */

    class Solution9 {
        public int solution(int n) {
            int answer = 0;
            for(int i=1; i<=n;i++){
                int num=0;
                for(int j=1; j<=i;j++){
                    if(i%j==0){
                        num++;
                    }
                }
                if(num>=3){
                    answer++;
                }
            }
            return answer;
        }
    }

    /* 중복된 문자 제거 
    문자열 my_string이 매개변수로 주어집니다. 
    my_string에서 중복된 문자를 제거하고 하나의 
    문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요. */

    class Solution10 {
        public String solution(String my_string) {
            String answer = "";

            answer+=my_string.substring(0,1);

            for(int i=1;i<my_string.length();i++){
                boolean tf = false;
                for(int j=0;j<i;j++){
                    if(my_string.substring(i, i+1).equals(my_string.substring(j,j+1))){
                        tf =true;
                    }
                }
                if( tf == false){
                    answer+=my_string.substring(i, i+1);
                }
            }
            return answer;
        }
    }




}
