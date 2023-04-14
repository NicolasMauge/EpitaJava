package org.example.application;

public class ServiceFactory {
    static public IClientService getService(){
        return new ClientServiceImpl();
    }
}
