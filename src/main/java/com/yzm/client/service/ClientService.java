package com.yzm.client.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yzm.provider.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author songpeihao
 */
@Service
public class ClientService {

    @Reference
    private UserService userService;

    public String get() {
        return this.userService.insert();
    }
}
