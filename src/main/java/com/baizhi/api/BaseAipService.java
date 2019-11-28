package com.baizhi.api;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName BaseAipService
 * @Description TODO ()
 * @Author buxy
 * @Date 2019/11/28 15:11
 * @Version 1.0
 **/
public class BaseAipService {

    public static String HTTP_RESP_CODE = "code";
    public static String HTTP_RESP_MSG = "msg";
    public static String HTTP_RESP_DATA = "data";

    public static Integer HTTP_RESP_200_CODE = 200;
    public static String HTTP_RESP_200_VALUE = "success";

    public static Integer HTTP_RESP_500_CODE = 500;
    public static String HTTP_RESP_500_VALUE = "error";


    public static Map<String, Object> setRestltSuccess() {
        return setRestlt(HTTP_RESP_200_CODE, HTTP_RESP_200_VALUE, null);
    }

    public static Map<String, Object> setRestltSuccessData(Object data) {
        return setRestlt(HTTP_RESP_200_CODE, HTTP_RESP_200_VALUE, data);
    }

    public static Map<String, Object> setRestltSuccessMsg(String msg) {
        return setRestlt(HTTP_RESP_200_CODE, msg, null);
    }

    public static Map<String, Object> setRestltSuccessDataMsg(String msg, Object data) {
        return setRestlt(HTTP_RESP_200_CODE, msg, data);
    }

    public static Map<String, Object> setRestltError() {
        return setRestlt(HTTP_RESP_500_CODE, HTTP_RESP_500_VALUE, null);
    }

    public static Map<String, Object> setRestltErrorData(Object data) {
        return setRestlt(HTTP_RESP_500_CODE, HTTP_RESP_500_VALUE, data);
    }

    public static Map<String, Object> setRestltErrorMsg(String msg) {
        return setRestlt(HTTP_RESP_500_CODE, msg, null);
    }

    public static Map<String, Object> setRestltErrorDataMsg(String msg, Object data) {
        return setRestlt(HTTP_RESP_500_CODE, msg, data);
    }

    private static Map<String, Object> setRestlt(Integer code, String msg, Object data) {
        Map<String, Object> map = new HashMap<>(16);
        map.put(HTTP_RESP_CODE, code);
        map.put(HTTP_RESP_MSG, msg);
        map.put(HTTP_RESP_DATA, data);
        return map;
    }

}
