package com.example.client;

import java.util.concurrent.Callable;
import java.net.Socket;
import java.util.Scanner;

public class NetworkClientCallable implements Callable<RequestResponse> {
    
    private final RequestResponse lookup;
    
    public NetworkClientCallable(RequestResponse lookup) {
        this.lookup = lookup;
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

    @Override
    public RequestResponse call() throws Exception {
        
        try (Socket sock = new Socket(lookup.host, lookup.port);
            Scanner scanner = new Scanner(sock.getInputStream())) {
            lookup.response = scanner.next();
            return lookup;
        }
        
    }
    
}
