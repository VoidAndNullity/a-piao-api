package org.eu.apiao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制器
 *
 * @author VoidAndNullity
 * @date 2023/04/24
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "没钱租服务器, 后续再说吧~";
    }
}
