package com.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan({"com.app.bean","com.app.aspect"})
@EnableAspectJAutoProxy
public class ProjectConfig {

	
}
