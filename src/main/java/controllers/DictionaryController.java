package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @GetMapping("/dictionary")
    public String index() {
        return "dictionary";
    }

    @PostMapping("/translated")
    public String translate(@RequestParam String search, Model model) {
        String translate;
        switch (search) {
            case "":
                translate = "Please insert the words!";
                break;
            case "hello":
                translate = "xin chao";
                break;
            case "good morning":
                translate = "chao buoi sang";
                break;
            case "book":
                translate = "quyen sach";
                break;
            case "sales department":
                translate = "phong kinh doanh";
                break;
            case "purchasing department":
                translate = "phong mua ban";
                break;
            default:
                translate = "Can not translate!";
        }
        model.addAttribute("translated", translate);
        return "translated";
    }
}