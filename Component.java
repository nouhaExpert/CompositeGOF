package CompositeProject;

public abstract class Component{
	protected String name;
	protected int level; //représente le niveau de l'élément dans l'hérarchie
	
	protected Component(String name){
		this.name =name;
		this.level=level;
	}
	
	
	public abstract void view();//afficher toutes l'arborescence
	
	
	//voire le niveau
	public String identation(){
		
		String str="";
		for (int i=0;i< level; i++){
			str+="\t";
		}
		return str;
	}
}