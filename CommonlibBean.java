package com.hp.exstream.qa.bean;

public class CommonlibBean {

	//Common


	//JOBDEF
	private String jobdeftemplate;
	private String jobdefname;
	private String jobdefpriority;
	private String Jobdefenginename;
	private String Jobdefbundlingtype;
	private String Jobdeliverytype;

	
	public String getjobdeftemplate() {
		return jobdeftemplate;
	}
	public void setjobdeftemplate(String jobdeftemplate) {
		this.jobdeftemplate = jobdeftemplate;
	}
	
	public String getjobdefname() {
		return jobdefname;
	}
	public void setjobdefname(String jobdefname) {
		this.jobdefname = jobdefname;
	}
	
	public String getjobdefpriority() {
		return jobdefpriority;
	}
	public void setjobdefpriority(String jobdefpriority) {
		this.jobdefpriority = jobdefpriority;
	}
	
	public String getJobdefenginename() {
		return Jobdefenginename;
	}
	public void setJobdefenginename(String Jobdefenginename) {
		this.Jobdefenginename = Jobdefenginename;
	}
	
	public String getJobdefbundlingtype() {
		return Jobdefbundlingtype;
	}
	public void setJobdefbundlingtype(String Jobdefbundlingtype) {
		this.Jobdefbundlingtype = Jobdefbundlingtype;
	}
	
	public String getJobdeliverytype() {
		return Jobdeliverytype;
	}
	public void setJobdeliverytype(String Jobdeliverytype) {
		this.Jobdeliverytype = Jobdeliverytype;
	}
	
	//ENGINE
	private String engineName;
	private String description;
	private String path;
	private String resources;
	private String javaEnabler;
	private String javaEnabler_function;
	private String key_file;
	private boolean enginesubscription;
	
	public String getengineName() {
		return engineName;
	}
	public void setengineName(String engineName) {
		this.engineName = engineName;
	}
	
	public String getdescription() {
		return description;
	}
	public void setdescription(String description) {
		this.description = description;
	}
	
	public String getpath() {
		return path;
	}
	public void setpath(String path) {
		this.path = path;
	}
	
	public String getresources() {
		return resources;
	}
	public void setresources(String resources) {
		this.resources = resources;
	}
	
	public String getjavaEnabler() {
		return javaEnabler;
	}
	public void setjavaEnabler(String javaEnabler) {
		this.javaEnabler = javaEnabler;
	}
	
	public String getjavaEnabler_function() {
		return javaEnabler_function;
	}
	public void setjavaEnabler_function(String javaEnabler_function) {
		this.javaEnabler_function = javaEnabler_function;
	}
	
	public String getkey_file() {
		return key_file;
	}
	public void setkey_file(String key_file) {
		this.key_file = key_file;
	}
	

	public boolean isenginesubscription() {
		return enginesubscription;
	}
	public void setenginesubscription(boolean enginesubscription) {
		this.enginesubscription = enginesubscription;
	}	
	
}