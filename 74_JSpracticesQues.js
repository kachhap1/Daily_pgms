//s1. Square and sum the array elements using the arrow function and then find the average of the array.
let arr1 = [1,2,3,4];
let sq =arr1.map((el)=>{
   return el*el;
});
console.log("Squares :",sq);

let sum = arr1.reduce((res,el)=>{
    return res+el;
});
console.log("Sum:",sum);

let avg = sum/arr1.length;
console.log("Average :",avg);

//2. Create a new array using the map function whose each element is equal to the original element plus 5.
let nos=[1,7,5,-6,4,-3,0];
console.log("Original nos.:",nos)
let add5 = nos.map((n)=>{
    return n+5;
});
console.log("Adding 5 each:",add5);

// Create a new array whose elements are in uppercase of words present in the original array
let words =["cabbage","spinach","carrot"];
console.log(words.map((el)=>{ return el.toUpperCase()}));

//Write a function called doubleAndReturnArgs which accepts an array and a variable number of arguments. The function should return a new array with the original array values and all of the additional arguments doubled.


// Write a function called mergeObjects that accepts two objects and returns a new object which contains all the keys and values of the first object and second object.
const mergeObjects = (obj1,obj2)=>({...obj1,...obj2});
mergeObjects({a:1,b:2},{c:3,d:4}); //
