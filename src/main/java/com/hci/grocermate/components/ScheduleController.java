package com.hci.grocermate.components;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/schedules")
public class ScheduleController {

    @GetMapping
    public Map<String, Object> getSchedule() {
        // Sample schedule data
        List<Map<String, Object>> tasks = Arrays.asList(
            new HashMap<String, Object>() {{
                put("id", 1);
                put("title", "Meeting with Manager");
            }},
            new HashMap<String, Object>() {{
                put("id", 2);
                put("title", "Need to meet Sam");
            }}
        );

        Map<String, Object> response = new HashMap<>();
        response.put("date", "2021-04-07");
        response.put("tasks", tasks);

        return response;
    }
}