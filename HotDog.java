/**
 * created by luke whitaker <lawhitak@mtu.edu>
 * Creates a menu of all possible hot dogs.
 */
public class HotDog {

   /**
    * Prints all the dog combows.
    */
   public long printMenu() {

      //  the names of the toppings.
      String[] toppings = {
         "Ketchup", "Mustard", "Chopped Onions",
         "Tomato Wedge", "Sweet Relish",
         "Sport Peppers", "Sauerkraut"
      };

      // Store the prices of the toppings to use when getting the total 
      int[] prices = {15, 17, 20, 25, 30, 35, 45};

      // Keep track of the number of combinations.
      long count = 0;

      // Go through all 128 possible combinations.
      for (int i = 0; i < 128; i++) {

         // Start with the starting price .
         int total = 99;
         String menu = "hotdog";

         int number = i;         // Makes a copy 


         // Checks for the toping in the array.
         for (int j = 0; j < 7; j++) {

            // Check if the last binary digit is a 1.
            if (number % 2 == 1) {
               menu += " with " + toppings[j];
               total += prices[j];
            }

            // Move to the next binary digit.
            number = number / 2;
         }

         // Print the hot dog and its price.
         System.out.printf("%3d %-75s $%.2f%n",
               count, menu, total / 100.0);

         // Increase the combination count by 1.
         count++;
      }

      // Return the total number of options.
      return count;
   }

   /**
    * Runs menu program.
    */
   public static void main(String[] args) {

      // Create hot dog object.
      HotDog hotdog = new HotDog();

      // Print the menu and gets combo count.
      long count = hotdog.printMenu();
for
      // sees if there are 128 options.
      assert count == 128;
   }
}