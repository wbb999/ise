package com.ise.recommond.controller;

import com.ise.recommond.feignService.DistributeFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author wubeibei
 * @date 2019/11/3
 */
@RestController
public class RecommondController {
    @Autowired
    DistributeFeignService distributeFeignService ;

    @RequestMapping("/consumer")
    public String helloConsumer(){
        return distributeFeignService.hello();
}

}
