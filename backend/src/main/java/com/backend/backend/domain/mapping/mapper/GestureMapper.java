package com.backend.backend.domain.mapping.mapper;

import com.backend.backend.domain.mapping.entity.Gesture;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GestureMapper {


    List<Gesture> findNotUseMapping(@Param("mappingId")int mappingId);
}
