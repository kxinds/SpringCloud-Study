package com.kxinds.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author EiletXie
 * @Since 2020/3/9 13:52
 */
@Data
@NoArgsConstructor
public class CommonResult<T> {
    // 404 not found
    private Integer code;
    private String message;
    private T       data;

    /**
     * 构造函数
     * @param data 数据
     * @param code  校验码
     * @param message 异常/提示信息
     */
    public CommonResult(Integer code, String message, T data) {
        this.data = data;
        this.code = code;
        this.message = message;
    }

    /**
     * 构造函数
     * @param code  校验码
     * @param message 异常/提示信息
     */
    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}