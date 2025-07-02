package com.api.gateway.service.mappers;

import com.api.gateway.service.domain.Logs;
import com.api.gateway.service.dto.LogsDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface LogsMapper {

    LogsMapper MAPPER = Mappers.getMapper(LogsMapper.class);
    LogsMapper INSTANCE = Mappers.getMapper(LogsMapper.class);


    LogsDTO toDto(Logs logs);
    @Mappings({
            @Mapping(target = "id",  ignore = true)
    })
    Logs toEntity(LogsDTO logsDTO);


    List<LogsDTO> toDto(List<Logs> logs);
    @Mappings({
            @Mapping(target = "id",  ignore = true)
    })
    List<Logs> toEntity(List<Logs> logs);


}
