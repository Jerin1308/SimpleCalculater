package com.calc;

public class SimpleCalc {
    
    public double simpCal(double firstNum, char operator, double secondNum) {
        double result = Double.NaN;
        
        switch (operator) {
            case '+':
                result = firstNum + secondNum;
                break;
            case '-':
                result = firstNum - secondNum;
                break;
            case '*':
                result = firstNum * secondNum;
                break;
            case '/':
                if (secondNum == 0) {
                    System.out.println("Error: Division by zero!");
                    return Double.NaN; // Return NaN for division by zero
                }
                result = firstNum / secondNum;
                break;
            case '%':
                result = firstNum % secondNum;
                break;
            default:
                System.out.println("Invalid operator!");
                return Double.NaN;
        }
        
        return result;
    }

}