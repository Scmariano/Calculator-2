package com.codingdojo.calculator;

public class TestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		Calculator calculator2 = new Calculator();
		
		calculator.setOperandOne(10.5);
		calculator.setOperation("+");
		calculator.setOperandTwo(5.2);
		calculator.setOperation("*");
		calculator.setOperandOne(10);
		calculator.performOperation();
		calculator.getResults();
		
//		calculator2.setOperandOne(50);
//		calculator2.setOperation("+");
//		calculator2.setOperandTwo(100);
//		calculator2.performOperation();
//		calculator2.getResults();
		
	}

}
