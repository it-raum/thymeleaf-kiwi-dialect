package ch.itraum.thymeleaf.config;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.TemplateMode;
import org.thymeleaf.dialect.IDialect;
import org.thymeleaf.spring3.SpringTemplateEngine;
import org.thymeleaf.spring3.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

import ch.itraum.thymeleaf.KiwiDialect;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebMvc
public class WebMvcConfig extends WebMvcConfigurerAdapter {
	
	@Override
	public void addFormatters(FormatterRegistry registry) {
		
		DateFormatter dateFormatter = new DateFormatter("dd.MM.yyyy");
		
		registry.addFormatter(dateFormatter);
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

	@Bean
	public SpringTemplateEngine templateEngine() {
		SpringTemplateEngine springTemplateEngine = new SpringTemplateEngine();
		springTemplateEngine.setTemplateResolver(templateResolver());
		Set<IDialect> dialectSet = new HashSet<IDialect>();
		dialectSet.add(new KiwiDialect());
		springTemplateEngine.setAdditionalDialects(dialectSet);
		return springTemplateEngine;
	}

	@Bean
	public ThymeleafViewResolver viewResolver() {
		ThymeleafViewResolver thymeleafViewResolver = new ThymeleafViewResolver();
		thymeleafViewResolver.setTemplateEngine(templateEngine());
		return thymeleafViewResolver;
	}

	@Bean
	public ServletContextTemplateResolver templateResolver() {
		ServletContextTemplateResolver servletContextTemplateResolver = new ServletContextTemplateResolver();
		servletContextTemplateResolver.setPrefix("/WEB-INF/templates/");
		servletContextTemplateResolver.setCacheable(false);
		servletContextTemplateResolver.setSuffix(".html");
		servletContextTemplateResolver.setTemplateMode(TemplateMode.HTML5);
		return servletContextTemplateResolver;
	}

}
