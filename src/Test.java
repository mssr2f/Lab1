
public class Test {

	public static void main(String[] args) {

		Performers[] array = new Performers[7];
		array[0] = new Performers(123);
		array[1] = new Performers(245);
		array[2] = new Performers(111);
		array[3] = new Performers(234);
		array[4] = new Dancers("salasa", 456);
		array[5] = new Dancers( "freestyle", 123);
		array[6] = new Vocalists( "G", 123);
		
		Audition a = new Audition();
		a.addPerformers(array);
		a.startAudition();
		Vocalists v = new Vocalists("H", 222);
		v.perform(4);



		
		
		
		
	}

}
