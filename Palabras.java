package examen1;

public class Palabras {
    private String cadena;

    public Palabras(String cadena) {
        this.cadena = cadena;
    }

    public void primeraMayuscula() {
        if (cadena != null && !cadena.isEmpty()) {
            char primeraLetra = Character.toUpperCase(cadena.charAt(0));
            String restoDeLaCadena = cadena.substring(1);
            String cadenaResultante = primeraLetra + restoDeLaCadena;
            System.out.println(cadenaResultante);
        } else {
            System.out.println("La cadena está vacía o es nula.");
        }
    }

    public void invertirCadena() {
        if (cadena != null && !cadena.isEmpty()) {
            StringBuilder cadenaInvertida = new StringBuilder(cadena);
            cadenaInvertida.reverse();
            System.out.println(cadenaInvertida.toString());
        } else {
            System.out.println("La cadena está vacía o es nula.");
        }
    }

    public void vocalesMayuscula() {
        if (cadena != null && !cadena.isEmpty()) {
            StringBuilder nuevaCadena = new StringBuilder();

            for (int i = 0; i < cadena.length(); i++) {
                char caracter = cadena.charAt(i);
                char caracterMayuscula = caracter;

                if ("aeiouAEIOU".contains(String.valueOf(caracter))) {
                    caracterMayuscula = Character.toUpperCase(caracter);
                }

                nuevaCadena.append(caracterMayuscula);
            }

            System.out.println(nuevaCadena.toString());
        } else {
            System.out.println("La cadena está vacía o es nula.");
        }
    }
    public boolean Palindromo() {
        if (cadena != null && !cadena.isEmpty()) {
            String cadenaSinEspacios = cadena.replaceAll("\\s", "").toLowerCase();
            int longitud = cadenaSinEspacios.length();

            for (int i = 0; i < longitud / 2; i++) {
                if (cadenaSinEspacios.charAt(i) != cadenaSinEspacios.charAt(longitud - 1 - i)) {
                    return false; 
                }
            }

            return true; 
        } else {
            return false; 
        }
    }


}
