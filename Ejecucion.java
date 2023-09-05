package examen1;

public class Ejecucion {
    public void iniciarPrograma() {
    	
            Palabras palabrasObjeto1 = new Palabras("hasta luego cocodrilo");
            System.out.println("Antonio Martinez Sierra 169599 Primer Objeto:");
            palabrasObjeto1.primeraMayuscula();
            palabrasObjeto1.invertirCadena();
            palabrasObjeto1.vocalesMayuscula();
            boolean Palindromo = palabrasObjeto1.Palindromo();
            System.out.println("Es Palíndromo: " + Palindromo);

            Palabras palabrasObjeto2 = new Palabras("anita lava la tina");

            System.out.println("\nSegundo Objeto:");
            palabrasObjeto2.primeraMayuscula();
            palabrasObjeto2.invertirCadena();
            palabrasObjeto2.vocalesMayuscula();
            boolean Palindromo1 = palabrasObjeto2.Palindromo();
            System.out.println("Es Palíndromo: " + Palindromo1);
        }
        Extra extraObjeto = new Extra();
    }

