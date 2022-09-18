package Bread;

public class doughnut extends Bread{
    //Special variables for the doughnut
    private double milk;
    private double eggs;
    private double vanillaExtract;
    private double nutmeg;
    //no argument constructor
    public doughnut(double flour, double water, double salt, double sugar, double yeast, String type, String recipe, boolean state, double milk, double eggs,
                    double vanillaExtract, double nutmeg) {
        //Variables from the bread superclass
        super(flour, water, salt, sugar, yeast, type, recipe, state);
        this.milk = milk;
        this.eggs = eggs;
        this.vanillaExtract = vanillaExtract;
        this.nutmeg = nutmeg;
    }
    // getters and setters method for milk
    public double getMilk() {
        return milk;
    }

    public void setMilk(double milk) {
        this.milk = milk;
    }
    //getters and setters for eggs
    public double getEggs() {
        return eggs;
    }

    public void setEggs(double eggs) {
        this.eggs = eggs;
    }
    //getters and setters for vanilla extract
    public double getVanillaExtract() {
        return vanillaExtract;
    }

    public void setVanillaExtract(double vanillaExtract) {
        this.vanillaExtract = vanillaExtract;
    }
// getters and setters for nutmeg
    public double getNutmeg() {
        return nutmeg;
    }

    public void setNutmeg(double nutmeg) {
        this.nutmeg = nutmeg;
    }
    // The recipe method for the doughnut
    public String getRecipe(){
        return ("The recipe for doughnut: \n" +"1: Prepare the dough. The dough comes together with a mixer. You can also make the dough by hand, but it requires a bit of arm muscle. After the dough comes together in the mixing bowl, knead it for 2 minutes.\n"
        + "2: Let the dough rise. In a relatively warm environment, the dough rises in about 90 minutes.\n"
        + "3: Punch down the dough to release the air.\n"
        +"4: Roll & cut into doughnuts. Roll the dough out to 1/2 inch thickness. Cut the doughnuts using a 3-3.5 inch doughnut cutter. Line 1-2 baking sheets with parchment paper or a silicone baking mat. Place doughnuts (and doughnut holes!) onto the lined baking sheet, then lightly cover and allow to rest as you prepare the oil.\n"
        + "5: Prepare the oil. Using a heavy-duty pot and an oil thermometer, heat the oil to 375°F (191°C). Place a cooling rack over another baking sheet.\n"
        + "6: Fry the doughnuts. Working with 2-3 doughnuts at a time, cook for 1 minute on each side. Carefully remove from the oil and place onto prepared rack. Repeat with remaining doughnuts. (See my recipe note about making the doughnut holes.)\n"
        +"7: Make the glaze. Dip each warm doughnut into the glaze and coat both sides. After about 20 minutes, the glaze will set.");
    }
    // The ingredient method for the doughnut
    public String getIngredients(){
        return "The ingredients of a doughnut: \n"+ milk + " cup of milk\n" + eggs + " large eggs\n" + vanillaExtract + " tps of vanilla extract\n" + nutmeg + " tps of nutmeg\n" + super.getIngredients();
    }
}
