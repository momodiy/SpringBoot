package com.steven.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: Steven Lee
 * Created: 2020/3/19 22:30
 */
@Data
@AllArgsConstructor // 全参构造方法
@NoArgsConstructor  // 空参构造方法
public class CommonResult<T> { // 泛型
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code,String message) { // 只有两个参数的构造方法
        this(code,message,null);
    }
}
