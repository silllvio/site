package br.com.predicao.configs;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletSpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer 
{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	/**
	 * Precisamos apontar onde está nossa classe, o local da controller.
	 * Precisamos de uma classe de configuração que diz qual o controller vamos usar.
	 * 	
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {AppWebConfiguration.class,JPAConfiguration.class};
	}

	/**
	 * Vamos mapear a servlet do Spring para mapear a raiz.
	 * 
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}
	
	

}
