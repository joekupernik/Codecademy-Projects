/* Deep in his mountain-side meteorology lab, the mad scientist Kelvin has mastered weather prediction.

Recently, Kelvin began publishing his weather forecasts on his website. However there’s a problem: All of his forecasts describe the temperature in Kelvin.

With our knowledge of JavaScript, let’s convert Kelvin to Celsius, then to Fahrenheit.
*/

// constant temperature of kelvin
const kelvin = 0;
// conversion of kelvin to celsius
let celsius = kelvin - 273;
// conversion to fahrenhite
let fahrenheit = celsius * (9/5) + 32;
// converts to integer 
Math.floor(fahrenheit);
console.log(`The temperature is ${fahrenheit} degrees fahrenheit.`);
