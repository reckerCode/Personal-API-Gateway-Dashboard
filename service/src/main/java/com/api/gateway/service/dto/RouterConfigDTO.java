package com.api.gateway.service.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RouterConfigDTO {

    String id;
    String routerName;
    String path;
    String methods;
    int rateLimit;
    boolean authRequired;
    String createdDate;
}
