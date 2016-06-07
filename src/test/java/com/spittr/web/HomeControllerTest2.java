package com.spittr.web;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Created by Allen on 2016/4/16.
 */
//首先stanaloneSetup()方法通过HomeController的实例模拟出一个web服务，
// 然后使用perform执行对应的GET请求，并检查返回的视图的名称。
public class HomeControllerTest2 {
    MockMvc mockMvc;
    @Before
    public void setMockMvc() {
        HomeController controller = new HomeController();
        mockMvc = standaloneSetup(controller).build();
    }
    @Test
    public void testHomePage() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(view().name("home"));
    }
}
