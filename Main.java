package CompositeProject;

public class Main {

	public static void main(String[] args) {
		Tache root = new Tache("root");
		Tache T1=new Tache("tache1");
		Tache T2=new Tache("tache2");
		/*bug b1=new bug("bug1");
		bug b2=new bug("bug2");*/
		root.addComponent(T1);
		root.addComponent(T2);
		
		
		Tache T3=(Tache) T1.addComponent(new Tache("st1"));
		T2.addComponent(new bug("bug one"));
		T3.addComponent(new bug("bug2"));
		Tache T4=(Tache) T1.getComponent("st1");
		T4.addComponent(new Tache("st12"));
		root.view();
	

	}

}
