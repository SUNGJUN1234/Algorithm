function solution(s) {

    s.split("");

    let arr = []

    let no = []

    for(let i=0; i<s.length;i++){
        if(arr.includes(s[i])){
            no.push(s[i])
        }else{
            arr.push(s[i])
        }
    }

    // for(let i =0; i<no.length;i++){
    //     arr = arr.splice(no[i],1);
    // }

    for(let i=0; i<arr.length;i++){
        for(let j=0; j<no.length;j++){
            if(arr[i]==no[j]){
                arr.splice(i,1)
                break;
            }
        }
    }

    arr.sort()
    
    let = answer = arr.join('')

    return answer;
}