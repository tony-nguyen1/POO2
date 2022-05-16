package assertionsExceptions;
import java.util.Arrays;

public class TriInsertion {
	     
	     public static void triInsertion(int tableau[]) 
	     {  
	    	 //pré-condition : tableau entierrement peuplé+pas de tableau null
	          int taille = tableau.length;  
	        
	          // Pour chaque élément du tableau
	          
	          /*La 1er case est triée*/
	          for (int i = 1; i < taille; i++)
	          { 
	               int index = tableau[i];  
	               
	               // On cherche sa place entre 0 et i-1
	               // on décale vers la droite les éléments qui le précèdent 
	               // dans le tableau mais sont plus grand que lui
	               
	               int j = i-1;          
	               while(j >= 0 && tableau[j] > index)  
	               {
	                    tableau[j+1] = tableau[j];  
	                    j--;  
	               }  
	               
	               // puis on le positionne
	               
	               tableau[j+1] = index; 
	               
	 	          System.out.println("Etat du tableau à l'étape "+ i);  	               
	 	          System.out.println(Arrays.toString(tableau));  
	 	          
	 	          assert estTrie(tableau, i) : "pas trier entre 0 et "+i;
	        }
	          assert estTrie(tableau, tableau.length) : "pas trier entre 0 et "+tableau.length;
	          System.out.println(tableau.length);
	     }
	     
	     public static boolean estTrie(int tableau[], int max) {
	    	 
	    	 for (int i = 0; i<max; i++) {
	    		 if (tableau.length > i+1) {
	    			 if (tableau[i] > tableau[i+1]) {
	    				 return false;
	    			 }
	    		 }
	    	 }
	    	 
	    	 return true;
	     }
	  
	     public static void main(String str[])
	     {   
	          int[] tab = {2,13,14,3,5,4,112,37,9,11,18,1};  
	          	        
	          System.out.println("Etat du tableau avant le tri");    
	          System.out.println(Arrays.toString(tab));
	            
	          //tri par insertion
	          triInsertion(tab); 
	           
	          System.out.println("Etat du tableau après le tri");  
	          System.out.println(Arrays.toString(tab));  
	    } 

}
