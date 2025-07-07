package com.jose.chatapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

//This class activates WebSocket in the project and defines how messages and sent and received

@Configuration // This annotation configures Spring
@EnableWebSocketMessageBroker //activate websocket with STOMP
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        //Defines websocket entry point "/ws"
        registry.addEndpoint("/ws").withSockJS();
    }

    @Override
    /*this method configures the message broker which is responsible for routing messages
    * from one client to another*/
    public void configureMessageBroker(MessageBrokerRegistry config) {
        //where all clientes will listen to messages (like a channel)
        //where clientes will send meessages to the server
        config.enableSimpleBroker("/topic");
        config.setApplicationDestinationPrefixes("/app");

    }
}
