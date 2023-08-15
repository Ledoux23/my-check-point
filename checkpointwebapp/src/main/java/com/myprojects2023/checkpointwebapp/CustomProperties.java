package com.myprojects2023.checkpointwebapp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties(prefix = "com.myprojects2023.checkpointwebapp")
@Data
public class CustomProperties {

	private String apiUrl;
	//private String checkpointapiUrl;

	public String getApiUrl() {
		return apiUrl;
	}

	public void setApiUrl(String apiUrl) {
		this.apiUrl = apiUrl;
	}

}
