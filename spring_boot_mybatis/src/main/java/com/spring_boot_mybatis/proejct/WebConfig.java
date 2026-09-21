package com.spring_boot_mybatis.proejct;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/prd_images/**")
				.addResourceLocations("/Users/kimminseong/Documents/Developments/hy9/springBootWorkspace/upload/product_image/");

		registry.addResourceHandler("/images/**")
				.addResourceLocations("/Users/kimminseong/Documents/Developments/hy9/springBootWorkspace/upload/");
	}
}
