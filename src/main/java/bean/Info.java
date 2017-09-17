package main.java.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Info {
	
	private String totalCount;
	private List<Post> result;
	
	
	public Info(){
	
	}


	public String getTotalCount() {
		return totalCount;
	}


	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}


	public List<Post> getResult() {
		return result;
	}


	public void setResult(List<Post> result) {
		this.result = result;
	}
	
	
	

}
