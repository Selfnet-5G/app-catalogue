package eu.selfnet5g.onboarding.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import eu.selfnet5g.onboarding.model.AppClass;
import eu.selfnet5g.onboarding.model.AppPackageStatus;

public class AppInfo {
	private String id; 
	
	private String name;
	
	private String type;
	
	private AppClass appClass;
	
	private String version;
	
	private AppPackageStatus status;

	public AppInfo(String id, String name, String type, AppClass appClass, String version, AppPackageStatus status) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.status = status;
		this.version = version;
		this.appClass = appClass;
	}

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}
	
	@JsonProperty("version")
	public String getVersion() {
		return version;
	}

	@JsonProperty("status")
	public AppPackageStatus getStatus() {
		return status;
	}
	
	@JsonProperty("class")
	public AppClass getAppClass() {
		return appClass;
	}
}
