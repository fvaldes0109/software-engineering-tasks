package com.example.si_tasks.excersises.day2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest
public class StudentNameTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testStudentName() throws Exception {
        
        mockMvc.perform(get("/v1/student/name"))
            .andExpect(status().isOk())
            .andExpect(content().string("Fernando"));

        mockMvc.perform(get("/v1/student/name?formal=true"))
            .andExpect(status().isOk())
            .andExpect(content().string("Fernando Valdes Garcia"));
    }
}
