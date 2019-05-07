package com.school.cc.server.config;
import javax.servlet.http.HttpSession;
import javax.websocket.HandshakeResponse;
import javax.websocket.server.HandshakeRequest;
import javax.websocket.server.ServerEndpointConfig;
import javax.websocket.server.ServerEndpointConfig.Configurator;
/**
 * 获取HttpSession
 */
public class GetHttpSessionConfiguration extends Configurator {
	@Override
	public void modifyHandshake(ServerEndpointConfig sec, HandshakeRequest request, HandshakeResponse response) {
		// TODO Auto-generated method stub
		HttpSession httpSession = (HttpSession) request.getHttpSession();
		if(httpSession!=null){
		  sec.getUserProperties().put(HttpSession.class.getName(), httpSession);
		}
	}

} 