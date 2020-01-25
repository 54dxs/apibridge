package cn.dxs.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//扫描mybatis mapper 包路径
//@MapperScan(basePackages = "cn.dxs.api.mapper")
//扫描 所有需要的包，包含一些自用的工具类包 所在的路径
@ComponentScan(basePackages = { "cn.dxs.api", "org.n3r.idworker" })
public class DxsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DxsApplication.class, args);
	}

}
