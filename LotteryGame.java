import java.util.*;

public class LotteryGame
  {

    public static void main(String[] args)
      {
        //display game instructions
        GameInfo();

        //Scanner for input
        Scanner sc = new Scanner(System.in);
        int[] winNumbers = new int[4];  //array for 4 random numbers
        boolean[] check = new boolean[10];
        int[] guessNums = new int[4];   //user guesses
        int guess = 0;
        int rnd;
        int numberCorrect = 0;

        //Generate random number between 0 and 9
        System.out.print("Cheat: Winning Lotto Numbers - ");
        Random rand = new Random(System.currentTimeMillis());
        for (int i = 0; i < winNumbers.length; i++)
          {
            rnd = rand.nextInt(10);
            while (check[rnd])
              {  //check for duplicate generated numbers
                rnd = rand.nextInt(10);
              }
            winNumbers[i] = rnd;
            check[rnd] = true;
            System.out.print(winNumbers[i] + " ");
          }

        System.out.println();

        //Get user input for 4 numbers guessed
        System.out.println("Please enter 1 number at each prompt (0-9)");
        for (int j = 0; j < guessNums.length; j++)
          {
            int z = j + 1; //counter for display which guess #
            System.out.print("Enter " + z + "  your guess >> ");
            while (!sc.hasNextInt())
              { //check input is not integer 
                String input = sc.next();
                System.out.printf("\n%s is not a valid number\n", input);
                System.out.print("\nEnter " + z + " your guess >> ");
              }
            guess = sc.nextInt();
            if (guess < 0 || guess > 9)
              { //checking for incluse range of 0-9
                System.out.println("\nOnly values 0 to 9");
                System.out.print("\nEnter " + z + "  your guess >> ");
                while (!sc.hasNextInt())
                  { //check input is not integer 
                    String input = sc.next();
                    System.out.printf("\n%s is not a valid number\n", input);
                    System.out.print("\nEnter " + z + " your guess >> ");
                  }
                guess = sc.nextInt();
              }
            guessNums[j] = guess; //write guess to array
          }

        //display win/guessed numbers
        c3po("Winning Lotto Numbers >> ", winNumbers);
        c3po("Your numbers entered are >> ", guessNums);

        //checking the number of correct guesses & display points
        for (int c = 0; c < guessNums.length; c++)
          {  //outer loop controlling each element in guessNums array
            for (int d = 0; d < winNumbers.length; d++)
              {    //inner loop checking against outer loop for each element of winNumbers
                if (guessNums[c] == winNumbers[d])
                  {
                    numberCorrect++;
                  }
              }
          }
        System.out.println("\nYou got " + numberCorrect + " correct!");
        awardPoints(numberCorrect); //display points awarded

        System.out.println();
        System.exit(0);
      }

    //display winning/user guess input
    public static void c3po(String s, int[] i)
      {
        System.out.print("\n" + s);
        for (int n = 0; n < i.length; n++)
          {
            System.out.print(i[n] + " ");
          }
      }
    //game instructions

    public static void GameInfo()
      {
        System.out.println("\n\n");
        System.out.println("*** Welcome to the Lottery Game ***");
        System.out.println("\n");
        System.out.println(" Instructions: ");
        System.out.println("  Player will enter a number when prompted "
                + "and the number will be from 0 to 9");
        System.out.println("  Points are awarded as follows:");
		System.out.printf("\n	  Matched	Points\n");
		System.out.printf("	-----------------------------\n");
		System.out.printf("	  0		0		\n");
		System.out.printf("	  1		5		\n");
		System.out.printf("	  2		100		\n");
		System.out.printf("	  3		2,000	\n");
		System.out.printf("	  4		1,000,000\n");
//        System.out.println("   No matches will get 0 points");
  //      System.out.println("   Any one digit matching will get 5 points");
    //    System.out.println("   Any two digit matching will get 100 points");
      //  System.out.println("   Any thee digit matching will get 2,000 points");
        //System.out.println("   All four digit matching will get 1,000,000 points");
        System.out.println("\n");
      }
    //award points

    public static void awardPoints(int cnt)
      {
        switch (cnt)
          {
            case 0:
                System.out.println("No points are awarded");
                break;
            case 1:
                System.out.println("5 points are awarded");
                break;
            case 2:
                System.out.println("100 points are awarded");
                break;
            case 3:
                System.out.println("2,000 points are awarded");
                break;
            case 4:
                System.out.println("Big Winner: 1,000,000 points awarded");
                break;
          }
      }
  }
