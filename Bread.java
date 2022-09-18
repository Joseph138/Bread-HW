package Bread;
import java.util.Scanner;
public class Bread {
    private double flour;
    private double water;
    private double salt;
    private double sugar;
    private double yeast;
    private String type;
    private String recipe;
    private boolean state;
    public Bread(double flour, double water, double salt, double sugar, double yeast, String type, String recipe, boolean state){
        this.flour = flour;
        this.water = water;
        this.salt = salt;
        this.sugar = sugar;
        this.yeast = yeast;
        this.type = type;
        this.recipe = recipe;
        this.state = state;
    }
    //getters and setters for flour
    public double getFlour(){
        return flour;
    }
    public void setFlour(double flour){
        this.flour = flour;
    }
    //getters and setters for water
    public double getWater(){
        return water;
    }
    public void setWater(double water){
        this.water = water;
    }
    //getters and setters for salt
    public double getSalt(){
        return salt;
    }
    public void setSalt(){
        this.salt = salt;
    }
    //getters and setters for sugar
    public double getSugar(){
        return sugar;
    }
    public void setSugar(double sugar){
        this.sugar = sugar;
    }
    //getters and setters for yeast
    public double getYeast(){
        return yeast;
    }
    public void setYeast(double yeast){
        this.yeast = yeast;
    }
    //getters and setters for type
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    //getters and setters for recipe
    public String getRecipe(){
        return recipe;
    }
    public void setRecipe(String recipe){
        this.recipe = recipe;
    }
    //getters and setters for state of bread
    public boolean getState(){
        return state;
    }
    public void setState(boolean state){
        this.state = state;
    }

    public void bakeState(boolean state){
        if (state == true){
            System.out.println("The bread is cooked");
        }
        else{
            System.out.println("The bread isn't cooked");
            System.out.println("The bread is now cooked");
        }
    }
    public String getIngredients(){
        return (flour + " cups of flour\n" + water + " cups of water\n" + salt + " tsps of salt\n" + yeast + " tsps of yeast");
    }

    @Override
    public String toString(){
        return "cups of flour: " + flour + "\n" + "cups of water: " + water + "\n" + "tablespoons of salt: " + salt + "\n" + "tablespoons of yeast: " + yeast + "\n" +"cups of sugar: " + sugar + "\n"
                + "type of bread: " + type + "\n" + "recipe: " + recipe + "\n" + "cooked or not cooked: " + state;
    }
}
