package com.epamhometask.calculatorapplication.Modal;

public class Operation extends OperationMethods {
    private double opnd1;
    private double opnd2;
    private String operator;

    public MathOperations(double opnd1,double opnd2,String operator)
    {
        this.opnd1 = opnd1;
        this.opnd2 = opnd2;
        this.operator = operator;
    }
    public double getOperand1() {
        return opnd1;
    }

    public void setOperand1(double opnd1) {
        this.opnd1 = opnd1;
    }

    public double getOperand2() {
        return opnd2;
    }

    public void setOperand2(double opnd2) {
        this.opnd2 = opnd2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
    public double Result()
    {
        double result = 0;
        switch (this.operator)
        {
            case "+" :
                result = add(this.opnd1 , this.opnd2);
                break;
            case "-" :
                result = subtract(this.opnd1 , this.opnd2);
                break;
            case "/" :
                result = divide(this.opnd1 , this.opnd2);
                break;
            case "*" :
                result = multiply(this.opnd1 , this.opnd2);
                break;
                default:
                result = 0;
        }
        return result;
    }
}
