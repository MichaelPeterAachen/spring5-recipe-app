package guru.springframework.bootstrap;

import guru.springframework.model.Recipe;
import guru.springframework.repositories.RecipeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RecipeBootstrap implements CommandLineRunner {
    private RecipeRepository recipeRepository;

    public RecipeBootstrap(final RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Recipe recipe = new Recipe();
        recipe.setName("Another cool recipe");
        recipeRepository.save(recipe);
    }
}

