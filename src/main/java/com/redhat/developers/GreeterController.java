package com.redhat.developers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;

@RestController
@Slf4j
public class GreeterController {


    @GetMapping("/")
    public String greet(HttpServletRequest request) {
        // Get the hostname from the request
        String hostname = request.getServerName();
        String response = null;

        if (hostname.contains("aloha")) {
            response = "ALOHA_GREETING";
        else
            response = "HELLO_WORLD";
        
        return response;
    }
}
