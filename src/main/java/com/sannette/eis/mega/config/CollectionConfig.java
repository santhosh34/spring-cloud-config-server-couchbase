package com.sannette.eis.mega.config;

import com.couchbase.client.java.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollectionConfig {
    @Autowired
    private CouchbaseConnection couchbaseConnection;

    @Autowired
    private CouchbaseConfig couchbaseConfig;

    @Bean
    public Collection getAppPropertyCollection(){
                return couchbaseConnection.cluster()
                        .bucket(couchbaseConfig.getConfigBucketName())
                        .scope(couchbaseConfig.getScope())
                        .collection(couchbaseConfig.getCollectionName());
    }
}
