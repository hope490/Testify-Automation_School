
function totalVowels(MyString){
    const StringOfVowels= 'a,e,i,o,u'

    let numberOfVowel=0
     for(let letter of MyString){

    if(StringOfVowels.includes(letter) ) {
        numberOfVowel++
     } 
    
    }

    return numberOfVowel;

}
//totalVowels('Automation');
console.log(totalVowels ('Automation'))