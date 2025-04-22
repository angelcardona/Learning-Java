public class Strings {
    public static void main(String[] args) {
        String text="Hola mundo";
        String texto=text.replace("Hola", "chao");
        String bad="  pork happy  ";
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
