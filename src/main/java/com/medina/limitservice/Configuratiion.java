package com.medina.limitservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
// this way is used to read the data from apllication.properties.
@Component
@ConfigurationProperties("limit-service") // this is used to read from apllication.properties.
public class Configuratiion  
{
 private int maximum;
 private int minimum;
public int getMaximum() {
	return maximum;
}
public void setMaximum(int maximum) {
	this.maximum = maximum;
}
public int getMinimum() {
	return minimum;
}
public void setMinimum(int minimum) {
	this.minimum = minimum;
}

 
}
