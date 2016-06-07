package com.spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by Allen on 2016/4/16.
 */
public class SpittrWebAppInitializer
        extends AbstractAnnotationConfigDispatcherServletInitializer {

    //根容器
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] {RootConfig.class};
    }

    //Spring Mvc容器
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] {WebConfig.class};
    }

    //映射，从“/”开始
    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
