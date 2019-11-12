package com.ise.recommond.feignFallBack;

import com.ise.recommond.feignService.DistributeFeignService;
import org.springframework.stereotype.Component;


/**
 * @author wubeibei
 * @date 2019/11/3
 */
@Component
public class DistributeFeignFallBack implements DistributeFeignService {
    @Override
    public String hello() {
            return "网络断开了";
    }
}
