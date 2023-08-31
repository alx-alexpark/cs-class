package fraction;

public class Fraction {
	private int num;
	private int den;
	
	public Fraction() {
		num = 1;
		den = 1;
	}
	
	public Fraction(int n, int d) {
		num = n;
		den = d;
	}
	
	public Fraction reciprocal() {
		return new Fraction(den, num);
	}
	
	private int gcd(int a, int b) {
		   if (b==0) return a;
		   return gcd(b,a%b);
	}
	
	public void reduce() {
		int gcd = gcd(num, den);
		this.num = num / gcd;
		this.den = den / gcd;
	}
	
	public Fraction multiply(Fraction other) {
		return new Fraction(num*other.getNum(), den*other.getDen());
	}
	
	public Fraction divide(Fraction other) {
		return multiply(other.reciprocal());
	}
	
	public Fraction add(Fraction other) {
		int top = num*other.getDen()+den*other.getNum();
		int bottom = den*other.getDen();
		return new Fraction(top, bottom);
	}
	
	public Fraction subtract(Fraction other) {
		int top = num*other.getDen()-den*other.getNum();
		int bottom = den*other.getDen();
		return new Fraction(top, bottom);
	}
	
	public double toDecimal() {
		return num*1.0/den;
	}
	
	public String toString() {
		return num + "/" + den;
	}
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getDen() {
		return den;
	}
	public void setDen(int dnum) {
		this.den = dnum;
	}
	
	
	

}
