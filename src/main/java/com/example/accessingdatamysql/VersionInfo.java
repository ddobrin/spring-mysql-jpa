package com.example.accessingdatamysql;

public class VersionInfo {

	private String createdDate = "Mon Apr 05 14:16:51 EDT 2021";

	private String projectName = "SpringMysqlJpa";


	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Override
	public String toString() {
		return "VersionInfo{" +
				"createdDate='" + createdDate + '\'' +
				", projectName='" + projectName + '\'' +
				'}';
	}
}
