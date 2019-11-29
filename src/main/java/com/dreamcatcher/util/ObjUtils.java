package com.dreamcatcher.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class ObjUtils {
    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static Map<String, Object> objToMap(Object c) {
        return MAPPER.convertValue(c, Map.class);
    }

    public static String objToJson(Object c) {
        try {
            return MAPPER.writeValueAsString(c);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
