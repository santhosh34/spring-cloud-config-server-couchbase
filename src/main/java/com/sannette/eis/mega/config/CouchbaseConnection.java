package com.sannette.eis.mega.config;


import com.couchbase.client.java.Cluster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CouchbaseConnection {
    @Autowired
    private CouchbaseConfig couchbaseConfig;

    @Bean
    public Cluster cluster(){
        return  Cluster.connect(
                couchbaseConfig.getConnectionString(),
                couchbaseConfig.getUserName(),
                couchbaseConfig.getPassword()
        );
    }
}
