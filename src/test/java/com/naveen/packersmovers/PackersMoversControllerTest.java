package com.naveen.packersmovers;

import com.naveen.packersmovers.controller.PackersMoversController;
import com.naveen.packersmovers.model.Driver;
import com.naveen.packersmovers.service.PackersMoversService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.mockito.ArgumentMatchers.any;

public class PackersMoversControllerTest {

    private MockMvc mockMvc;

    @Mock
    private PackersMoversService userService;

    @InjectMocks
    private PackersMoversController packersMoversController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(packersMoversController).build();
    }

    @Test
    public void testCustomerDetails() throws Exception {
        // Create a sample customer JSON object
        String driverJson = "{\"name\":\"John Doe\", \"email\":\"johndoe@example.com\"}";

        // Perform the POST request and validate the response
        mockMvc.perform(post("/driver/driverDetails")
                .contentType(MediaType.APPLICATION_JSON)
                .content(driverJson))
                .andExpect(status().isOk())  // Expect HTTP 200 status
                .andExpect(content().string("New user is added"));  // Expect specific response content

        // Verify that the saveUser method in the userService was called once
        verify(userService, times(1)).saveUser(any(Driver.class));

        // If the sendMessage method in messageService is uncommented, you can also verify its call
        // verify(messageService, times(1)).sendMessage(any(Driver.class));
    }
}
