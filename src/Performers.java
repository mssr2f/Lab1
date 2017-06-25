
//Review lab


public class Performers {
	private int id;
	
	public Performers(int id){
		
		this.id = id;
	}

	public void perform(){
		
		System.out.println(id + "performer");
	}
	
	public int getId(){
		
		return this.id;
	}
	
}
