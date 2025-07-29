package com.dravyn.aiagent.service;

import com.dravyn.aiagent.model.AgentTaskRequest;
import com.dravyn.aiagent.model.AgentTaskResponse;
import org.springframework.stereotype.Service;

@Service
public class AgentService {

    public AgentTaskResponse processTask(AgentTaskRequest request) {
        String task = request.getTask().toLowerCase();
        String input = request.getInput();

        String result;
        String status = "success";

        switch (task) {
            case "greet":
                result = "Hello, Agent here! 🤖";
                break;
            case "echo":
                result = "You said: " + input;
                break;
            case "uppercase":
                result = input.toUpperCase();
                break;
            default:
                result = "Unknown task: " + task;
                status = "failed";
        }

        AgentTaskResponse response = new AgentTaskResponse();
        response.setTask(task);
        response.setOutput(result);
        response.setStatus(status);

        return response;
    }
}
