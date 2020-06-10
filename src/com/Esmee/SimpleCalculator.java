package com.Esmee;

/**
 * @author Esmee Zhang
 * @date 6/9/20 6:18 下午
 * @projectName JAVA-master-class
 */
public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber(){
        return this.firstNumber;
    }
    public double getSecondNumber(){
        return this.secondNumber;
    }
    public void setFirstNumber(double firstnumber){
        this.firstNumber = firstnumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }
    public double getAdditionresult(){
        return firstNumber + secondNumber;
    }
    public double getSubtractionResult(){
        return secondNumber - firstNumber;
    }
    public double getMultiplicationResult(){
        return firstNumber * secondNumber;
    }
    public double getDivisionResult(){
        if(secondNumber == 0){
            return 0;
        }else{
        return firstNumber / secondNumber;
        }
    }


}
