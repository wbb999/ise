package com.ise.recommond;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringCloudApplication
@EnableFeignClients
public class RecommondApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecommondApplication.class, args);
    }

}
