package nutrition;

import nutrition.NutritionPlan;
import nutrition.NutritionPlanBuilder;

import java.util.List;

class WeightLossNutritionPlanBuilder implements NutritionPlanBuilder {
    private NutritionPlan nutritionPlan;

    public WeightLossNutritionPlanBuilder() {
        this.nutritionPlan = new NutritionPlan(0, 0.0, 0.0, 0.0, null, "weight loss", null);
    }

    @Override
    public void setDailyCaloricIntake(int dailyCaloricIntake) {
        nutritionPlan.setDailyCaloricIntake(dailyCaloricIntake);
    }

    @Override
    public void setMacronutrientRatios(double carbohydratesRatio, double proteinsRatio, double fatsRatio) {
        nutritionPlan.setCarbohydratesRatio(carbohydratesRatio);
        nutritionPlan.setProteinsRatio(proteinsRatio);
        nutritionPlan.setFatsRatio(fatsRatio);
    }


    @Override
    public void setMealPlans(List<String> mealPlans) {
        nutritionPlan.setMealPlans(mealPlans);
    }

    @Override
    public void setFitnessGoal(String fitnessGoal) {
        nutritionPlan.setFitnessGoal(fitnessGoal);
    }

    @Override
    public void setDietaryRestrictions(List<String> dietaryRestrictions) {
        nutritionPlan.setDietaryRestrictions(dietaryRestrictions);
    }

    @Override
    public NutritionPlan build() {
        return nutritionPlan;
    }
}