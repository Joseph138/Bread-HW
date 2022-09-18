package Bread;

public class muffin extends Bread{
    //muffin's special variables
    private String fruits;
    private double fruitNum;
    private double milk;
    private double vanillaExtract;

//no argument constructor
    public muffin(double flour, double water, double salt, double sugar, double yeast, String type, String recipe, boolean state,String fruits, double
                  fruitNum, double milk, double vanillaExtract){
        //Variables from the bread superclass
        super(flour,water,salt,sugar,yeast,type,recipe,state);
        this.fruits = fruits;
        this.fruitNum = fruitNum;
        this.milk = milk;
        this.vanillaExtract = vanillaExtract;

    }
    //getters and setters for fruits
    public String getFruits() {
        return fruits;
    }

    public void setFruits(String fruits) {
        this.fruits = fruits;
    }
    //getters and setters for fruit numbers
    public double getFruitNum() {
        return fruitNum;
    }

    public void setFruitNum(double fruitNum) {
        this.fruitNum = fruitNum;
    }
    //getters and setters for milk
    public double getMilk() {
        return milk;
    }

    public void setMilk(double milk) {
        this.milk = milk;
    }
    //getters and setters for vanilla extract
    public double getVanillaExtract() {
        return vanillaExtract;
    }

    public void setVanillaExtract(double vanillaExtract) {
        this.vanillaExtract = vanillaExtract;
    }
    //The method the recipe of muffin
    public String getRecipe(){
        return("The recipe for muffin: \n" + "1: Preheat the oven to 375\n"+
                "2: Add the eggs, one at a time, beating well after each addition. Add vanilla.\n"
                + "3: Sift together the flour, salt and baking powder, and add to the creamed mixture alternately with the milk.\n"
        + "4: Crush ½ cup blueberries with a fork, and mix into the batter. Fold in the remaining whole berries.\n" + "5: Line a 12 cup standard muffin tin with cupcake liners, and fill with batter. Sprinkle the 3 teaspoons sugar over the tops of the muffins, and bake at 375 degrees for about 30-35 minutes.\n"
        +"6: Remove muffins from tin and cool at least 30 minutes. Store, uncovered, or the muffins will be too moist the second day, if they last that long.");
    }

    @Override
    //The ingredients by size for muffin
    public String getIngredients() {
        return  "The ingredients of a blueberry muffin: \n"+ "Fruit: " + fruits + "\nFruit number: " + fruitNum +"\n"+milk + " cups of milk\n" + vanillaExtract + " cup of vanilla extract\n" + super.getIngredients();
    }
}
