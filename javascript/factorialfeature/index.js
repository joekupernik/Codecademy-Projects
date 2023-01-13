const Calculate = {
  factorial (inputNumber){
   for (let i = inputNumber - 1; i >= 1; i--) {
  inputNumber *= i; 
} if ( inputNumber === 0){
  return 1;
}

 
return inputNumber
  }
}

module.exports = Calculate;


