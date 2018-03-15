package com.evada.springweb.test;

import com.evada.springweb.controller.HomeController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * @author dingqin
 * @date 2017/11/3
 */
public class HomeControllerTest {

    @Test
    public void controllerTest() throws Exception {
        HomeController controller = new HomeController();
        MockMvc mvc = MockMvcBuilders.standaloneSetup(controller).build();
        mvc.perform(get("/")).andExpect(view().name("home"));
    }
}
