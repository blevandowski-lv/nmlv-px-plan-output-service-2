package com.learnvest.plan.output.service.v2.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.learnvest.plan.output.service.v2.models.Greeting;
import com.learnvest.plan.output.service.v2.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetingMutation implements GraphQLMutationResolver {

    @Autowired
    private GreetingRepository greetingRepository;

    public Greeting newGreeting(String message) {
        Greeting greeting = new Greeting();
        greeting.setMessage(message);

        return greetingRepository.save(greeting);
    }
}
