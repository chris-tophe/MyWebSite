package com.christophe.rhapsode.controller;

import java.security.cert.PKIXRevocationChecker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.christophe.rhapsode.dao.ArticlesDao;
import com.christophe.rhapsode.dao.LanguageDao;
import com.christophe.rhapsode.model.Article;
import com.christophe.rhapsode.model.Language;

@Controller
public class MainPageController {

	// private final StorageService storageService;

	/*
	 * @Autowired public MainPageController(StorageService storageService) {
	 * this.storageService = storageService; }
	 */

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
	
	@RequestMapping("/{article}")
	public String articleDetail(Model model , @PathVariable String article) {
		Article findedArticle = articlesRepo.findByTitle(article);
		if ( findedArticle != null) {
			model.addAttribute("article", findedArticle);
			return "article";
		}
		return "error";
	}

}
