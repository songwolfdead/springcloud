package com.lxt.serviceprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘小通
 * @Copy Right Information: 中科软科技股份有限公司
 * @Project: GTS4
 * @CreateDate: 2018/12/16 12:51
 * @history Sr Date Modified By Why & What is modified
 * 1.2018/12/16 刘小通 & new
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String index(String name) {
        return "hello "+name+"，this is first messge";
    }
    @RequestMapping(value = "/foo")
    public String foo(String foo) {
        return "hello "+foo+"，this is first messge";
    }
}
