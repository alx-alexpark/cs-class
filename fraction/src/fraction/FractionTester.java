package fraction;

public class FractionTester {
	public static void main(String[] args) {
		Fraction[] maths = new Fraction[4];
		maths[0] = new Fraction(1, 2);
		maths[1] = new Fraction(3, 4);
		maths[2] = new Fraction(5, 6);
		maths[3] = new Fraction(2, 1);
//		
		System.out.println(sumAllFractions(maths));
		System.out.println(biggestFraction(maths));
		
	}
	public static Fraction sumAllFractions(Fraction[] maths) {
		Fraction sum = null;
		for (Fraction f : maths) {
			if (sum == null) {
				sum = f;
			} else {
				sum = sum.add(f);
			}
		}
		return sum;
	}
	
	public static Fraction biggestFraction(Fraction[] maths) {
		Fraction maxFrac = maths[0];
		double maxFracDecValue = maths[0].toDecimal();
		for (Fraction f: maths) {
			if (f.toDecimal() > maxFracDecValue) {
				maxFracDecValue = f.toDecimal();
				maxFrac = f;
			}
		}
		return maxFrac;
	}
}
