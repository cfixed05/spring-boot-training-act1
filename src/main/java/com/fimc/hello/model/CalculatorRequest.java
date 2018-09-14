package com.fimc.hello.model;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CalculatorRequest implements Serializable {

	private String operator;
	private double num1;
	private double num2;
}
