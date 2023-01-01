package com.chiral;

import java.util.Arrays;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.chiral.interceptor.JwtInterceptor;

@SpringBootApplication
@MapperScan(value = {"com.chiral"})
public class ApiLhApplication implements WebMvcConfigurer {
	
	final static Logger logger = LoggerFactory.getLogger(ApiLhApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ApiLhApplication.class, args);
	}
	
	@Autowired
	private JwtInterceptor jwtInterceptor;
	
	//@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(jwtInterceptor).addPathPatterns("/**")
		.excludePathPatterns(Arrays.asList("/security/**"));
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
