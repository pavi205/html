package com.niit.skartbackend.dao;

import java.util.List;
import com.niit.skartbackend.model.Category;

public interface Categorydao {

	public List<Category> list();
	
	public void delete(String id);

}
