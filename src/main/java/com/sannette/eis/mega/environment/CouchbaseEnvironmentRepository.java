package com.sannette.eis.mega.environment;

import org.springframework.cloud.config.environment.Environment;
import org.springframework.cloud.config.server.environment.EnvironmentRepository;
import org.springframework.core.Ordered;
import org.springframework.data.couchbase.core.CouchbaseTemplate;
import org.springframework.data.couchbase.repository.query.StringBasedCouchbaseQuery;

public class CouchbaseEnvironmentRepository implements EnvironmentRepository, Ordered {

    private final int order;

    private final CouchbaseEnvironmentProperties couchbaseEnvironmentProperties;

    private final CouchbaseTemplate couchbaseTemplate;

    public CouchbaseEnvironmentRepository(CouchbaseTemplate couchbaseTemplate,
                                          CouchbaseEnvironmentProperties couchbaseEnvironmentProperties,){
        this.couchbaseTemplate = couchbaseTemplate;
        this.couchbaseEnvironmentProperties= couchbaseEnvironmentProperties;
        this.order = couchbaseEnvironmentProperties.getOrder();
    }



    @Override
    public Environment findOne(String application, String profile, String label) {
    return null;
    }

    @Override
    public int getOrder() {
        return order;
    }
}
