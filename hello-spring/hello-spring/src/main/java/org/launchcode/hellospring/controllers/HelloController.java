package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Chris Bay
 */
@Controller
public class HelloController {

        // Handle request at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye() {
        return "Goodbye, Spring!";
    }

    // Handles requests of the form /hello?name=LaunchCode
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
    @ResponseBody
    public String helloWithQueryParam(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

    // Handles requests of the form /hello/LaunchCode
    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloWithPathParam(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("form")
    @ResponseBody
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action = 'hello' method = 'post'>" + // submit a request to /hello
                "<input type = 'text' name = 'name' >" +
                "<input type = 'submit' value = 'Greet Me!' >" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("langForm")
    @ResponseBody
    public String langForm() {
        return "<html>" +
                "<body>" +
                "<form action = 'hello' method = 'get'>" +
                "<input type = 'text' name = 'name' >" +
                "<select name 'choice'>" +
                "<option value='first'>English</option>" +
                "<option value='second'>Russian</option>" +
                "<option value='third'>Spanish</option>" +
                "<option value='four'>French</option>" +
                "<option value='five'>Mandarin Chinese</option>" +
                "</select>" +
                "<input type = 'submit' value = 'Greet Me!' >" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(value="hello", method = RequestMethod.POST)
    @ResponseBody
    public String helloPost(@RequestParam String name, @RequestParam String language) {
        if (name == null) {
            name = "World";
        }
        return createMessage(name, language);
    }

    public static String createMessage(String n, String l) {
        String greeting = "";

        if (l.equals("English")) {
            greeting = "Hello";
        }
        else if (l.equals("Russian")){
            greeting = "Zdravstvuyte";
        }
        else if (l.equals("Spanish")){
            greeting = "Hola";
        }
        else if (l.equals("French")) {
            greeting = "Bonjour";
        }
        else if (l.equals("Mandarin Chinese")) {
            greeting = "Ni Hao";
        }
        return greeting + " " + n;
    }


}