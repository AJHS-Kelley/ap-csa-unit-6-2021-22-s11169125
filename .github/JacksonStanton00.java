// Challah Byard, Arrays Practice, v0.3, 01/28/22

public class JacksonStanton00 {

    public static void main(String[] args) {

        int[] myGrades = {100, 25, 15, -3, 0, 75, 35};
        double[] myBankAccount = {0.0, -1.25, 3.75, 456.99, 25.25, 12.123456, 3.14};
        String[] carArr = {"BMW", "Ferrari 250 GTO", "Porshe 911", "Ford F150 Lighting", "Buick Skylark"};
        /*
        for (current_element = 0; current_element < carArr.length(); current_element += 1) {
            // code to execute
            //Statement 1 is execute ONCE BEFORE THE LOOP.
            //Statment 2 is the CODITIONAL for the loop.
            //Statement 3 is executed EACH TIME THE LOOP RUNS.
             
        }
         */
        

        for (int i = 0; i < carArr.length; i++) {
            // System.out.println(i);
            // System.out.println(carArr[i]);<-----

            if (carArr[i].length() % 2 == 0) {
            System.out.println(carArr[i]);
            System.out.println("This string has an even length.");
        } else {
            System.out.println(carArr[i]);
            System.out.println("This string has an even length."); 
        }

    }




    /*
    
        
        System.out.println(carArr[3]);
        // ONCE CREATED YOU CANNOT CHANGE THE SIZE OD AN ARRAY. IT IS FORBIDDEN!
        // Enhanced For Loop
        carArr[0] = "Volkswagen Passat"; 
        for (String eachElement : carArr) {
            // Code to execute.
            System.out.println(eachElement);
         for (double eachElement1 : myBankAccount) {
             // code to execute
             System.out.println(eachElement1);
    
        for (int eachElement2 : myGrades) {
            // code to execute
            System.out.println(eachElement2);
        
        }
    }
}

     */

    // 2D Arrays 

    int[][] twoDIntArr = {{-2,3,8,0},{5,2,17,-6}};

    System.out.println(twoDIntArr[0][2]);
    System.out.println(twoDIntArr[1][3])

    // Nested for Loop

    for (int i = 0; i < twoDIntArr.length; ++i ) {
        for (int j = 0; < twoDIntArr[i].length; ++j) {
            System.out.println(twoDIntArr[i][j]);
            
        }
    }









}
    }