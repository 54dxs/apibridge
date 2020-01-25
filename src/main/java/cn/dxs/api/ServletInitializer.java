package cn.dxs.api;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 打包war放入tomcat运行要加入本类
 * 
 * @author lijian
 * @date 2020-01-16 13:28:00
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DxsApplication.class);
	}

}
