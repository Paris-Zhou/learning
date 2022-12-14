package com.zhoupeng.common.exception;


import com.zhoupeng.common.api.IErrorCode;

/**
 * 断言处理类，用于抛出各种API异常
 * Created by Paris_Zhou on 2022/2/27.
 */
public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
