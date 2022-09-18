package Bread;

public class baguette extends Bread{
    //Special variables for the baguette
    private double cookingSpray;
    private double cornmeal;
    //no argument constructor
    public baguette(double flour, double water, double salt, double sugar, double yeast, String type, String recipe, boolean state,double cookingSpray, double cornmeal){
        //variables from the bread superclass
        super(flour, water, salt, sugar, yeast, type, recipe, state);
        this.cookingSpray = cookingSpray;
        this.cornmeal = cornmeal;
    }
    //getters and setters for the cooking spray
    public double getCookingSpray() {
        return cookingSpray;
    }

    public void setCookingSpray(double cookingSpray) {
        this.cookingSpray = cookingSpray;
    }
    //getters and setters for cornmeal
    public double getCornmeal() {
        return cornmeal;
    }

    public void setCornmeal(double cornmeal) {
        this.cornmeal = cornmeal;
    }
    // The recipe method for the baguette
    public String getRecipe(){
        return("The recipe for a baguette: \n"
        + "1: Dissolve yeast in warm water in a large bowl; let stand 5 minutes. Lightly spoon flour into dry measuring cups; level with a knife. Add 2 3/4 cups flour to yeast mixture; stir until a soft dough forms. Cover and let stand 15 minutes. Turn dough out onto a lightly floured surface; sprinkle evenly with salt. Knead until the salt is incorporated and the dough is smooth and elastic (about 6 minutes); add enough of remaining flour, 1 tablespoon at a time, to prevent dough from sticking to hands (dough will feel slightly sticky).\n"
        + "2: Place dough in large bowl coated with cooking spray, turning to coat top. Cover and let rise in warm place (85°), 40 minutes or until doubled in size. (Gently press two fingers into dough. If an indentation remains, the dough has risen enough.) Punch dough down; cover and let rest 5 minutes. Divide in half. Working with 1 portion at a time (cover remaining dough to prevent drying), roll each portion on a floured surface into 12-inch rope, slightly tapered at ends. Place ropes on large baking sheet sprinkled with cornmeal. Lightly coat dough with cooking spray, and cover; let rise 20 minutes or until doubled in size.\n"
        + "3:Preheat the oven to 450 degrees Fahrenheit\n"
        + "4: Uncover the dough. Cut 3 (1/4-inch-deep) diagonal slits across top of each loaf. Bake at 450° for 20 minutes or until browned on bottom and sounds hollow when tapped.\n");
    }
// The ingredient method for the baguette
    public String getIngredients(){
        return("The ingredients for a baguette: \n" + cookingSpray + " spray of cooking spray in the bowl\n" + cornmeal + " tps of cornmeal"+ super.getIngredients());
    }
}
