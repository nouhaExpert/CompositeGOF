package CompositeProject;

import java.util.ArrayList;
import java.util.List;

public class Tache extends Component{
	
	
	private List<Component> components=new ArrayList<>();
	public Tache (String name){
		super(name);
	}
	
	
	@Override
	public void view(){
		String tab=identation();
		System.out.println(tab+"Tache : "+name );
		for (Component c:components){
			
			c.view();
		
		}
	}
	
	public Component addComponent(Component component){
		
		// Vérifier le type de composant à ajouter
        if (component instanceof Tache || component instanceof bug ) {
            // Si c'est une bug ou un sous-tâche, ajoutez-le
            component.level = this.level + 1;
            this.components.add(component);
            return component;
        } else {
            // Sinon, affichez un message d'erreur
            System.out.println("Erreur : Les tâches ne peuvent être ajoutées qu'à des sous-projets.");
            return null;
        }
	
	}
	public Component getComponent(String name){
		
		for (Component c:components){
			if (c.name.equals(name)) return c;
		}
		return null;
		}
} 
