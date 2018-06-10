package com.xzh.todo.entity;

import java.util.concurrent.atomic.AtomicInteger;

import lombok.Data;

@Data
public class Todo {

	private static final AtomicInteger acc = new AtomicInteger(0); // counter

	private int id;
	private String title;
	private Boolean completed;
	private Integer order;
	private String url;

}
