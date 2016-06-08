
public class CreateSphere {
	
	public static void main (String[] args) {
		System.out.println("Number of Objects = " + Sphere.getCount());
		
		Sphere ball = new Sphere(4.0,0.0,0.0,0.0);
		Square abcd = new Square();
		System.out.println("Number of Objects = " + ball.getCount());
		System.out.println("Square coordinates " +"(" + abcd.LeftBottomxy(4.0,0.0,0.0)+")");
		System.out.println("Square coordinates " +"(" + abcd.RightBottomxy(4.0,0.0,0.0)+")");
		
		int count = 4;
		while (count <5) {
		Sphere globe = new Sphere(12.0,1.0,1.0,1.0);
		System.out.println("count " + count + "  Number of Objects = " + globe.getCount());
		
		System.out.println("ball volume =  " + ball.volume());
		System.out.println("globe volume =  " + globe.volume());
		count++;
		}
	}

}
