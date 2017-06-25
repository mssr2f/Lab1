
public class Vocalists extends Performers {

	
	private String key;
	
	public Vocalists( String key, int id) {
		super(id);
		this.key = key;
		
	}
	
	public void perform(){
		
		//I sing in the key of – G –  at the volume 5 - 1245 ”

		System.out.println(" I sing in the key of -" + key + "of" + getId() );
		
	}

	public void perform(int volume){
		
		if(volume > 0 && volume <= 10){
		
		System.out.println("I sing in the key of "+ key +"-" + key +"- "+ "at the volume "+ volume +"-"+ getId());
		}
		else 
			System.out.println("singer can not sing this high volume");
	}
}
