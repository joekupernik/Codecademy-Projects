/*In this project, you will use test-driven development to build a factorial method. You will use the assert module and mocha testing library to drive your development using tests that follow the phases: setup, exercise, and verification.
*/


var assert = require("assert");
var Calculate =  require('../index.js')

describe('Calculate', () => {
  describe('.factorial', () => {
    it ('the calculation is correct', ()=>{
       //setup
       const inputNumber = 5;
       const expected = 120;
       //execute
       const outcome = Calculate.factorial(inputNumber);

        //verify
       assert.equal(outcome, expected);
    });
    it ('the calculation is correct with a diffrent number', ()=>{
       //setup
       const inputNumber = 3;
       const expected = 6;
       //execute
       const outcome = Calculate.factorial(inputNumber);

        //verify
       assert.equal(outcome, expected);
    });
     it ('returns 1 when you pass in a zero', ()=>{
       //setup
       const inputNumber = 0;
       const expected = 1;
       //execute
       const outcome = Calculate.factorial(inputNumber);

        //verify
       assert.equal(outcome, expected);
    });
  });
});
