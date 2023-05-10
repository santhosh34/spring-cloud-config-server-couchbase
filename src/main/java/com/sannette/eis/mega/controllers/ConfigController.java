package com.sannette.eis.mega.controllers;

import com.couchbase.client.core.deps.io.netty.handler.codec.http.multipart.HttpData;
import com.couchbase.client.java.Collection;
import com.couchbase.client.java.json.JsonObject;
import com.couchbase.client.java.kv.GetResult;
import com.couchbase.client.java.kv.MutationResult;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sannette.eis.mega.services.AppPropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/configuration-store")
public class ConfigController {

    @Autowired
    private AppPropertyService appPropertyService;


    @GetMapping(value = "/{serviceName}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getConfiguration(@PathVariable String serviceName) {
        GetResult getResult = appPropertyService.getConfiguration(serviceName);
        return getResult.contentAsObject().toString() ;
    }

    @PostMapping(value = "/{serviceName}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void  upsertConfiguration(@PathVariable String serviceName,
                                      @RequestBody JsonNode requestBody) {
          appPropertyService.upsertConfiguration(serviceName,requestBody);

    }
}
