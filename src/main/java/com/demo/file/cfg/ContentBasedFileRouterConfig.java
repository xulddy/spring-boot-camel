package com.demo.file.cfg;

import java.util.Arrays;
import java.util.List;

import com.demo.file.ContentBasedFileRouter;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spring.javaconfig.CamelConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContentBasedFileRouterConfig extends CamelConfiguration {

	@Bean
	ContentBasedFileRouter getContentBasedFileRouter() {
		return new ContentBasedFileRouter();
	}

	@Override
	public List<RouteBuilder> routes() {
		return Arrays.asList(getContentBasedFileRouter());
	}

}
