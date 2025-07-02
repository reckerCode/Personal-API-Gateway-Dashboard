package com.api.gateway.service.repository;

import com.api.gateway.service.domain.RouterConfig;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RouterConfigRepository extends MongoRepository<RouterConfig, String> {

    RouterConfig getRouterConfigById(String id);
    RouterConfig getRouterConfigByRouterLocalIdAndRouterCountryCode(String localId, String countryCode);
    List<RouterConfig> findByRouterCountryCodeAndRouterLocalId(String countryCode, String localId);

}
