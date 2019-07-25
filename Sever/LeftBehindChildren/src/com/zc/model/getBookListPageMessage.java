package com.zc.model;

import java.util.List;

public class getBookListPageMessage extends Message{
	private int total;
	private List<Book> rows;
	public getBookListPageMessage() {
		super();
	}
	public getBookListPageMessage(String msg, int code, int total, List<Book> rows) {
		super(msg, code);
		this.total=total;
		this.rows=rows;
	}
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<Book> getRows() {
		return rows;
	}
	public void setRows(List<Book> rows) {
		this.rows = rows;
	}
	@Override
	public String toString() {
		return "getBookListPageMessage [total=" + total + ", rows=" + rows + "]";
	}
}
