package part1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        NutritionPlanDirector director = new NutritionPlanDirector();
        NutritionPlanBuilder builder = new WeightLossNutritionPlanBuilder();

        builder.set_caloric_intake(2000);
        builder.set_macronutrient_ratios(40, 30, 30);
        builder.set_meal_plans(List.of("Breakfast: Oatmeal, Lunch: Chicken Salad, Dinner: Grilled Fish"));
        builder.set_fitness_goal("weight loss");
        builder.set_dietary_restrictions(List.of("gluten-free", "lactose-free"));

        director.set_builder(builder);
        director.create_nutrition_plan();

        NutritionPlan weightLossPlan = builder.build();


        System.out.println("Nutrition Plan for Weight Loss:");
        System.out.println("Caloric Intake: " + weightLossPlan.get_daily_caloric_intake());
        System.out.println("Carbohydrate Ratio: " + weightLossPlan.get_carbohydrates() + "%");
        System.out.println("Protein Ratio: " + weightLossPlan.get_proteins() + "%");
        System.out.println("Fat Ratio: " + weightLossPlan.get_fats() + "%");
        System.out.println("Meal Plans: " + weightLossPlan.get_meal_plans());
        System.out.println("Fitness Goal: " + weightLossPlan.get_fitness_goal());
        System.out.println("Dietary Restrictions: " + weightLossPlan.get_dietary_restrictions());
    }
}
