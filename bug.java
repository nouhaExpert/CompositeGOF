package CompositeProject;

public class bug extends Component{
	
	//constructeur
	public bug (String name){
	    super(name);	
	}
	
	
	//methode abstraite
	@Override 
	public void view(){
		String tab=identation();
		System.out.println(tab+"bug: "+name); 
	}
}
