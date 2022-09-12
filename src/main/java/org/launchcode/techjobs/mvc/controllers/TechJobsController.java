package org.launchcode.techjobs.mvc.controllers;

import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;

/*
 * By kqrpnb
 */
public class TechJobsController {

    private static HashMap<String, String> actionChoices = new HashMap<>();

    public TechJobsController() {

        actionChoices.put("search", "Search");
        actionChoices.put("list", "List");

    }

    @ModelAttribute("actions")
    public static HashMap<String, String> getActionChoices() {
        return actionChoices;
    }

}
