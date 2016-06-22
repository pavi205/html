package com.niit.skart.controller;

	import java.util.ArrayList;
	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.servlet.ModelAndView;

import com.niit.skart.bean.Category;
import com.niit.skart.dao.Categorydao;

@Controller
	public class Categorycontroller{

@Autowired
		private Categorydao categorydao;
		
 @RequestMapping("/getAllCategories")
		public ModelAndView getAllCategories() {

			System.out.println("getAllCategories");
			
			List<Category> categoryList =  categorydao.getAllCategories();
			
			ModelAndView mv = new ModelAndView("/categoryList");
			mv.addObject("categoryList", categoryList);

			return mv;
		}
		
		
		
		
	}

	

