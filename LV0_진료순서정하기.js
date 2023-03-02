function solution(emergency) {
    
    var answer = [];
    var before_emergency = [];
    
    for(let i=0;i<emergency.length;i++){
        before_emergency.push(emergency[i])
    }
    
    emergency.sort(function(a,b){
      return b-a  
    })
    
    for(let i =0;i<emergency.length;i++){
        for(let j=0;j<emergency.length;j++){
            if(before_emergency[i]==emergency[j]){
                answer.push(j+1);
            }
        }
    }

    return answer;

}

// 응급도배열을 2개로 보관한 뒤 하나는 역순으로 정렬하여
// 정렬전의 배열과 정렬된 배열의 같은 수가 어느 인덱스에있는지 확인하여
// 해당 인덱스에 +1 하여 값을 넣어줬다.