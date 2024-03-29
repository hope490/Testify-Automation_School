/*const side1 =4
const side2 =4
const side3 =4
if(side1===side2 && side1===side3){
    console.log('Equilateral Triangle')
} 
else if(side1===side2 || side1===side3 || side2===side3){
    console.log('isosceles triangle')
}
else {
    console.log('scalene triangle')
}*/

const side1 = 7;
const side2 = 7;
const side3 = 8;

if (side1 === side2 && side1 === side3) {
    console.log('Equilateral Triangle');
} 
else if (side1 === side2 || side1 === side3 || side2 === side3) {
    console.log('Isosceles Triangle');
}
else {
    console.log('Scalene Triangle');
}