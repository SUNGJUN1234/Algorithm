package CodingTest2023;

/* 머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다. 
그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다. 
문자열 letter가 매개변수로 주어질 때, letter를 영어 소문자로 
바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
모스부호는 다음과 같습니다.
morse = { 
    '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
    '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
    '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
    '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
    '-.--':'y','--..':'z'
} */

public class LV0_모스부호_1 {
    class Solution {
        public String solution(String letter) {
            
            String[] letter_cut = letter.split(" ");
            String answer="";

            String[] alp ={"a","b","c","d","e","f","g","h","i","j","k","l",
            "m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
            String[] mos ={".-","-...","-.-.","-..",".","..-.","--.","....",
            "..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-","-.--","--.."};
            
            for(int ii =0;ii<letter_cut.length;ii++){
                for(int jj=0; jj < mos.length;jj++){
                    if(letter_cut[ii].equals(mos[jj])){
                        answer+=alp[jj];
                        break;
                    }
                }
            }


            return answer;
        }
    }
}
