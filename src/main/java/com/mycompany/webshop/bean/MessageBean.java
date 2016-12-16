package com.mycompany.webshop.bean;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class MessageBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	String message = "Hello somebody!";
	String name;

	public String getMessage() throws IOException {
		if (name != null)
			message = "Hello " + name + "!";
		return message;
    }	

	public void setMessage(String message) throws IOException {
		this.message = message;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

