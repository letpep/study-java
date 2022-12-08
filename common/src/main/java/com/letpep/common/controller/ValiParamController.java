package com.letpep.common.controller;

import com.letpep.common.model.ValiParam;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 请求参数校验，
 * 使用exception 拦截器 封装返回结果
 */
@RestController
@Validated
public class ValiParamController {

    @RequestMapping(value = "/vali")
    public ValiParam validate(@Valid @RequestBody ValiParam param) {

        return param;
    }

}
