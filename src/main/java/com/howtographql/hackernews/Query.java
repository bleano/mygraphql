package com.howtographql.hackernews;
import com.coxautodev.graphql.tools.GraphQLRootResolver;

import java.util.List;
import java.util.ArrayList;

public class Query implements GraphQLRootResolver {

    private final LinkRepository linkRepository;

    public Query(final LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public List<Link> allLinks(final Integer min, final Integer max, final String domain) throws Exception{
        System.out.println("\r\n");
        return linkRepository.getAllLinks(min, max, domain);
    }
}