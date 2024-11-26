package edu.uptc.swii.final_challenge.order.infrastructure;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class OrderController {
    @PostMapping("/createorder")
    public String createOrder(@RequestBody String entity) {
        //TODO: process POST request
        return entity;
    }
    @PostMapping("/updateorderstatus")
    public String updateOrder(@RequestBody String entity) {
        //TODO: process POST request
        return entity;
    }
    @GetMapping("/findorderbycustomerid")
    public String getMethodName(@RequestParam String param) {
        //TODO
        return new String();
    }
    

    
}
