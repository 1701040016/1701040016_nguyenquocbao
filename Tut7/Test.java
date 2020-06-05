
public class Test {
	public static void main(String[] args) {
		BagInterface<String> myBag = new ArrayBag<>();
		System.out.println("Before");
		System.out.println("Number of entry: " + myBag.getCurrentSize());
		System.out.println("After");
		myBag.add("Hanu");
		myBag.add("Ftu");
		myBag.add("Hust");
		myBag.add("Neu");
		
		System.out.println("Number of entry: " + myBag.getCurrentSize());

		System.out.println("My bag contain" +" Ftu? :" + myBag.contains("Ftu"));
		
		System.out.println("Final");
		myBag.clear();
		System.out.println("Number of entry: " + myBag.getCurrentSize());

		
	}

}
