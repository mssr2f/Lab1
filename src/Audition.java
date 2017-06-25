
public class Audition {
 Performers[] listofPerformer;
 
 
 public void addPerformers(Performers[]  per){
	 this.listofPerformer = per;
	 
 }
 
 public void startAudition(){
	 
	 for( int i =0; i<listofPerformer.length; i++ ){
		 
		 listofPerformer[i].perform();
	 }
 }
 
}
