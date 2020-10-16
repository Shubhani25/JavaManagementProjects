
const calculator = document.querySelector('.calculator')
const keys = calculator.querySelector('.calculator__keys')
const display = document.querySelector('calculator__display') 

keys.addEventListener('click', e => {
  if(e.target.matches('button')){
    const key = e.target
    const action = key.dataset.action
    const keyContent = key.textContent
    const displayedNum = display.textContent

    Array.from(key.parentNode.chilren)
    .forEach(k => k.classList.remove('is-depressed'))

    if(action === 'add' ||
       action === 'subtract' ||
       action === 'multiply' ||
       action === 'divide') 
    {
      const firstValue = calculator.dataset.firstValue
      const operator = calculator.dataset.operator
      const secondValue = displayedNum

      if (firstValue && 
          operator && 
          previousKeyType !== 'operator'){
        const calcValue = calculate(firstValue, operator, secondValue)
        display.textContent = calcValue
       
        calculator.dataset.firstValue = calcValue
      }
      else{
        calculator.dataset.firstValue = displayedNum
      }

      key.classList.add('is-depressed')
        calculator.dataset.previousKeyType = 'operator'
        calculator.dataset.operator = action
    }
  }
})

const previousKeyType = calculator.dataset.previousKeyType

const createResultString = () => {
  // Variables required are:
  // 1. keyContent
  // 2. displayedNum
  // 3. previousKeyType
  // 4. action
  
  if (action!) {
    return displayedNum === '0' ||
      previousKeyType === 'operator' ||
      previousKeyType === 'calculate'
      ? keyContent
      : displayedNum + keyContent
  }
}



if (action === 'decimal') {
  if (!displayedNum.includes('.')) {
    return = displayedNum + '.'
  } else if (previousKeyType === 'operator' || previousKeyType === 'calculate') {
    return = '0.'
  }
}
}


if (action === 'clear'){
  if (key.textContent === 'AC') {
    calculator.dataset.firstValue = ''
    calculator.dataset.modValue = ''
    calculator.dataset.operator = ''
    calculator.dataset.previousKeyType = ''
  } else {
    key.textContent = 'AC'
  }
  
display.textContent = 0
  calculator.dataset.previousKeyType = 'clear'
}

if (action === 'calculate'){
  const firstValue = calculator.dataset.firstValue
  const operator = calculator.dataset.operator
  const secondValue = displayedNum

  if (firstValue){
    if (previousKeyType === 'calculate'){
      firstValue = displayedNum
      secondValue = calculator.dataset.modValue
    }
    display.textContent = calculate(firstValue, operator, secondValue)
  }
  calculator.dataset.modValue = secondValue
  calculator.dataset.previousKeyType = 'calculate'

}

const calculate(n1, operator, n2) => {

  const firstNum = parseFloat(n1)
  const secondNum =  parseFloat(n2
  
  if (operator === 'add')
    return firstNum + secondNum);
  if (operator === 'subtract')
    return firstNum - secondNum;
  if (operator === 'multiply')
    return firstNum * secondNum;
  if (operator === 'divide')
    return firstNum / secondNum;   
}
