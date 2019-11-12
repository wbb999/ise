package com.ise.recommond.feignService;

import com.ise.recommond.feignFallBack.DistributeFeignFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author wubeibei
 * @date 2019/11/3
 */
@FeignClient(value = "ise-distribute", fallback = DistributeFeignFallBack.class)
public interface DistributeFeignService {
    @RequestMapping("/test")
    String hello();
}
