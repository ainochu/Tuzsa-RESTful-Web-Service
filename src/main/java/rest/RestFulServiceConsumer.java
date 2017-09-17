package main.java.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import main.java.bean.Info;
import main.java.bean.Post;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class RestFulServiceConsumer {
	
	
	
	public static Post getPostData(String stopId){
		RestTemplate restTemplate = new RestTemplate();
	    Post post = restTemplate.getForObject("https://www.zaragoza.es/sede/servicio/urbanismo-infraestructuras/transporte-urbano/poste-autobus/"+stopId+".json", Post.class);
		return post;
	}
	
	public static List<Post> getPosts(){
		RestTemplate restTemplate = new RestTemplate();
	    Info info = restTemplate.getForObject("https://www.zaragoza.es/sede/servicio/urbanismo-infraestructuras/transporte-urbano/poste-autobus.json",Info.class);
		List<Post> posts = info.getResult();
	    return posts;
		
	}

}
