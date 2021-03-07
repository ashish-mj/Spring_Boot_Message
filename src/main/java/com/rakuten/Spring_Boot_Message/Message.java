package com.rakuten.Spring_Boot_Message;

public class Message {
	private int id;
	private String msg;
	private String from;
	private String date;
	
	public Message(int id, String msg, String from, String date) {
		super();
		this.id = id;
		this.msg = msg;
		this.from = from;
		this.date = date;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	

}
