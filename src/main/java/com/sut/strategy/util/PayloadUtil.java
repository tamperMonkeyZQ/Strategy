package com.sut.strategy.util;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * Date: 28/03/2019
 */
@Slf4j
public class PayloadUtil {

    public static Map<String, String> checkPayloadValue(Map<String, Object> payload) throws Exception{
        Map<String, String> checkedMap = new HashMap<>();
        if (log.isInfoEnabled()) log.info(payload.toString());
        for (Map.Entry<String, Object> entry : payload.entrySet()) {
            if (entry.getValue().toString().trim().length() == 0) {
                checkedMap.put(entry.getValue().toString(), "参数为空值");
                break;
            }
        }
        return checkedMap;
    }

}
