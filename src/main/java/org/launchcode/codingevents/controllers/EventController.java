package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Chris Bay
 */
@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping
    public String displayAllEvents(Model model) {
        HashMap<String, String> events = new HashMap<>();
        events.put("Code With Pride", "LGBTQ Coding Event");
        events.put("Strange Loop", "Learning how to iterate with code");
        events.put("Apple WWDC", "Apple World Wide Dev Conference" );
        events.put("Tester Event", "Description of Event");

        String address ="1 Holmes St. KC, MO 64111";

        model.addAttribute("events", events);
        model.addAttribute("eventKeys", events.keySet());
        model.addAttribute("eventValues", events.values());
        model.addAttribute("address", address);
        return "events/index";
    }

}
