package com.example.demo.entity;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * People实体
 */
// 指定配置文件文件地址，读取文件编码，如果不指定springboot以ISO-8859-1读取，中文还需转码才能正常显示
@Component
@PropertySource(value = "classpath:common.properties", ignoreResourceNotFound = true, encoding = "UTF-8")
public class People implements Serializable {

	private static final long serialVersionUID = 2120869894112984147L;

	@Value("${people.name}")
	private String name;

	@Value("${people.flag}")
	private boolean flag;
	
	@Value("${people.age}")
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	
		
}