package com.spittr.web;

import org.junit.Before;import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import com.spittr.config.RootConfig;
import com.spittr.config.WebConfig;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

/**
 * Created by Allen on 2016/4/16.
 */
//集成测试 失败
/*
import static org.junit.Assert.assertEquals;
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration(value = "src/main/webapp")
@ContextHierarchy({
        @ContextConfiguration(name = "parent", classes = RootConfig.class),
        @ContextConfiguration(name = "child", classes = WebConfig.class)
})
public class HomeControllerTest {
    @Autowired
    private WebApplicationContext context;

    MockMvc mockMvc;
    @Before
    public void setupMvc() {
        mockMvc = WebAppContextSetup().build();
    }


}*/
