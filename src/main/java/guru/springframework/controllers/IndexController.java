package guru.springframework.controllers;

import guru.springframework.model.Recipe;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jt on 6/1/17.
 */
@Controller
public class IndexController {

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model) {
        List<Recipe> list = new ArrayList<Recipe>();
        list.add (new Recipe("1","Test1"));
        list.add (new Recipe("2","Test2"));
        list.add (new Recipe("3","Test3"));
        model.addAttribute("recipes", list);
        return "index";
    }
}
