function solution(array, n) {

    var answer = Math.abs(n-array[0]);
    var index = 0;

    for(let i =0; i<=array.length;i++){
        let old_answer = answer;
        let old_index = index

        if(answer>=Math.abs(n-array[i])){

            answer = Math.abs(n-array[i]);
            index = i;
        }
        if(old_answer==answer && array[old_index]<array[index]){
            index = old_index;
        }
        
    }
    return array[index];  
}