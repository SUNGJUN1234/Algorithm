
function solution(a, b, c) {
    
    var answer = 0;
    for(let i=a;i<=b;i++){
        let arr = (i+"").split("");
        for(let j=0;j<arr.length;j++){
            if(c==arr[j]){
                answer++;
            }
        }
    }

    return answer;
}

// a~b까지의 모든 수를 for문으로 실행하며
// a~b까지 1씩 올라가며 해당 수들을 문자열로 만든 후 한글자한글자 잘라서
// 배열로 만든후 해당 배열을 for문으로 실행하여 한글자한글자를 c와 비교했다