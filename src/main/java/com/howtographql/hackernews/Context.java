package com.howtographql.hackernews;

import com.google.common.graph.Graph;

/**
 * Created by bobdo on 8/12/2017.
 */
public class Context {
    private GraphQLEndpoint graphQLEndpoint = null;
    public void setGraphQLEndpoint(final GraphQLEndpoint ep){
        this.graphQLEndpoint = ep;
    }
    public GraphQLEndpoint getGraphQLEndpoint(){
        return graphQLEndpoint;
    }
}
