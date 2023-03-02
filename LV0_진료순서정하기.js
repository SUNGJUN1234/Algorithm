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