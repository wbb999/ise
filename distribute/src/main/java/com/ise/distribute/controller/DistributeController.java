package com.ise.distribute.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author wubeibei
 * @date 2019/11/3
 */
@RestController
public class DistributeController {
        @RequestMapping("/test")
        public String testSay() {
            return "hello world";
        }
}
