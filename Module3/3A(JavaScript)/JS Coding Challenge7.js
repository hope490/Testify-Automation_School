const numberArrays =[200,11,3000,67,44,78,45,1100]
numberArrays.sort(compareFunction);
  
console.log(numberArrays)
function compareFunction(a,b){
    return b-a;
}