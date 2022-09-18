package Bread;

public class pastry extends Bread{
    //Special variables for pastry
    private int butter;
    //no argument constructor method
    public pastry(double flour, double water, double salt, double sugar, double yeast, String type, String recipe, boolean state, int butter){
        //extract from the bread superclass
        super(flour, water, salt, sugar, yeast, type, recipe, state);
        this.butter = butter;
    }
    //getters and setters for the butter
    public int getButter() {
        return butter;
    }

    public void setButter(int butter) {
        this.butter = butter;
    }
    //The recipe method for the pastry
    public String getRecipe(){
        return ("The recipe of pastry is : \n" +"1: Mix the sieved flour and salt in a bowl. (add sugar if using)\n" + "2: Weigh out the butter and divide into 4 amounts.\n" + "3: Add one portion of the butter to the flour and using a round-bladed knife, incorporate the butter and flour, whilst slowly adding enough cold water until the mixture comes together to form an elastic dough.\n"
        + "4: Dust the rolling surface with flour, and turn the dough out. Roll out the dough into a rectangle shape (see photo) and keep rolling, adding more flour if necessary to stop from sticking, until the dough is about 4 mm thickness.\n"
        + "5: Rub any excess flour from the surface and using the next portion of butter, dot the butter (about 1 cm dots) on two-thirds of the rolled out pastry evenly.\n"
        + "6: Fold the pastry into three portions, bringing the end without butter to the center, then folding down the other third.\n"
        + "7: Press together pastry edges with your fingers, give the pastry half a turn and roll out lightly again until the pastry is 4 mm thick (same size before you dotted with butter)\n"
        + "8: Repeat steps 5 - 7 twice more, then fold into three, cover with plastic wrap and chill in the fridge for 30 minutes.\n"
        + "9: set the oven to 400f and cook for about 20-35 minutes.");
    }
    //The ingredient method for the pastry
    public String getIngredients(){
        return "The ingredients of pastry: \n"+ butter + " tps of butter \n"+ super.getIngredients();
    }
}
