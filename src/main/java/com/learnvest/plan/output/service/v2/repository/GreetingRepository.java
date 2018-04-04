package com.learnvest.plan.output.service.v2.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.learnvest.plan.output.service.v2.models.Greeting;
import org.springframework.stereotype.Component;


@Component
public class GreetingRepository {

    private Map<String, Greeting> greetings;

    public GreetingRepository() {
        greetings = new HashMap<>();
    }

    public Greeting save(Greeting greeting) {
        String id = UUID.randomUUID().toString();

        greetings.put(id, greeting);
        greeting.setId(id);

        return greeting;
    }

    public Greeting find(String id) {
        return greetings.get(id);
    }
}
