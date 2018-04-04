package com.learnvest.plan.output.service.v2.graphql.resolvers;

import com.learnvest.plan.output.service.v2.models.Greeting;
import com.learnvest.plan.output.service.v2.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class GreetingQuery implements GraphQLQueryResolver {

    @Autowired
    private GreetingRepository greetingRepository;

    public Greeting getGreeting(String id) {
        return greetingRepository.find(id);
    }
}
