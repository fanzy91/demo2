package net.xdclass.demo2.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource({"classpath:application.properties"})
@ConfigurationProperties(prefix="test")
public class ServerSetting {
	
	private String port;
	private String domain;
	
	public ServerSetting() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ServerSetting(String port, String domain) {
		super();
		this.port = port;
		this.domain = domain;
	}

	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	
}
