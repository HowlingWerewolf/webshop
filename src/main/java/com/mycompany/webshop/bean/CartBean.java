package com.mycompany.webshop.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class CartBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	List<String> cartItemList = new ArrayList<>();
	int counter = 0;

	public List<String> getCartItemList() {
		return cartItemList;
	}

	public void setCartItemList(List<String> cartItemList) {
		this.cartItemList = cartItemList;
	}

	public void addItem() {
		cartItemList.add("item" + cartItemList.size());
	}
	
	public void removeLastItem() {
		if (cartItemList.size() > 0)
			cartItemList.remove(cartItemList.size()-1);
	}
	
	public void removeItem(String item) {
		cartItemList.remove(item);
	}
}

