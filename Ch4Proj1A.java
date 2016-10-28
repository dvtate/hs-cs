

//********************************************************************
//  Banking.java       Author: Lewis/Loftus/Cocking
//
//  Driver to exercise the use of multiple Account objects.
//********************************************************************
public class Ch4Proj1A {
   //-----------------------------------------------------------------
   //  Creates some bank accounts and requests various services.
   //-----------------------------------------------------------------
   public static void main (String[] args)   {
      Account acct1 = new Account ("Ted Murphy", 72354, 102.56);
      Account acct2 = new Account ("Anita Gomez", 69713, 40.00);
      Account acct3 = new Account ("Sanchit Reddy", 93757, 759.32);
      acct1.deposit (25.85);
      double gomezBalance = acct2.deposit (500.00);
      System.out.println ("Gomez balance after deposit: " +
                          gomezBalance);
      System.out.println ("Gomez balance after withdrawal: " +
                          acct2.withdraw (430.75, 1.50));
      acct3.withdraw (800.00, 0.0);  // exceeds balance
      acct1.addInterest();
      acct2.addInterest();
      acct3.addInterest();
      System.out.println ();
      System.out.println (acct1);
      System.out.println (acct2);
      System.out.println (acct3);

      System.out.println("\n\n\n");

      // make 2 more accounts
      Account meyersAcct = new Account("Carol Meyers", 666666, 0.0);
      Account testaAcct = new Account("DV Tate Testa", 888888, 1000.00);

      // give some info on them
      System.out.println(testaAcct.toString());
      System.out.println(meyersAcct.toString());


      // transfer all of my monies to meyers
      System.out.print("\nTransfering all of Tate's monies to Meyers' account...");
      Account.transfer(testaAcct, meyersAcct, 10050);
      System.out.println(" done :D\n");

      // show what we changed
      System.out.println(testaAcct.toString());
      System.out.println(meyersAcct.toString());


   }
}
