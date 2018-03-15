package com.evada.springweb.config;

import org.springframework.cglib.core.internal.CustomizerRegistry;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

/**
 * @author dingqin
 * @date 2017/11/3
 */
public class AnnotationConfigDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    /**
     * 支持处理multipart请求和文件上传
     * location:上传的临时路径，需要手动在项目运行的root下创建一个如：uploads,这边不设置
     * 参考：
     * https://www.cnblogs.com/mswangblog/p/6565819.html
     * 2097152单个文件的大小限制：2MB
     * 4194304整个请求的大小限制：4MB
     * @param registration
     */
    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        super.customizeRegistration(registration);
        MultipartConfigElement multipartConfigElement = new MultipartConfigElement(null,
                2097152,4194304,0);
        registration.setMultipartConfig(multipartConfigElement);
    }
}
