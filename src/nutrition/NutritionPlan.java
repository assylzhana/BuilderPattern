package nutrition;

import java.util.List;

class NutritionPlan {
    private int dailyCaloricIntake;
    private double carbohydratesRatio;
    private double proteinsRatio;
    private double fatsRatio;
    private List<String> mealPlans;
    private String fitnessGoal;
    private List<String> dietaryRestrictions;

    public NutritionPlan(int dailyCaloricIntake, double carbohydratesRatio, double proteinsRatio, double fatsRatio,
                         List<String> mealPlans, String fitnessGoal, List<String> dietaryRestrictions) {
        this.dailyCaloricIntake = dailyCaloricIntake;
        this.carbohydratesRatio = carbohydratesRatio;
        this.proteinsRatio = proteinsRatio;
        this.fatsRatio = fatsRatio;
        this.mealPlans = mealPlans;
        this.fitnessGoal = fitnessGoal;
        this.dietaryRestrictions = dietaryRestrictions;
    }

    public NutritionPlan() {
    }

    public List<String> getDietaryRestrictions() {
        return dietaryRestrictions;
    }

    public void setDietaryRestrictions(List<String> dietaryRestrictions) {
        this.dietaryRestrictions = dietaryRestrictions;
    }

    public int getDailyCaloricIntake() {
        return dailyCaloricIntake;
    }

    public void setDailyCaloricIntake(int dailyCaloricIntake) {
        this.dailyCaloricIntake = dailyCaloricIntake;
    }

    public double getCarbohydratesRatio() {
        return carbohydratesRatio;
    }

    public void setCarbohydratesRatio(double carbohydratesRatio) {
        this.carbohydratesRatio = carbohydratesRatio;
    }

    public double getFatsRatio() {
        return fatsRatio;
    }

    public void setFatsRatio(double fatsRatio) {
        this.fatsRatio = fatsRatio;
    }

    public String getFitnessGoal() {
        return fitnessGoal;
    }

    public void setFitnessGoal(String fitnessGoal) {
        this.fitnessGoal = fitnessGoal;
    }

    public List<String> getMealPlans() {
        return mealPlans;
    }

    public void setMealPlans(List<String> mealPlans) {
        this.mealPlans = mealPlans;
    }

    public double getProteinsRatio() {
        return proteinsRatio;
    }

    public void setProteinsRatio(double proteinsRatio) {
        this.proteinsRatio = proteinsRatio;
    }
}