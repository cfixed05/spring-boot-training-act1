package com.fimc.hello.resource;

import java.io.Serializable;

import com.fimc.hello.model.CalculatorRequest;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CalculatorResponse implements Serializable {

	public double calculate(CalculatorRequest data) {
		double answer = 0;
		if (data.getOperator().equals("+")) {
			answer = data.getNum1() + data.getNum2();
		} else if (data.getOperator().equals("-")) {
			answer = data.getNum1() - data.getNum2();
		} else if (data.getOperator().equals("*")) {
			answer = data.getNum1() * data.getNum2();
		} else if (data.getOperator().equals("/")) {
			answer = data.getNum1() / data.getNum2();
		}
		return answer;
	}

	public String getOperator(String operator) {
		String result = "";
		switch (operator) {
		case "+":
			result = "addition";
			break;
		case "-":
			result = "subraction";
			break;
		case "*":
			result = "multiplication";
			break;
		case "/":
			result = "division";
			break;
		default:
			result = "invalid";
			break;
		}
		return result;
	}

}
