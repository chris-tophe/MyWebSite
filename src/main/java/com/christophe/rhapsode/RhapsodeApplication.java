package com.christophe.rhapsode;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.christophe.rhapsode.controller.StorageConfig;
import com.christophe.rhapsode.controller.StorageService;
import com.christophe.rhapsode.dao.ArticlesDao;
import com.christophe.rhapsode.dao.LanguageDao;
import com.christophe.rhapsode.dao.PhotosDao;
import com.christophe.rhapsode.model.Article;
import com.christophe.rhapsode.model.Language;
import com.christophe.rhapsode.model.Photo;

@SpringBootApplication
@EnableConfigurationProperties(StorageConfig.class)
public class RhapsodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(RhapsodeApplication.class, args);
	}

	/*
	 * @Bean CommandLineRunner init(StorageService storageService) { return (args)
	 * -> { storageService.deleteAll(); storageService.init(); }; }
	 */
	@Bean
	CommandLineRunner createLangage(LanguageDao languageDao) {
		return arg -> {
			Language language = new Language("Java");
			language.setImage("logo/javaLogo.png");
			languageDao.save(language);
			
			language = new Language("Java Fx");
			language.setImage("logo/javaFXLogo.png");
			languageDao.save(language);
			
			language = new Language("Spring Boot");
			language.setImage("logo/springLogo.png");
			languageDao.save(language);
			
		};
		
	}
	

	@Bean
	CommandLineRunner createArticles(ArticlesDao articleRepo , LanguageDao languageDao, PhotosDao photosDao) {
		return args -> {
			Article article = new Article();
			article.setTitle("Visit My City");
			article.setUrl("https://github.com/chris-tophe/CecChrRap");
			article.setDescription(
					"Projet tuteuré de 5 jours en équipe. Développement de micro services et d'une interface JavaFx.");
			
			Language language = languageDao.findByName("Java");
			article.addLanguage(language);
			
			language = languageDao.findByName("Java Fx");
			article.addLanguage(language);
			
			language = languageDao.findByName("Spring Boot");
			article.addLanguage(language);
			
			Photo p = new Photo();
			p.setUrl("");;
			p.setLegend("");
			photosDao.save(p);
			article.addPhoto(p);
			
			articleRepo.save(article);
		};
	}
	

}
