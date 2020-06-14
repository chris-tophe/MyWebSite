package com.christophe.rhapsode.controller;

import java.util.List;

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
	public String articleDetail(Model model) {
		return "article";
	}

	/*
	 * @PostMapping("/") public String handleFileUpload(@RequestParam("file")
	 * MultipartFile file, RedirectAttributes redirectAttributes) {
	 * 
	 * storageService.store(file); redirectAttributes.addFlashAttribute("message",
	 * "You successfully uploaded " + file.getOriginalFilename() + "!");
	 * 
	 * return "redirect:/"; }
	 */

}
