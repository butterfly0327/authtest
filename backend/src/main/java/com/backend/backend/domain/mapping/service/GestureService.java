package com.backend.backend.domain.mapping.service;

import com.backend.backend.domain.mapping.entity.Gesture;
import com.backend.backend.domain.mapping.mapper.GestureMapper;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GestureService {
    private final GestureMapper gestureMapper;

    //기능 선택 화면 - 프리셋 내부에 선택되지 않은 기능 제스처 목록
    public List<Gesture> findNotUseGesture(int mappingId){
        List<Gesture> notUseMapping = gestureMapper.findNotUseMapping(mappingId);
        return notUseMapping;
    }

}
