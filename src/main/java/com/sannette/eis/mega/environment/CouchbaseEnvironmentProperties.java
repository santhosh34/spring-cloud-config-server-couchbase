package com.sannette.eis.mega.environment;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.config.server.support.EnvironmentRepositoryProperties;
import org.springframework.core.Ordered;

@ConfigurationProperties("spring.cloud.config.server.couchbase")
public class CouchbaseEnvironmentProperties implements EnvironmentRepositoryProperties {
    private int order = Ordered.LOWEST_PRECEDENCE;

    public int getOrder() {
        return this.order;
    }

    @Override
    public void setOrder(int order) {
        this.order = order;
    }
}
