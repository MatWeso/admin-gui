package com.wedecom.kong.admingui.backend.services.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpMethod;

import java.util.Set;

@Data
@Builder
public class RouteDetails {

    private String id;
    private String name;
    private Set<String> paths;
    private Set<String> protocols;
    private Set<HttpMethod> methods;

}
