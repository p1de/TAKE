/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Szymon
 */
public class Main {

    public static void main(String[] args) {
        Client client = ClientBuilder.newClient();
        String count = client.target("http://localhost:8080/Complaints/" + "resources/complaints/count")
                        .request(MediaType.TEXT_PLAIN)
                        .get(String.class);
        System.out.println("Count: " + count);

        client.close();
    }
}
