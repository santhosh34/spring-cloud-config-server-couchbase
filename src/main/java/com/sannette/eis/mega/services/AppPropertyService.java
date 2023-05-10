package com.sannette.eis.mega.services;

import com.couchbase.client.java.kv.GetResult;
import com.couchbase.client.java.kv.MutationResult;
import com.fasterxml.jackson.databind.JsonNode;
import com.sannette.eis.mega.config.CollectionConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppPropertyService {

    @Autowired
    private CollectionConfig collectionConfig;


    public MutationResult upsertConfiguration(String serviceName, JsonNode requestBody) {

        MutationResult upsertResult = collectionConfig.getAppPropertyCollection().upsert(
                serviceName, requestBody);
        return upsertResult;
    }

    public GetResult getConfiguration(String serviceName) {
        GetResult getResult = collectionConfig.getAppPropertyCollection().get(serviceName);
        return getResult;
    }


}
