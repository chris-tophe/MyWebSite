package com.christophe.rhapsode;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.christophe.rhapsode.dao.ArticlesDao;
import com.christophe.rhapsode.dao.LanguageDao;
import com.christophe.rhapsode.dao.PhotosDao;
import com.christophe.rhapsode.model.Article;
import com.christophe.rhapsode.model.Language;
import com.christophe.rhapsode.model.Photo;

@SpringBootApplication
public class RhapsodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(RhapsodeApplication.class, args);
	}

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
			
			language = new Language("React Native");
			language.setImage("logo/reactLogo.png");
			languageDao.save(language);
			
			language = new Language("Flutter");
			language.setImage("logo/flutterLogo.png");
			languageDao.save(language);
			
			language = new Language("PHP");
			language.setImage("logo/phpLogo.png");
			languageDao.save(language);
			
			language = new Language("JavaScript");
			language.setImage("logo/jsLogo.png");
			languageDao.save(language);
			
			language = new Language("Api Rest");
			language.setImage("logo/restLogo.png");
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
					"Projet tuteuré de 5 jours en équipe.Planificateur de visite. Développement de micro-services et d'une interface JavaFx.");
			
			Language language = languageDao.findByName("Java");
			article.addLanguages(language);
			
			language = languageDao.findByName("Java Fx");
			article.addLanguages(language);
			
			language = languageDao.findByName("Spring Boot");
			article.addLanguages(language);
			
			language = languageDao.findByName("Api Rest");
			article.addLanguages(language);
			
			Photo p = new Photo();
			p.setUrl("");;
			p.setLegend("");
			photosDao.save(p);
			article.addPhotos(p);
			
			articleRepo.save(article);
			
			article = new Article();
			article.setTitle("FrigoStock");
			article.setUrl("https://github.com/chris-tophe/frigoStock");
			article.setDescription(
					"Mini Projet React-Native interrogeant des scripts PHP. Gestion du contenu d'un frigo.");
			
			language = languageDao.findByName("React Native");
			article.addLanguages(language);
			
			language = languageDao.findByName("PHP");
			article.addLanguages(language);
			
			
			p = new Photo();
			p.setUrl("");;
			p.setLegend("");
			photosDao.save(p);
			article.addPhotos(p);
			
			articleRepo.save(article);
			
			article = new Article();
			article.setTitle("tatatam");
			article.setUrl("");
			article.setDescription(
					"Application de gestion de garanties consommant une API Rest PHP");
			
			language = languageDao.findByName("Flutter");
			article.addLanguages(language);
			
			language = languageDao.findByName("PHP");
			article.addLanguages(language);
			
			language = languageDao.findByName("Api Rest");
			article.addLanguages(language);
			
			
			p = new Photo();
			p.setUrl("images/tatatam0.png");;
			p.setLegend("Acceuil");
			photosDao.save(p);
			article.addPhotos(p);
			
			p = new Photo();
			p.setUrl("images/tatatam1.png");;
			p.setLegend("Drawer menu");
			photosDao.save(p);
			article.addPhotos(p);
			
			p = new Photo();
			p.setUrl("images/tatatam2.png");;
			p.setLegend("Main menu");
			photosDao.save(p);
			article.addPhotos(p);
			
			p = new Photo();
			p.setUrl("images/tatatam3.png");;
			p.setLegend("Garantie");
			photosDao.save(p);
			article.addPhotos(p);
			
			p = new Photo();
			p.setUrl("images/tatatam4.png");;
			p.setLegend("Menu inventaire");
			photosDao.save(p);
			article.addPhotos(p);
			
			articleRepo.save(article);
			
			
		};
	}
	

}
