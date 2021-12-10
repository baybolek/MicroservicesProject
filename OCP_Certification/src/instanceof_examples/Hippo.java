package instanceof_examples;

public class Hippo extends HeavyAnimal {
	
	
	
	public static void main(String[] args) {
		Hippo x=new Hippo();
		
				boolean b1=x instanceof HeavyAnimal;
				boolean b2=x instanceof Hippo;
				boolean b3=x instanceof Object;
				//boolean b4=x instanceof Elephant;
				System.out.println(b1);
				System.out.println(b2);
				System.out.println(b3);
				
				
				HeavyAnimal y=new Hippo();
				boolean b4=x instanceof MotherHippo;
				System.out.println(b4);

	}

}
