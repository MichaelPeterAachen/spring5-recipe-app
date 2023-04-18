package guru.springframework.controllers;

import guru.springframework.model.Category;
import guru.springframework.model.Recipe;
import guru.springframework.model.UnitOfMeasure;
import guru.springframework.repositories.CategoryRepository;
import guru.springframework.repositories.RecipeRepository;
import guru.springframework.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by jt on 6/1/17.
 */
@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    private RecipeRepository recipeRepository;

    public IndexController(final CategoryRepository categoryRepository, final UnitOfMeasureRepository unitOfMeasureRepository, final RecipeRepository recipeRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
        this.recipeRepository = recipeRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model) {

        Optional<Category> categoryOpt = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOpt = unitOfMeasureRepository.findByDescription("Cup");

        categoryOpt.ifPresent(value -> {
            System.out.println("Cat:" + value.getId());
        });

        unitOpt.ifPresent(value -> {
            System.out.println("Unit:" + value.getId());
        });

        Iterable<Recipe> allRecipes = recipeRepository.findAll();
        List<Recipe> list = new ArrayList<Recipe>();
        list.add (new Recipe(1L,"Test1"));
        list.add (new Recipe(2L,"Test2"));
        list.add (new Recipe(3L,"Test3"));
        model.addAttribute("recipes", allRecipes);
        return "index";
    }
}
