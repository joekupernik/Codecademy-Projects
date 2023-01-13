/*Our program will display a selection of animals on the screen. We’ll be allowed to decide if we want to include a background or not. Clicking an animal will cause a fact to be randomly selected from a list of potential options. The selected fact will pop up on the screen. As we keep clicking, we’ll be able to see different facts.
*/

import { animals } from './animals';
import React from 'react';
import ReactDOM from 'react-dom';

const title = "";

const background = (<img 
className='background' 
alt='ocean' 
src='/images/ocean.jpg'
/>)

const images = [];

for (const animals in animals){
 images.push(
   <img
     key: {animal}
     className: 'animal'
     alt: {animal}
     src: {animals[animal].image}
     ariaLabel: {animal}
     role: 'button'
   />
 )
}

function displayFact(e)  {
 const selectedAnimal = e.target.alt;
  const animalInfo = animals[selectedanimals];
  const optionIndex = Math.floor(Math.random() * selectedAnimal.facts.length);

  const funFacts = animalInfo.facts[optionIndex];

Math.floor(Math.random() * selectedAnimal.facts.length);
document.getElementById('fact').innerHTML= funFact;
}

const animalFacts =(
   <div>
    <h1>
    {title === "" ? "Click an animal for a fun fact" : title}
    </h1>{background}
    <div className='animals'>{images}
    </div>
</div>)

ReactDOM.render(animalFacts, document.getElementById("root"));
