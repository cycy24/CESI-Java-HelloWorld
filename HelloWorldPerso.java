public class HelloWorldPerso {
  // Définition de la fonction main
  public static void main(String[] args){
    // Affichage du commentaire Hello world dans la fenêtre de commande
	if(args.length>0){
		System.out.println("Hello "+args[0]);
	}else{
		System.out.println("Hello World");
	}
  }
}