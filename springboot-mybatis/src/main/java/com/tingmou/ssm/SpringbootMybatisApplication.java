package com.tingmou.ssm;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.thymeleaf.spring4.SpringTemplateEngine;

import nz.net.ultraq.thymeleaf.LayoutDialect;


@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan
@MapperScan("com.tingmou.ssm.dao")
public class SpringbootMybatisApplication {

	private static Logger logger = Logger.getLogger(SpringbootMybatisApplication.class);
	 
	@Bean
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource dataSource() {
        return new org.apache.tomcat.jdbc.pool.DataSource();
    }
    
    //提供SqlSeesion
    @Bean
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {

    	SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/mapping/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }
    
    @Bean
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }
    

//	/**
//	 * @param templateEngine
//	 */
//	@Autowired
//	protected void configureThymeleafSpringTemplateEngine(SpringTemplateEngine templateEngine) {
//		//templateEngine.setEnableSpringELCompiler(true);
//		templateEngine.addDialect(new LayoutDialect());
////		templateEngine.addDialect(new SpringSecurityDialect());
////		templateEngine.addDialect(new SpringStandardDialect());
//	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisApplication.class, args);
        logger.info("============= SpringBoot Start Success =============");
	}
}
