package com.sannette.eis.mega.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class CouchbaseConfig {

    @Value("${app.database.couchbase.connectionString}")
    private String connectionString;

    @Value("${app.database.couchbase.userName}")
    private String userName;

    @Value("${app.database.couchbase.password}")
    private String password;

    @Value("${app.database.couchbase.configBucketName}")
    private String configBucketName;

    @Value("${app.database.couchbase.scope}")
    private String scope;

    @Value("${app.database.couchbase.collectionName}")
    private String collectionName;

}
