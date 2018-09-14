package com.fimc.hello.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person implements Serializable {
	private String firstName;
	private String lastName;
	private String birthDate;
}
