package JavaCodingTest;

import java.util.ArrayList;

public class ex221228 {

    /* 저주의 숫자 3 
    3x 마을 사람들은 3을 저주의 숫자라고 생각하기 때문에 
    3의 배수와 숫자 3을 사용하지 않습니다. 3x 마을 사람들의 
    숫자는 다음과 같습니다. */

    class Solution1 {
        public int solution(int n) {
            int answer = 0;
            
            for(int i=1; i<=n;i++){
                answer++;
                if(i%3==0){
                    n++;
                }else if(String.valueOf(i).contains("3")){
                    n++;
                }
            }
            
            return answer;
        }
    }

    /* 겹치는 선분의 길이 선분 3개가 평행하게 놓여 있습니다. 
    세 선분의 시작과 끝 좌표가 [[start, end], [start, end], [start, end]] 
    형태로 들어있는 2차원 배열 lines가 매개변수로 주어질 때, 
    두 개 이상의 선분이 겹치는 부분의 길이를 
    return 하도록 solution 함수를 완성해보세요.
    lines가 [[0, 2], [-3, -1], [-2, 1]]일 때 그림으로 
    나타내면 다음과 같습니다.선분이 두 개 이상 겹친 곳은 
    [-2, -1], [0, 1]로 길이 2만큼 겹쳐있습니다. */

    class Solution2 {
        public int solution(int[][] lines) {

            ArrayList<Double> all = new ArrayList<>();

            int total_length = 0;

            ArrayList<Double> overlap = new ArrayList<>();

            for(Double i=lines[0][0]+0.5;i<lines[0][1];i++){
                all.add(i);
                total_length++;
            }
            for(Double i=lines[1][0]+0.5;i<lines[1][1];i++){
                if(all.contains(i)){
                    overlap.add(i);
                }else{
                    all.add(i);
                }
                total_length++;
            }
            for(Double i=lines[2][0]+0.5;i<lines[2][1];i++){
                if(all.contains(i)&& !overlap.contains(i)){
                }else{
                    all.add(i);
                }
                total_length++;
            }
            int answer = total_length-all.size();

            return answer;
        }
    }




}
