package part1;

import java.util.List;

public abstract class NutritionPlanBuilder {
    protected NutritionPlan nutritionPlan;

    public abstract void set_caloric_intake(int caloricIntake);

    public abstract void set_macronutrient_ratios(int carbohydrates, int proteins, int fats);

    public abstract void set_meal_plans(List<String> mealPlans);

    public abstract void set_fitness_goal(String fitnessGoal);
    public NutritionPlan build() {
        return nutritionPlan;
    }
    public abstract void set_dietary_restrictions(List<String> dietaryRestrictions);

}