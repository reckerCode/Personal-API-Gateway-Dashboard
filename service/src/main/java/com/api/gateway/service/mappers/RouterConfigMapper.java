package com.api.gateway.service.mappers;


import com.api.gateway.service.domain.RouterConfig;
import com.api.gateway.service.dto.RouterConfigDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface RouterConfigMapper {

    RouterConfigMapper INSTANCE = Mappers.getMapper(RouterConfigMapper.class);


    RouterConfigDTO entityToDto(RouterConfig entity);

    @Mappings({
            @Mapping(target = "id",  ignore = true)
    })
    RouterConfig dtoToEntity(RouterConfigDTO entity);

    List<RouterConfigDTO> entityToDto(List<RouterConfig> entity);

    @Mappings({
            @Mapping(target = "id",  ignore = true)
    })
    List<RouterConfig> dtoToEntity(List<RouterConfigDTO> entity);
}
