package com.api.gateway.service.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Document(collation = "routerConfig")
public class RouterConfig {

    String id;
    String routerLocalId;
    String routerCountryCode;
    String routerName;
    String path;
    String methods;
    int rateLimit;
    boolean authRequired;
    String createdDate;
}
