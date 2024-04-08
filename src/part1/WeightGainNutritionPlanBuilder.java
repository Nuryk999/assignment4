package part1;

import java.util.List;

public class WeightGainNutritionPlanBuilder extends NutritionPlanBuilder {
    @Override
    public void set_caloric_intake(int caloricIntake) {
        nutritionPlan = new NutritionPlan(caloricIntake, 40, 30, 30, null, "weight gain", null);
    }

    @Override
    public void set_macronutrient_ratios(int carbohydrates, int proteins, int fats) {
        nutritionPlan = new NutritionPlan(nutritionPlan.get_daily_caloric_intake(),
                carbohydrates, proteins, fats, null, "weight gain", null);
    }

    @Override
    public void set_meal_plans(List<String> mealPlans) {
        nutritionPlan = new NutritionPlan(nutritionPlan.get_daily_caloric_intake(),
                nutritionPlan.get_carbohydrates(),
                nutritionPlan.get_proteins(),
                nutritionPlan.get_fats(),
                mealPlans, "weight gain", null);
    }

    @Override
    public void set_fitness_goal(String fitnessGoal) {
        nutritionPlan = new NutritionPlan(nutritionPlan.get_daily_caloric_intake(),
                nutritionPlan.get_carbohydrates(),
                nutritionPlan.get_proteins(),
                nutritionPlan.get_fats(),
                nutritionPlan.get_meal_plans(), "weight gain", null);
    }

    @Override
    public void set_dietary_restrictions(List<String> dietaryRestrictions) {
        nutritionPlan = new NutritionPlan(nutritionPlan.get_daily_caloric_intake(),
                nutritionPlan.get_carbohydrates(),
                nutritionPlan.get_proteins(),
                nutritionPlan.get_fats(),
                nutritionPlan.get_meal_plans(),
                "weight gain",
                dietaryRestrictions);
    }

    @Override
    public NutritionPlan build() {
        return nutritionPlan;
    }
}

