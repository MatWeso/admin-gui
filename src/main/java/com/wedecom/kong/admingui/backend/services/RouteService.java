package com.wedecom.kong.admingui.backend.services;

import com.google.common.collect.Sets;
import com.wedecom.kong.admingui.backend.services.model.RouteDetails;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class RouteService {


    public Set<RouteDetails> getRoutes() {
        return Sets.newHashSet(
                RouteDetails.builder()
                        .id("1")
                        .name("RouteDetails 1")
                        .methods(Sets.newHashSet(HttpMethod.GET, HttpMethod.POST))
                        .protocols(Sets.newHashSet("http", "https"))
                        .paths(Sets.newHashSet("/path/x1/x2", "/path/x3/x4"))
                        .build(),
                RouteDetails.builder()
                        .id("2")
                        .name("RouteDetails 2")
                        .methods(Sets.newHashSet(HttpMethod.PATCH, HttpMethod.POST))
                        .protocols(Sets.newHashSet("http", "https"))
                        .paths(Sets.newHashSet("/path/x1/x2", "/path/x3/x4"))
                        .build()

        );
    }


}
