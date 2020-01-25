package cn.dxs.api.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * Cors跨域访问配置
 * 
 * @author lijian
 * @date 2019-07-28 22:16:34
 */
@Configuration
public class CorsConfig extends WebMvcConfigurationSupport {

	@Override
	protected void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
		.allowedOrigins("*")
		.allowedMethods("GET", "HEAD", "POST", "PUT", "DELETE","OPTIONS")
		.allowCredentials(false).maxAge(3600);
	}

}
