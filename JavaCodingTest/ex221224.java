package JavaCodingTest;

public class ex221224 {

    /* 문자열 뒤집기 문자열 
    my_string이 매개변수로 주어집니다. 
    my_string을 거꾸로 뒤집은 문자열을 return하도록 
    solution 함수를 완성해주세요. */
    class Solution1 {
        public String solution(String my_string) {
            String answer = "";
            int my_length = my_string.length();
            for(int i= my_length-1; i>=0;i--){
                String word = my_string.substring(i,i+1);
                answer+=word;
            }
            return answer;
        }
    }

    /* 아이스 아메리카노 
    머쓱이는 추운 날에도 아이스 아메리카노만 마십니다. 
    아이스 아메리카노는 한잔에 5,500원입니다. 
    머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때, 
    머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 
    순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요. */
    class Solution2 {
        public int[] solution(int money) {
            int[] answer = {money/5500,money%5500};
            return answer;
        }
    }

    /* 점의 위치 구하기 
    사분면은 한 평면을 x축과 y축을 기준으로 나눈 네 부분입니다. 
    사분면은 아래와 같이 1부터 4까지 번호를매깁니다.
    x 좌표와 y 좌표가 모두 양수이면 제1사분면에 속합니다.
    x 좌표가 음수, y 좌표가 양수이면 제2사분면에 속합니다.
    x 좌표와 y 좌표가 모두 음수이면 제3사분면에 속합니다.
    x 좌표가 양수, y 좌표가 음수이면 제4사분면에 속합니다.
    x 좌표 (x, y)를 차례대로 담은 정수 배열 dot이 매개변수로 주어집니다. 
    좌표 dot이 사분면 중 어디에 속하는지 1, 2, 3, 4 중 하나를 
    return 하도록 solution 함수를 완성해주세요.*/

    class Solution3 {
        public int solution(int[] dot) {
            int x = dot[0];
            int y = dot[1];
            int answer = 0;

            if(x > 0){
                if(y>0){
                    answer = 1;
                }else{
                    answer = 4;
                }
            }else{
                if(y>0){
                    answer = 2;
                }else{
                    answer = 3;
                }

            }
            return answer;
        }
    }


    /* 짝수 홀수 개수 
    정수가 담긴 리스트 num_list가 주어질 때, 
    num_list의 원소 중 짝수와 홀수의 개수를 담은 
    배열을 return 하도록 solution 함수를 완성해보세요. */
    class Solution4 {
        public int[] solution(int[] num_list) {
            int odd = 0;
            int even = 0;
            for( int i=0; i<num_list.length;i++){
                if(num_list[i]%2 == 0){
                    even++;
                }else{
                    odd++;
                }
            }
            int[] answer = {even,odd};
            return answer;
        }
    }

    /* 편지 
    머쓱이는 할머니께 생신 축하 편지를 쓰려고 합니다. 
    할머니가 보시기 편하도록 글자 한 자 한 자를 
    가로 2cm 크기로 적으려고 하며, 편지를 가로로만 적을 때, 
    축하 문구 message를 적기 위해 필요한 편지지의 
    최소 가로길이를 return 하도록 solution 함수를 완성해주세요. */
    class Solution5 {
        public int solution(String message) {
            int answer = message.length()*2;
            return answer;
        }
    }    

    /* 배열 자르기 
    정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, 
    numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 
    정수 배열을 return 하도록 solution 함수를 완성해보세요. */

    class Solution6 {
        public int[] solution(int[] numbers, int num1, int num2) {
            int[] answer = new int[num2-num1+1];
            int index =0;
            for(int i =0; i<numbers.length;i++){
                if(i>=num1 && i<=num2){
                    answer[index] = numbers[i];
                    index++;
                }
            }
            return answer;
        }
    }

    /* 특정 문자 제거하기 
    문자열 my_string과 문자 letter이 매개변수로 주어집니다. 
    my_string에서 letter를 제거한 문자열을 return하도록 
    solution 함수를 완성해주세요. */
    class Solution7 {
        public String solution(String my_string, String letter) {
            String answer = "";
            String[] string_arr = new String[my_string.length()];
            for(int i=0; i<my_string.length();i++){
                string_arr[i] = my_string.substring(i,i+1);
            }
            for(int i=0; i<string_arr.length;i++){
                if(string_arr[i].equals(letter)){

                }else{
                    answer+=string_arr[i];
                }
            }
            
            return answer;
        }
    }    

    /* 짝수는 싫어요 
    정수 n이 매개변수로 주어질 때, 
    n 이하의 홀수가 오름차순으로 담긴 
    배열을 return하도록 solution 함수를 완성해주세요.*/
    class Solution8 {
        public int[] solution(int n) {

            int index = 0;
            if(n%2==0){
                int[] answer = new int[n/2];
                for(int i=1; i<=n ; i+=2){
                    answer[index++] = i;
                }
                return answer;
            }else{
                int[] answer = new int[n/2+1];
                for(int i=1; i<=n ; i+=2){
                    answer[index++] = i;
                }
                return answer;
            }
            
        }
    }

    /* 최댓값 만들기 (1) 
    정수 배열 numbers가 매개변수로 주어집니다. 
    numbers의 원소 중 두 개를 곱해 만들 수 있는 
    최댓값을 return하도록 solution 함수를 완성해주세요. */
    class Solution9 {
        public int solution(int[] numbers) {

            int first = 0;
            int second = 0;
            for(int i =0; i<numbers.length; i++){
                if(numbers[i]>first){
                    second = first;
                    first = numbers[i];
                }else if(numbers[i]>second){
                    second = numbers[i];
                }
            }

            int answer = first*second;
            return answer;
        }
    }    

    /* 문자열 반복 출력하기 
    문자열 my_string과 정수 n이 매개변수로 주어질 때, 
    my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 
    return 하도록 solution 함수를 완성해보세요. */
    class Solution10 {
        public String solution(String my_string, int n) {
            String answer = "";
            for(int i=0; i<my_string.length();i++){
                for(int j=0; j<n;j++){
                    answer+=my_string.substring(i,i+1);
                }
            }
            
            return answer;
        }
    }

}


