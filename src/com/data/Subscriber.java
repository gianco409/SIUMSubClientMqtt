package com.data;

import org.eclipse.paho.client.mqttv3.*;

public class Subscriber {

     public static final String BROKER_URL = "tcp://192.168.0.2:1883";
     private MqttClient client;

     public Subscriber() {

          String clientId = "demonio";
          try {
              client = new MqttClient(BROKER_URL, clientId);
          }
          catch (MqttException e) {
              e.printStackTrace();
              System.exit(1);
          }
     }

     public void start() {

          try {
              client.setCallback(new SubscribeCallback());
              client.connect();
              client.subscribe("/MaquinaA/#");
          }
          catch (MqttException e) {
              e.printStackTrace();
              System.exit(1);
          }

     }

}