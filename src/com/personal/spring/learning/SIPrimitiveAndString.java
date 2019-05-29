package com.personal.spring.learning;

public class SIPrimitiveAndString {
	
	private int k;
	private String message;
	
	public void setData(int k)
	{
		this.k=k;
	}
    public void setMessage(String message)
    {
    	this.message=message;
    }
    public void getShow()
    {
    	System.out.println(k + "===="+message);
    }
}
