package nutrition;

import nutrition.NutritionPlan;
import nutrition.NutritionPlanBuilder;

import java.util.List;

class NutritionPlanDirector {
    private NutritionPlanBuilder builder;

    public NutritionPlanDirector(NutritionPlanBuilder builder) {
        this.builder = builder;
    }

    public NutritionPlan constructPlan(int dailyCaloricIntake, double carbohydratesRatio, double proteinsRatio,
                                       double fatsRatio, List<String> mealPlans, String fitnessGoal,
                                       List<String> dietaryRestrictions) {
        builder.setDailyCaloricIntake(dailyCaloricIntake);
        builder.setMacronutrientRatios(carbohydratesRatio, proteinsRatio, fatsRatio);
        builder.setMealPlans(mealPlans);
        builder.setFitnessGoal(fitnessGoal);
        builder.setDietaryRestrictions(dietaryRestrictions);
        return builder.build();
    }
}