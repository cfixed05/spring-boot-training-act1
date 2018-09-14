package com.fimc.hello.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServerResponse implements Serializable {
	private String action;
	private String result;
}
