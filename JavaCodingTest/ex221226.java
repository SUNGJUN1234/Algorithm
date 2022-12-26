package JavaCodingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ex221226 {
    /* 세균증식 
    어떤 세균은 1시간에 두배만큼 증식한다고 합니다. 
    처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때 
    t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요. */

    class Solution1 {
        public int solution(int n, int t) {
            for(int i=0; i<t;i++){
                n*=2;
            }
            return n;
        }
    }

    /* n의 배수 고르기 
    정수 n과 정수 배열 numlist가 매개변수로 주어질 때, 
    numlist에서 n의 배수가 아닌 수들을 제거한 배열을 
    return하도록 solution 함수를 완성해주세요. */
    
    class Solution2 {
        public int[] solution(int n, int[] numlist) {
            
            ArrayList<Integer> arr = new ArrayList<Integer>(0);
            for(int i=0; i<numlist.length;i++){
                if(numlist[i]%n==0){
                    arr.add(numlist[i]);
                }
            }
            int[] answer = new int[arr.size()];
            for(int i=0; i<arr.size();i++){
                answer[i] = arr.get(i);
            }
            return answer;
        }
    }

    /* 직각삼각형 출력하기 
    "*"의 높이와 너비를 1이라고 했을 때, 
    "*"을 이용해 직각 이등변 삼각형을 그리려고합니다. 
    정수 n 이 주어지면 높이와 너비가 n 인 직각 이등변 
    삼각형을 출력하도록 코드를 작성해보세요. */

    public class Solution3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
                
            for(int i=0;i<n;i++){
                for(int j=0;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        
                
        }
    }

    /** 대문자와 소문자 
    문자열 my_string이 매개변수로 주어질 때, 
    대문자는 소문자로 소문자는 대문자로 변환한 문자열을 
    return하도록 solution 함수를 완성해주세요. */
    
    class Solution4 {
        public String solution(String my_string) {
            String answer = "";

            String[] arr = my_string.split("");
            for(int i=0; i<arr.length;i++){
                if(arr[i].charAt(0) >= 97){
                    answer += String.valueOf((char)(arr[i].charAt(0)-32));
                }else{
                    answer += String.valueOf((char)(arr[i].charAt(0)+32));
                }
            }

            return answer;
        }
    }

    /* 가위 바위 보 
    가위는 2 바위는 0 보는 5로 표현합니다. 
    가위 바위 보를 내는 순서대로 나타낸 문자열 
    rsp가 매개변수로 주어질 때, rsp에 저장된 
    가위 바위 보를 모두 이기는 경우를 순서대로 
    나타낸 문자열을 return하도록 solution 함수를 완성해보세요. */
    
    class Solution5 {
        public String solution(String rsp) {
            String answer = "";
            String[] arr = rsp.split("");
            for(int i=0;i<rsp.length();i++){
                if(arr[i].equals("2")){
                    answer+="0";
                }else if(arr[i].equals("0")){
                    answer+="5";
                }else if(arr[i].equals("5")){
                    answer+="2";
                }
            }
            return answer;
        }
    }

    /* 암호 해독 
    군 전략가 머쓱이는 전쟁 중 적군이 다음과 같은 암호 
    체계를 사용한다는 것을 알아냈습니다.
    암호화된 문자열 cipher를 주고받습니다.
    그 문자열에서 code의 배수 번째 글자만 진짜 암호입니다.
    문자열 cipher와 정수 code가 매개변수로 주어질 때 해독된 
    암호 문자열을 return하도록 solution 함수를 완성해주세요. */

    class Solution6 {
        public String solution(String cipher, int code) {
            String answer = "";
            
            String[] arr = cipher.split("");
            
            for(int i=1; i<arr.length+1;i++){
                if(i%code==0){
                    answer+=arr[i-1];
                }
            }

            return answer;
        }
    }

    /* 문자열 정렬하기 (1) 
    문자열 my_string이 매개변수로 주어질 때, 
    my_string 안에 있는 숫자만 골라 오름차순 
    정렬한 리스트를 return 하도록 solution 함수를 작성해보세요. */

    class Solution7 {
        public int[] solution(String my_string) {
            String str_ans ="";
            String[] arr = my_string.split("");
            for(int i=0; i<arr.length;i++){
                if(arr[i].equals("0") ||arr[i].equals("1") ||
                arr[i].equals("2") ||arr[i].equals("3") ||
                arr[i].equals("4") ||arr[i].equals("5") ||
                arr[i].equals("6") ||arr[i].equals("7") ||
                arr[i].equals("8") ||arr[i].equals("9") ){
                    str_ans+=arr[i];
                }
            }
            int[] answer = new int[str_ans.length()];

            for(int i=0; i<str_ans.length();i++){
                answer[i] = Integer.valueOf(str_ans.substring(i, i+1));
            }
            Arrays.sort(answer);


            return answer;
        }
    }

    /* 주사위의 개수 
    머쓱이는 직육면체 모양의 상자를 하나 가지고 있는데 
    이 상자에 정육면체 모양의 주사위를 최대한 많이 채우고 싶습니다. 
    상자의 가로, 세로, 높이가 저장되어있는 배열 box와 주사위 모서리의 
    길이 정수 n이 매개변수로 주어졌을 때, 상자에 들어갈 수 있는 주사위의 
    최대 개수를 return 하도록 solution 함수를 완성해주세요. */

    class Solution8 {
        public int solution(int[] box, int n) {
            
            int x=box[0]/n;
            int y=box[1]/n;
            int z=box[2]/n;
            
            int answer =x*y*z;

            return answer;
        }
    }

    /** 가장 큰 수 찾기 
    정수 배열 array가 매개변수로 주어질 때, 
    가장 큰 수와 그 수의 인덱스를 담은 배열을 
    return 하도록 solution 함수를 완성해보세요. */
    
    /* int[] arr = array 라고 한 후에 Arrays.sort(arr)을 하자 
    array도 정렬이 됐다 */

    class Solution9 {
        public int[] solution(int[] array) {
            int[] arr = new int[array.length];
            for(int i=0; i<array.length;i++){
                arr[i] = array[i];
            }
            Arrays.sort(arr);
            int[] a= new int[2];
            for(int i = 0;i<arr.length;i++){
                if(array[i]==arr[arr.length-1]){
                    a[0] = array[i];
                    a[1] = i;
                }
            }
            return a;
        }
    }
       
    /* 약수 구하기 
    정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 
    담은 배열을 return하도록 solution 함수를 완성해주세요.*/

    class Solution10 {
        public int[] solution(int n) {
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i=1; i<=n;i++){
                if(n%i==0){
                    arr.add(i);
                }
            }
            int[] answer = new int[arr.size()];
            for(int i=0; i<arr.size();i++){
                answer[i]=arr.get(i);
            }
            return answer;
        }
    }



}