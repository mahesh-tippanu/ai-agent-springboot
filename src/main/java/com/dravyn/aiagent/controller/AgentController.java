package com.dravyn.aiagent.controller;

import com.dravyn.aiagent.model.AgentTaskRequest;
import com.dravyn.aiagent.model.AgentTaskResponse;
import com.dravyn.aiagent.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/agent")
public class AgentController {
        @GetMapping("/api/agent")
        public String hello() {
            return "Hello from Spring Boot!";
        }
    }

