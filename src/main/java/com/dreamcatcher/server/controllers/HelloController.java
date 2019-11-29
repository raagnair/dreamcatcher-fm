package com.dreamcatcher.server.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping({"/hello"})
    public String hello(Model model, @RequestParam(value = "name", required = false, defaultValue = "World") String name) {
        HelloObject obj = new HelloObject("raag", "nair");
        HelloObject obj2 = new HelloObject("second", "object");
        obj.nextObject = obj2;
        model.addAttribute("name", name);
        model.addAttribute("obj", obj);
        return "hello";
    }

    public static class HelloObject {
        public String firstName;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public HelloObject getNextObject() {
            return nextObject;
        }

        public void setNextObject(HelloObject nextObject) {
            this.nextObject = nextObject;
        }

        public String lastName;
        public HelloObject nextObject;

        public HelloObject(String f, String l) {
            this.firstName = f;
            this.lastName = l;
            this.nextObject = null;
        }
    }
}


