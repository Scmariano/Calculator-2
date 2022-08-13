package com.codingdojo.calculator;

public class Calculator {
	private double operandOne;
	private double operandTwo;
	private String operation;
	private double total;
	
	public Calculator() {}
	public Calculator(double operandOne, double operandTwo, String operation) {
		this.operandOne = operandOne;
		this.operandTwo = operandTwo;
		this.operation = operation;
	}
	public double getOperandOne() {
		return operandOne;
	}
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	public double getOperandTwo() {
		return operandTwo;
	}
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	public void performOperation() {
		if(this.operation.equals("+")) {
			total = operandOne + operandTwo;
		}
		if(this.operation.equals("-")) {
			total = operandOne - operandTwo;
		}
		else if(this.operation.equals("*")) {
			total = operandOne * operandTwo;
		}
		else if(operation.equals("/")) {
			total = operandOne / operandTwo;
		}
		else {
			System.out.println("Wrong input, try again!");
		}
	}
	
	public void getResults() {
		System.out.println("Total:" + total);
	}
}
