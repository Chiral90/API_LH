package com.chiral;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@SpringBootApplication
@MapperScan(value = {"com.chiral"})
public class ApiLhApplication {
	
	final static Logger logger = LoggerFactory.getLogger(ApiLhApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ApiLhApplication.class, args);
	}

	@Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{
         
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
         
        sessionFactory.setConfigLocation(new ClassPathResource("mybatis-config.xml"));//spring boot mybatis settings 부분
         
        /*Resource[] res = new PathMatchingResourcePatternResolver().getResources("classpath*:mappers/*Mapper.xml");
        sessionFactory.setMapperLocations(res);*/
         
        return sessionFactory.getObject();
    }
}
