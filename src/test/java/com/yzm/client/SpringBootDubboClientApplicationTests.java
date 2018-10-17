package com.yzm.client;

import com.yzm.client.service.ClientService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDubboClientApplicationTests {

    @Test
    public void contextLoads() {
        ClientService cs = new ClientService();
        Assert.assertEquals("insert success", cs.get());
    }

}
