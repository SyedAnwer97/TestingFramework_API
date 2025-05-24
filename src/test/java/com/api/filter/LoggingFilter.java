package com.api.filter;

import com.api.listeners.TestListeners;
import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingFilter implements Filter {

    private static final Logger LOGGER = LogManager.getLogger(TestListeners.class);

    @Override
    public Response filter(FilterableRequestSpecification filterableRequestSpecification, FilterableResponseSpecification filterableResponseSpecification, FilterContext filterContext) {
        logRequest(filterableRequestSpecification);
        Response response = filterContext.next(filterableRequestSpecification, filterableResponseSpecification);
        logResponse(response);
        return response;
    }

    public void logRequest(FilterableRequestSpecification requestSpecification) {
        LOGGER.info("Base URI : " + requestSpecification.getBaseUri());
        LOGGER.info("Request Header : " + requestSpecification.getHeaders());
        LOGGER.info("Request Payload : " + requestSpecification.getBody());
    }

    public void logResponse(Response response) {
        LOGGER.info("Status Code : " + response.getStatusCode());
        LOGGER.info("Response Header : " + response.headers());
        LOGGER.info("Response Body : " + response.getBody());
    }
}
