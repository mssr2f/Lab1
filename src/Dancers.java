
public class Dancers  extends Performers{
	
	private String style;
	
	
	public Dancers( String style, int id) {
		super(id);
		this.style = style;
	}

	public void perform(){
		System.out.println( style + getId() + "Dancer");
	}

	

}
