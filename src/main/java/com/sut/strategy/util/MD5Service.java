package com.sut.strategy.util;

import org.apache.commons.codec.digest.DigestUtils;

import java.io.UnsupportedEncodingException;

public class MD5Service {
    public static String Encrypt(String encryptString) throws UnsupportedEncodingException {
        byte[] result = encryptString.getBytes("UTF-16BE");
        return DigestUtils.md5Hex(encryptString).substring(3,15);
    }
}
