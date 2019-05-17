package com.sut.strategy.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;

public class JsonReader {
    public static JSONObject excute(String fileName) throws IOException {

        StringBuffer buffer = new StringBuffer();
        BufferedReader bf= new BufferedReader(new FileReader("/Users/zhangq/IdeaProjects/strategy/src/main/resources/"+fileName));
        String s = null;
        while((s = bf.readLine())!=null){//使用readLine方法，一次读一行
            buffer.append(s.trim());
        }
        String result = buffer.toString();
        JSONObject repeat = new JSONObject(new LinkedHashMap<>());
        repeat = JSON.parseObject(result);
        return repeat;
    }
}
