package org.sunbird.learner.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BatchLocalCache {

    private static Map<String, Object> batchMap = new ConcurrentHashMap<>();

    public static Map<String, Object> getBatchMap() {
        return batchMap;
    }
    public static void addBatchToMap(){

 }
}
