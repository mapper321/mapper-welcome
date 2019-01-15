package com.mapper.sys.config;

import java.util.Map;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.handler.TextWebSocketHandler;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

@Configuration
@EnableWebSocket
public class WebScoketConfig implements WebSocketConfigurer {

	@Override
	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
		registry.addHandler(new ChatMessageHandler(), "/testSocket").addInterceptors(new ChatHandshakeInterceptor()).setAllowedOrigins("*").withSockJS();
		
	}
	
	
	public class ChatMessageHandler extends TextWebSocketHandler{

		@Override
		public void afterConnectionEstablished(WebSocketSession session) throws Exception {
			System.out.println("连接建立啦");
			session.sendMessage(new TextMessage("欢迎啊"));
			super.afterConnectionEstablished(session);
		}

		@Override
		protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
			System.out.println("接收信息："+message);
			super.handleTextMessage(session, message);
		}

		@Override
		public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
			System.out.println("连接关闭");
			super.afterConnectionClosed(session, status);
		}
		
	}
	
	
	public class ChatHandshakeInterceptor extends HttpSessionHandshakeInterceptor {

		@Override
		public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Map<String, Object> attributes) throws Exception {
			System.out.println("Before Handshake");
	        return super.beforeHandshake(request, response, wsHandler, attributes);
		}

		@Override
		public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Exception ex) {
			System.out.println("After Handshake");
			super.afterHandshake(request, response, wsHandler, ex);
		}
	}

}
