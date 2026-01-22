package com.backend.backend.domain.mapping.service;

import com.backend.backend.domain.mapping.entity.Action;
import com.backend.backend.domain.mapping.entity.Gesture;
import com.backend.backend.domain.mapping.mapper.ActionMapper;
import com.backend.backend.domain.mapping.mapper.GestureMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ActionService {
    private final ActionMapper actionMapper;

    //기능 선택 화면 - 프리셋 내부에 선택되지 않은 기능 제스처 목록
    public List<Action> findNotUseGesture(int mappingId){
        List<Action> notUseMapping = actionMapper.findNotUseMapping(mappingId);
        return notUseMapping;
    }
}
