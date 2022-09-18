package Bread;

public class BreadTester {
    public static void main(String[] args) {
        //Putting the variables from the muffin class
        Bread b2 = new muffin(0.5, 2, 0.25 , 2, 0,"Blueberry muffin", "muffin", false,"Blueberry", 5.0
        , 1.5, 0.75);
        //Printing the ingredients and recipe
        System.out.println(b2.getIngredients());
        System.out.println(b2.getRecipe());
        //Printing out the bake state of the muffin
        b2.bakeState(b2.getState());
        //Same thing from here on out
        Bread b3 = new pastry(1.75, 0.5, 1.75, 2.00, 0 , "pastry", "pastry", true,1);
        b3.getIngredients();
        System.out.println(b3.getIngredients());
        System.out.println(b3.getRecipe());
        b3.bakeState(b3.getState());

        Bread b4 = new doughnut(0,0,0.5,0.33,1.00,"Doughnut", "glazed doughnut", false, 1.00, 2,
                1, 0.25);
        System.out.println(b4.getIngredients());
        System.out.println(b4.getRecipe());
        b4.bakeState(b4.getState());

        Bread b5 = new baguette(3.00, 1.25, 1.00 , 0.00, 2.25, "baguette", "baguette", true, 1, 1);
        //Changing the value of the water by the setter method
        b5.setWater(1.15);
        System.out.println(b5.getIngredients());
        System.out.println(b5.getRecipe());
        b5.bakeState(b5.getState());


        Bread b6 = new SourdoughBread(5.00,1.50,2.50,0.00,1.00,"Sourdough", "sour", false,1.00);
        System.out.println(b6.getIngredients());
        System.out.println(b6.getRecipe());
        b6.bakeState(b6.getState());
    }
}
