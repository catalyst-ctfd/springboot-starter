package com.redhat.developers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import java.util.Base64;

@RestController
@Slf4j
public class GreeterController {


    @GetMapping("/")
    public String greet(HttpServletRequest request) {
        // Get the hostname from the request
        String hostname = request.getServerName();
        String response = null;
        String hello = "SEVMTE9fV09STEQ=";
        String aloha = "QUxPSEFfR1JFRVRJTkc="

        if (hostname.contains("aloha")) 
            response = new String(Base64.getDecoder().decode(aloha));
        else
            response = new String(Base64.getDecoder().decode(hello));
        
        return response;
    }
}
