package com.medina.limitservice.bean;

public class LimitConfigurationService
{
public int getMinimum() {
		return minimum;
	}
	public int getMaximum() {
	return maximum;
}
public void setMaximum(int maximum) {
	this.maximum = maximum;
}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
private int maximum;
private int minimum;
public LimitConfigurationService(int maximum, int minimum) {
	super();
	this.maximum = maximum;
	this.minimum = minimum;
}
protected LimitConfigurationService() 
{
	
}

}
