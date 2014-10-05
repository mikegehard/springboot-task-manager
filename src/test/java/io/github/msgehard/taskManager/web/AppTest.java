package io.github.msgehard.taskManager.web;

import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.WebClient;
import io.github.msgehard.taskManager.App;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.htmlunit.MockMvcWebConnection;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {App.class})
@WebAppConfiguration("")
public class AppTest {
    @Autowired
    private WebApplicationContext context;

    private WebClient webClient;

    @Before
    public void setup() {
        MockMvc mockMvc = MockMvcBuilders
                .webAppContextSetup(context)
                .build();
        webClient = new WebClient();
        webClient.setWebConnection(new MockMvcWebConnection(mockMvc));
    }

    @After
    public void cleanup() {
        this.webClient.closeAllWindows();
    }

    @Test
    public void homePage() throws IOException {
        Page homePage = webClient.getPage("http://localhost");
        assertEquals("Home", homePage.getWebResponse().getContentAsString());
    }
}