package main.java.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Line {
	
	private String id;
	private String destination;
	private String linea;
	private String destino;
	private String primero;
	private String segundo;
	private List<String> times;
	
	
	public Line(){
		
	}

	public void setLinea(String linea) {
		this.id = linea;
	}

	public void setDestino(String destino) {
		this.destination = destino;
	}

	public void setPrimero(String primero) {
		this.primero = primero;
	}


	public void setSegundo(String segudo) {
		this.segundo = segudo;
	}

	public List<String> getTimes() {
		return this.times;
	}


	public String getId() {
		this.times = new ArrayList();
		String firstTime = getTimes(this.primero);
		String secondTime = getTimes(this.segundo);
		if(firstTime != null){
			this.times.add(firstTime);
		}
		if(secondTime != null){
			this.times.add(secondTime);
		}
		return id;
	}


	public String getDestination() {
		return destination;
	}

	public String getTimes(String time){
		if(time.contains("minutos")){
			return time.split(" ")[0];
		}
		return null;
	}
	

	
	
	


	
	
	

}
