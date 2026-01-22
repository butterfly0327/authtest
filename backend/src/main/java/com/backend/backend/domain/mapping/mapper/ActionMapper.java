package com.backend.backend.domain.mapping.mapper;

import com.backend.backend.domain.mapping.entity.Action;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ActionMapper {

    List<Action> findNotUseMapping(@Param("mappingId") int mappingId);

}
