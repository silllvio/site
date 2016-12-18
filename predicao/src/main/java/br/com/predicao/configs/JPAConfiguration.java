package br.com.predicao.configs;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
public class JPAConfiguration {

	 @Bean
	 public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
	        LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
	        JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();

	        factoryBean.setJpaVendorAdapter(vendorAdapter);

	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setUsername("");
	        dataSource.setPassword("");
	        dataSource.setUrl("jdbc:mysql://mysqlpredicao.cvbgo024filb.sa-east-1.rds.amazonaws.com:3306/predicao");
	        dataSource.setDriverClassName("com.mysql.jdbc.Driver");

	        factoryBean.setDataSource(dataSource);

	        Properties props = new Properties();
	        props.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
	        props.setProperty("hibernate.show_sql", "true");
	        props.setProperty("hibernate.hbm2ddl.auto", "update");

	        factoryBean.setJpaProperties(props);

	        factoryBean.setPackagesToScan("br.com.predicao.models");

	        return factoryBean;
	    }
		
	    @Bean
	    public JpaTransactionManager transactionManager(EntityManagerFactory emf){
	        return new JpaTransactionManager(emf);
	    }
		
}
