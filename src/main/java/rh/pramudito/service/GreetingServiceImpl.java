package rh.pramudito.service;

import java.util.UUID;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello(String name) {
        return String.format("Hello %s, your ID is %s", name, UUID.randomUUID().toString());
    }
}
