package Bread;

public class SourdoughBread extends Bread{
    //Special class for the sourdough bread
    private double sourdoughBreadStarter;
//no argument constructor
    public SourdoughBread(double flour, double water, double salt, double sugar, double yeast, String type, String recipe, boolean state,double sourdoughBreadStarter){
       //variables from the bread superclass
        super(flour, water, salt, sugar, yeast, type, recipe, state);
        this.sourdoughBreadStarter = sourdoughBreadStarter;
    }
//getters and setters for the sourdough bread starter
    public double getSourdoughBreadStarter() {
        return sourdoughBreadStarter;
    }

    public void setSourdoughBreadStarter(double sourdoughBreadStarter) {
        this.sourdoughBreadStarter = sourdoughBreadStarter;
    }
// The recipe method for the sourdough bread
    public String getRecipe(){
        return ("The recipe for a sourdough bread: \n"
        + "1: Mix flour, water, salt, baking powder, yeast, and ripe sourdough starter.\n"
        + "2: Make the dough.\n"
        + "3: Bulk rise.\n"
        + "4: Stretch and fold the dough.\n"
        + "5: Cut and shape the dough.\n"
        + "6: Second rise and preheat the oven to 450 F towards the tail end of the second rise.\n"
        + "7: Spray the loaf with luke warm water.\n"
        + "8: Bake the bread at 400 F for 20 minutes, until deep golden brown.\n"
        + "9: Remove the bread from the oven.\n"
        + "10. Let the bread cool until good to eat.");
    }
    // The ingredient methodd for the sourdough bread
    public String getIngredients(){
        return("The ingredients for the Sourdough Bread: \n"+ super.getIngredients() + sourdoughBreadStarter + " cup of ripe sourdough starter");
    }
}
