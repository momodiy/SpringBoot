package com.steven.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Lang;

import java.io.Serializable;

/**
 * Author: Steven Lee
 * Created: 2020/3/19 22:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Payment implements Serializable {
    private Lang id;
    private  String serial;
}
