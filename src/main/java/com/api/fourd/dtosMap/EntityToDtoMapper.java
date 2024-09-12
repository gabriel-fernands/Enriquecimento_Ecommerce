package com.api.fourd.dtosMap;


import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class EntityToDtoMapper {

    public <S, T> T mapWithoutId(S sourceEntity, Class<T> targetClass){
        if(sourceEntity == null) return null;

        T targetObject;
        try {
            targetObject = targetClass.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Unable to create new instance of target class", e);
        }

        final String[] ignoredProperties = {"id"};
        BeanUtils.copyProperties(sourceEntity, targetObject, ignoredProperties);
        return targetObject;
    }

    public <S, T> List<T> mapListWithoutIds(List<S> sourceEntities, Class<T> targetClass){
        return sourceEntities.stream()
                .map(entity -> this.mapWithoutId(entity, targetClass))
                .collect(Collectors.toList());
    }

}
