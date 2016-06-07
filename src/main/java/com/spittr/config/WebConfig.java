package com.spittr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by Allen on 2016/4/16.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.spittr.web")
public class WebConfig
        extends WebMvcConfigurerAdapter {
    @Bean
    //配置JSP视图解析器
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver =
                new InternalResourceViewResolver();
        resolver.setPrefix("WEB-INF/views/");
        resolver.setSuffix(".jsp");
        //使得可以在JSP页面中通过${ }访问容器中的bean
        resolver.setExposeContextBeansAsAttributes(true);
        return resolver;
    }
    @Override
    public void configureDefaultServletHandling(
            DefaultServletHandlerConfigurer configurer) {
        //DispatcherServlet将会把针对静态资源的请求转交给servlert容器的default servlet处理。
        configurer.enable();
    }
}
