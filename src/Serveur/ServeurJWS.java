package Serveur;

import Service.EnseignantService;

import javax.xml.ws.Endpoint;

public class ServeurJWS {

    public static void main(String[] args) {
        String url = "http://localhost:8585/";
        Endpoint.publish(url,new EnseignantService());
        System.out.println(url);
    }
}
