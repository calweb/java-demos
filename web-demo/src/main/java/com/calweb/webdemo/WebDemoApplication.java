package com.calweb.webdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WebDemoApplication {

	 static final String RANDO_URL = "http://gturnquist-quoters.cfapps.io/api/random";

    static final String API_URL = "http://ufc-data-api.ufc.com/api/v1/us/fighters/242037.json";

	public static void main(String[] args) {
		SpringApplication.run(WebDemoApplication.class, args);
	}
    RestTemplate restTemplate = new RestTemplate();

	@Bean
	public String run() {

		RandomQuoteResponse quote = restTemplate.getForObject(RANDO_URL, RandomQuoteResponse.class);

		System.out.println("/****************/");
		System.out.println(quote);
		System.out.println("/****************/");
		return "done";
	}
	@Bean
    public String myBad() {

        Fighter fighter = restTemplate.getForObject(API_URL, Fighter.class);
        System.out.println("/****************/");
        System.out.println(fighter);
        System.out.println("/****************/");
        return "done";
    }
}
