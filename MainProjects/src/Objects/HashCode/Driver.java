package Objects.HashCode;

public class Driver 
{
	
	public static void main(String[] args) {
		PetAnimal petanimal = new PetAnimal("Ghochu",1);
		System.out.println(petanimal);
		System.out.println(petanimal.hashCode());
	}
	
}
