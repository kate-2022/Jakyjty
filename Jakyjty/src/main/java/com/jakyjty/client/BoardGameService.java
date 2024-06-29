package com.jakyjty.client;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.jakyjty.charity.BoardGame;

@Service ("service")
public class BoardGameService {
	
	private static final String REST_END_POINT ="https://steamcommunity.com/sharedfiles/filedetails/?id=2876186816";
	
	public void invokeRestApiASync() {
		// Sending Asynchronous request
		WebClient webClient = WebClient.create();
		webClient.
				get().
				uri(REST_END_POINT).
				accept(MediaType.APPLICATION_JSON).
				retrieve().
				bodyToMono(BoardGame.class).
			    subscribe(BoardGameService::myGame);
		
	}
	
	public static void myGame (BoardGame game) {
		System.out.println(game);
	}
	

}
