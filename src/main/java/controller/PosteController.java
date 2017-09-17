package main.java.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import main.java.bean.Info;
import main.java.bean.Post;
import main.java.rest.RestFulServiceConsumer;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PosteController {
	
	
	private static final String template = "N�mero de poste pedido, %s!";
    private final AtomicLong counter = new AtomicLong();
    

    @RequestMapping(value = "/stops/{stopId}",produces={MediaType.APPLICATION_JSON_VALUE})
    public Post poste(@PathVariable("stopId") String stopId) {
        return RestFulServiceConsumer.getPostData(stopId);
    }
    
    @RequestMapping(value = "/stops", produces ={MediaType.APPLICATION_JSON_VALUE})
    public List<Post> poste() {
        return RestFulServiceConsumer.getPosts();
    }

}
