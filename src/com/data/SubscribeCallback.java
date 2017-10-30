package com.data;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;

import dao.DAOFactory;
import dao.design.ITiempoMaquinariaDAO;
import dao.to.TiempoMaquinariaTO;

public class SubscribeCallback implements MqttCallback{

	public void connectionLost(Throwable arg0) {
		// TODO Auto-generated method stub
	}

	public void deliveryComplete(IMqttDeliveryToken arg0) {
		// TODO Auto-generated method stub
	}

	public void messageArrived(String arg0, MqttMessage arg1) throws Exception {
		// TODO Auto-generated method stub
		ITiempoMaquinariaDAO tiempomaquinariadao = DAOFactory.getInstane().getTiempoMaquinariaDAO();
		TiempoMaquinariaTO tiempomaquinariato = ;
		String mensaje = tiempomaquinariadao.insertarTiempoMaquinaria(tiempomaquinariato);
	}
	
}
