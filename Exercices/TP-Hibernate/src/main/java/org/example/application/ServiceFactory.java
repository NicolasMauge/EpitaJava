package org.example.application;

public class ServiceFactory {
    public static VoitureServiceImpl getService(){
        return new VoitureServiceImpl();
    }
}
