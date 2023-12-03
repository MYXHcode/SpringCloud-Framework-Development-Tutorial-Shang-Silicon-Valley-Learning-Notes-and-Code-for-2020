package com.myxh.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author MYXH
 * @date 2023/12/2
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Payment implements Serializable
{
    private Long id;
    private String serial;
}
