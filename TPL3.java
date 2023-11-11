
package TERMINAL02;

import java.util.Scanner;

public class TPL3 {

	public static void main(String[] args) {
		
		//Solution des exercices en Java le 8/11/2023
		
		 //EXO1 en classe
		Scanner clavier = new Scanner(System.in);
		System.out.print("Saissir la taille du tableau :");
		
		int taille = clavier.nextInt();
		int[]nb = new int[taille];
		
		for(int i = 0; i < nb.length; i++) {
			nb[i] = clavier.nextInt();
		}
		for(int i :nb) {
			System.out.print(i+ " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Solution des exercices en Java le 1/11/2023
		//EXO 15
		/*
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Saisissez un caractère : ");
	        char caractere = scanner.next().charAt(0);

	        if ((caractere >= 'a' && caractere <= 'z') || (caractere >= 'A' && caractere <= 'Z')) {
	            System.out.println(caractere + " est un alphabet.");
	        } else if (caractere >= '0' && caractere <= '9') {
	            System.out.println(caractere + " est un chiffre.");
	        } else {
	            System.out.println(caractere + " est un symbole spécial.");
	        }
			*/
		//EXO 14
		/*
	    Scanner clavier = new Scanner(System.in);

        System.out.println("Résolution de l'équation quadratique ax^2 + bx + c = 0");

        System.out.print("Saisissez la valeur de a : ");
        double a = clavier.nextDouble();
        System.out.print("Saisissez la valeur de b : ");
        double b = clavier.nextDouble();
        System.out.print("Saisissez la valeur de c : ");
        double c = clavier.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double racine1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double racine2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Deux racines réelles distinctes :");
            System.out.println("Racine 1 : " + racine1);
            System.out.println("Racine 2 : " + racine2);
            
        } else if (discriminant == 0) {
            double racine = -b / (2 * a);
            System.out.println("Une racine réelle : " + racine);
        } else {
            double reel = -b / (2 * a);
            double imaginaire = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Deux racines complexes distinctes :");
            System.out.println("Racine 1 : " + reel + " + " + imaginaire + "i");
            System.out.println("Racine 2 : " + reel + " - " + imaginaire + "i");
        }
		*/
	
		/*
		//EXO13
		  Scanner scanner = new Scanner(System.in);

	        System.out.print("Saisissez une lettre : ");
	        char lettre = scanner.next().charAt(0); // Lire le premier caractère entré

	        // Convertir la lettre en minuscule pour simplifier la comparaison
	        lettre = Character.toLowerCase(lettre);

	        if (lettre == 'a' || lettre == 'e' || lettre == 'i' || lettre == 'o' || lettre == 'u') {
	            System.out.println(lettre + " est une voyelle.");
	        } else {
	            System.out.println(lettre + " est une consonne.");
	        }
		*/
		
		//EXO12
		/*
		    Scanner clavier = new Scanner(System.in);

	        System.out.print("Saisissez un nombre : ");
	        int nombre = clavier.nextInt();

	        if (nombre % 3 == 0 && nombre % 13 == 0) {
	            System.out.println(nombre + " est divisible par 3 et 13.");
	        } else {
	            System.out.println(nombre + " n'est pas divisible par 3 et 13.");
	        }
		*/
		
		
		//EXO 11
		/*
		Scanner clavier = new Scanner(System.in);
		System.out.print("Saisir le premier angle : ");
		double angleA = clavier.nextDouble();
		System.out.println("Sasir le deuxiem angle : ");
		double angleB = clavier.nextDouble();
		
		double angleC = 180 - angleA - angleB;
		
		System.out.print("le troisieme angle est "+angleC+"degre : ");
		
		*/
		
		// EXO 10
		/*
		Scanner clavier = new Scanner(System.in);
        System.out.print("Saisissez un nombre : ");
        int nbr = clavier.nextInt();
        clavier.nextLine(); 
        int sommeChiffres = 0;
        int nombreOriginal = nbr;
        
        while (nbr != 0) {
            int chiffre = nbr % 10;
            sommeChiffres += chiffre;
            nbr /= 10;
        }
        System.out.println("La somme du chiffre " + nombreOriginal + 
        " = " + sommeChiffres);
		*/
		//EXO 9
		/*
		Scanner clavier = new Scanner(System.in);
		System.out.print("Saisir un numero : ");
		int num = clavier.nextInt();
		
		  int dernierChiffre = num %10;
		  int premierChiffre = Character.getNumericValue(Integer.toString(num)
			.charAt(0));
		  int longueure = (int)Math.log10(num) + 1;
		  
		  int nouveauNumero = dernierChiffre * (int) Math.pow(10, longueure - 1)
		+ num % (int) Math.pow(10, longueure + 1) / 10 + premierChiffre;
		
		
		System.out.print("Numero apres l'echange est :"+nouveauNumero);
		*/
		
		//EXO 8 en utilisant la boucle while
		/*
		Scanner clavier = new Scanner(System.in);
		System.out.print("Saissir un nombre : ");
		int nbr = clavier.nextInt();
		
		int premierChiffre = 0;
		int dernierChiffre = 0;
		int CopieNombre = nbr;
		
		dernierChiffre = nbr % 10;
		
		while(CopieNombre != 0) {
			
			premierChiffre = CopieNombre % 10;
			
			CopieNombre /=10;
		}
		
		System.out.println("Le premier chiffre"+" = "+premierChiffre);
		System.out.println("Le dernier chiffre"+ " = "+dernierChiffre);
		
		clavier.close();
		*/
		
		/*
		//Exo 7 en utilisant la condition if et la boucle for 
		Scanner clavier = new Scanner(System.in);
		System.out.print("Sassir un nombre :");
		int nbr = clavier.nextInt();
		int nombreChiffre = 0;
		
		while(nbr!=0) {
			nombreChiffre++;
			nbr /=10;
		}
		System.out.print("Nombre de ciffre " +nombreChiffre);
		
		*/
		
		/*
		 //Exo6
		Scanner clavier = new Scanner(System.in);
		System.out.print("Sassir un nombre compris entre 1 et 6 :");
		int n = clavier.nextInt();
		if(n >1 && n < 7) {
			System.out.println("Tableau de multiplication pour :"+n+":");
			
			for(int i = 1; i<= 10; i++) {
				System.out.println(n+" x "+i+" = "+(n*i));
			}
			
		}else {
			System.out.print("le nombre entrer n'est pas compris entre 1 et 6");
		}
		*/

		// Exo 5 boucle for et while
		
		//boucle while
		/*
		Scanner clavier = new Scanner(System.in);
		System.out.print("Saissir un nombre:");
		int n = clavier.nextInt();
		int s = 0;
		int i = 2;
		
		while(i<=n) {
			s +=i;
			i+=2;
		}

        System.out.println("La somme des nombres pairs de 1 à " + n + " = " + s);
		*/
		
			//boucle for
		/*
		Scanner clavier = new Scanner(System.in);
		System.out.print("Saissir un nombre:");
		int n = clavier.nextInt();
		int s = 0;
		for(int i = 0; i<=n;i+=2) {
			if(i%2 == 0) {
				s +=i;
			}
		}
		System.out.println("La somme de " +n+ " sassir est "+s);
		*/
		//Exo 4
		
		//boucle while
		/*
		Scanner clavier = new Scanner(System.in);
		System.out.print("Saissir un nombre:");
		int n = clavier.nextInt();
		int s = 0;
		int i = 1;
		
		while(i<=n) {
			
			s +=i;
			i++;
		}
		System.out.print("la somme de " +n+ "sassir par l'utilisateur est :"+s);
		
		*/
	     //boucle for
		
		/*
		Scanner clavier = new Scanner(System.in);
		System.out.print("Saissir un nombre:");
		int n = clavier.nextInt();
		int s = 0;
		
		for(int i = 0; i<=n;i++) {
			s = s+i;
		}
		System.out.println("La somme sassir par l'utilisateur est :"+s);
		*/
		
		//Exo 3 boucle for et while
		
		//boucle while
		/*
		Scanner clavier = new Scanner(System.in);
		System.out.print("Saissir un nombre :");
		int n = clavier.nextInt();
		int i = n;
		while(i > 1) {
			System.out.println(i);
			i--;
		}
		*/
		
		//boucle for d'abord
		
		/*
		Scanner clavier = new Scanner(System.in);
		System.out.print("Saissir un nombre :");
		int n = clavier.nextInt();
		
		for(int i = n; i >=1; i--) {
			
			System.out.println(i);
			
		}
		*/
			
		//EXO2 boucle et forwhile;
		
		//boucle while
		
		/*
		Scanner clavier = new Scanner(System.in);
		System.out.print("Sassir un nombre : ");
		int n = clavier.nextInt();
		int i = 0;
		while(i<=n) {
			System.out.println(i);
			i++;
		}
		clavier.close();
		
		//boucle for
		/*
		Scanner clavier = new Scanner(System.in);
		System.out.print("Sassir un nombre : ");
		int n = clavier.nextInt();
		for(int i = 1 ; i<=n;i++) {
			System.out.println(i);
		}
		clavier.delimiter();
		*/
		
		//EXO1
		/*
		int inverse;
		Scanner clavier = new Scanner(System.in);
		System.out.print("Saissir un nombre entier : ");
			int n = clavier.nextInt();
		   
			int temp = n;
			inverse = 0;
			
			while(n!=0) {
			inverse = (inverse * 10) + (n % 10) ;
			n /= 10;
			}
			if(temp == inverse) {
				System.out.print(temp+" est un palindrome");
			}else {
				System.out.print(temp+" n'est pas palindrome");
			}
			clavier.close();
			*/
	}

}
