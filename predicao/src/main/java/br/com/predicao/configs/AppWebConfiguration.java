package br.com.predicao.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.predicao.controllers.HomeController;
import br.com.predicao.daos.PessoaDao;

@EnableWebMvc
@ComponentScan(basePackageClasses={HomeController.class, PessoaDao.class})
//@ComponentScan(basePackageClasses={ HomeController.class})


public class AppWebConfiguration {

	/**
	 * Toda classe que será gerenciada pelo Spring precisa da anotação Bean.
	 * @return
	 */
	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver(){
		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
			
		internalResourceViewResolver.setPrefix("/WEB-INF/views/");
		internalResourceViewResolver.setSuffix(".jsp");
		
		return internalResourceViewResolver;
		
	}
	

}
