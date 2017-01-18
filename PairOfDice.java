import java.util.*;

public class PairOfDice {
	public Die die1, die2;
	public
	public PairOfDice(){
		die1 = new Die();
		die2 = new Die();
	}

	public PairOfDice(int sides){
		die1 = new Die(sides);
		die2 = new Die(sides);
	}

	public PairOfDice(int sides1, int sides2){
		die1 = new Die(sides1);
		die2 = new Die(sides2);
	}

	public final int roll()
		{ return die1.roll() + die2.roll(); }



};
