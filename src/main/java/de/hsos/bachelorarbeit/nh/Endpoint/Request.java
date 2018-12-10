package de.hsos.bachelorarbeit.nh.Endpoint;

import de.hsos.bachelorarbeit.nh.Endpoint.RESTEndpoint;

public class Request {
    String path;
    RESTEndpoint restEndpoint;

    public Request(String path, RESTEndpoint restEndpoint) {
        this.path = path;
        this.restEndpoint = restEndpoint;
    }

    public String getPath() {
        return path;
    }

    public RESTEndpoint getRestEndpoint() {
        return restEndpoint;
    }

    @Override
    public String toString() {
        return "Request{" +
                "path='" + path + '\'' +
                ", restEndpoint=" + restEndpoint +
                '}';
    }
}