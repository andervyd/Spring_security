package by.andervyd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping("/")
    public String getInfoForAllEmployees() {
        return "all_employees";
    }

    @GetMapping("/hr_info")
    public String getInfoForHR() {
        return "all_HR";
    }

    @GetMapping("/manager_info")
    public String getInfoForManager() {
        return "all_managers";
    }
}
