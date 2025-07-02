package com.api.gateway.service.repository;


import com.api.gateway.service.domain.Logs;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogsRepository extends MongoRepository<Logs, String> {

    Logs getLogsById(String id);
    Logs getLogsByLogLocalIdAndLogCountryCode(String localId, String countryCode);
    List<Logs> findByLogCountryCodeAndLogLocalId(String countryCode, String localId);
}
