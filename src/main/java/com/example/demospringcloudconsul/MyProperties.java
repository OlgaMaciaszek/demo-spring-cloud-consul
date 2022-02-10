package com.example.demospringcloudconsul;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * @author Olga Maciaszek-Sharma
 */
@RefreshScope
@ConfigurationProperties("my")
public class MyProperties {

	private String test = "x";

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}
}
