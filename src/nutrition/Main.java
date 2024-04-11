package nutrition;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        NutritionPlanDirector director = new NutritionPlanDirector(new WeightLossNutritionPlanBuilder());
        NutritionPlan plan = director.constructPlan(1800, 50, 30, 20, null, "weight loss", List.of("vegan"));
        System.out.println("Nutrition Plan:");
        System.out.println("Daily Caloric Intake: " + plan.getDailyCaloricIntake());
        System.out.println("Carbohydrates Ratio: " + plan.getCarbohydratesRatio());
        System.out.println("Proteins Ratio: " + plan.getProteinsRatio());
        System.out.println("Fats Ratio: " + plan.getFatsRatio());
        System.out.println("Meal Plans: " + plan.getMealPlans());
        System.out.println("Fitness Goal: " + plan.getFitnessGoal());
        System.out.println("Dietary Restrictions: " + plan.getDietaryRestrictions());
    }
}