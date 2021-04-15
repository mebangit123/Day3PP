public class LineComparison {
	public static void main(String[] args){
		System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
		
		int x1=1, y1=2, x2=4, y2=3;
		int x3=3, y3=5, x4=2, y4=1;

		String line1 = Double.toString(Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2 - y1, 2)));
		String line2 = Double.toString(Math.sqrt(Math.pow(x4-x3, 2) + Math.pow(y4 - y3, 2)));

		System.out.println(line1.equals(line2));
		System.out.println(line1.compareTo(line2));
	}
}
