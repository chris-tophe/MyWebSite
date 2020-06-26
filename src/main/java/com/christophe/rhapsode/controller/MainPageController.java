package com.christophe.rhapsode.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.christophe.rhapsode.dao.ArticlesDao;
import com.christophe.rhapsode.dao.LanguageDao;
import com.christophe.rhapsode.model.Article;
import com.christophe.rhapsode.model.Language;

@Controller
public class MainPageController {


	@Autowired
	ArticlesDao articlesRepo;
	
	@Autowired
	LanguageDao languagesDao;

	@RequestMapping("/")
	public String index(Model model) {
		List<Article> articles = articlesRepo.findAll();
		List<Language> languages = languagesDao.findAll();
		model.addAttribute("articles", articles);
		model.addAttribute("languages",languages);
		return "index";
	}
	

}
