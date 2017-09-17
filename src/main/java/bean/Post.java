package main.java.bean;


import java.text.Normalizer;

import main.java.bean.Line;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Post {
	
	private String id;
	private String title;
	private String[] lines;
	private String link;
	private String icon;
	private long idR;
	private String numero;
	private Line[] destinos;
	private Line[] schedule;
	
	
	
	public Post(){
		
	}
	
	public Post(long l, String numero){
		this.idR = l;
		this.numero = numero;
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		System.out.println(title + "t�tulo de la parada");
		title = Normalizer.normalize(title , Normalizer.Form.NFD);
	    title = title.replaceAll("[^\\p{ASCII}]", "");
		String[] splits = title.split("Lineas");
		this.title = splits[0].trim();
		splits[1] = splits[1].substring(1, splits[1].length());
		this.lines = splits[1].split(",");
		for(int i = 0; i < lines.length; i++){
			this.lines[i] = this.lines[i].trim();
		}
	}
	
	
	
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String[] getLines() {
		return lines;
	}
	public void setLines(String[] lines) {
		this.lines = lines;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	@Override
	public String toString() {
		return "Poste [id=" + this.id + ", title=" + this.title +", lineas=" + this.lines.toString()
				 + ", link="  + ", icon=" + this.icon + "Schedule: " + this.schedule.toString()
				+ "]";
	}

	public void setDestinos(Line[] destinos) {
		this.schedule = destinos;
	}

	public Line[] getSchedule() {
		return schedule;
	}
	
	
	
	
	
	
	
	
	
	

}
