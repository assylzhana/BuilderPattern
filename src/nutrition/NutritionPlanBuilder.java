package nutrition;

import nutrition.NutritionPlan;

import java.util.List;

// Builder interface
interface NutritionPlanBuilder {
    void setDailyCaloricIntake(int dailyCaloricIntake);
    void setMacronutrientRatios(double carbohydratesRatio, double proteinsRatio, double fatsRatio);
    void setMealPlans(List<String> mealPlans);
    void setFitnessGoal(String fitnessGoal);
    void setDietaryRestrictions(List<String> dietaryRestrictions);
    NutritionPlan build();
}