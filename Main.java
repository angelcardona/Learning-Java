public class Main {
    public static void main(String[] args) {
        //Datos primitivos
        byte edad=18;
        int numeroGrande=3546;
        float age=15.5f;
        boolean isActive=true;
        char curso='A';
        //Strings
        String text="Hola mundo";
        String texto=text.replace("Hola", "chao");
        String bad="  pork happy  ";
        //Print by console
        System.out.println(edad);
        System.out.println(numeroGrande);
        System.out.println(age);
        System.out.println(isActive);
        System.out.println(curso);
        System.out.println(text);
        System.out.println(texto);
        //Strings methods
        System.out.println(text.length());
        System.out.println(texto.endsWith("mundo"));
        System.out.println(texto.startsWith("o"));
        System.out.println(texto.contains("und"));
        System.out.println(texto.indexOf("mund"));
        System.out.println(texto.toUpperCase());
        System.out.println(texto.toLowerCase());
        System.out.println(bad.trim());
    }
}


