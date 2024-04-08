package part1;

import java.util.List;

public class NutritionPlan {
    private final int daily_caloric_intake;
    private final int carbohydrates;
    private final int proteins;
    private final int fats;
    private final List<String> meal_plans;
    private final String fitness_goal;
    private final List<String> dietary_restrictions;



    public NutritionPlan (int daily_caloric_intake,
                         int carbohydrates, int proteins, int fats,
                         List<String> meal_plans,
                         String fitness_goal,
                         List<String> dietary_restrictions)
    {
        this.daily_caloric_intake = daily_caloric_intake;
        this.carbohydrates = carbohydrates;
        this.proteins = proteins;
        this.fats = fats;
        this.meal_plans = meal_plans;
        this.fitness_goal = fitness_goal;
        this.dietary_restrictions = dietary_restrictions;
    }
    public int get_daily_caloric_intake() {return daily_caloric_intake;}
    public int get_carbohydrates() {return carbohydrates;}
    public int get_proteins() {return proteins;}
    public int get_fats() {return fats;}
    public List<String> get_meal_plans() {return meal_plans;}
    public String get_fitness_goal() {return fitness_goal;}
    public List<String> get_dietary_restrictions() {return dietary_restrictions;}
}



class NutritionPlanDirector {
    private NutritionPlanBuilder builder;

    public void set_builder(NutritionPlanBuilder builder) {
        this.builder = builder;
    }

    public void create_nutrition_plan() {
        builder.build();
    }
}
