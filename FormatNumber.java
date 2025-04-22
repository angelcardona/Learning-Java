import java.text.NumberFormat;
import java.util.Locale;

public class FormatNumber {
    public static void main(String[] args) {
        Locale locale=Locale.forLanguageTag("es-CO");
        NumberFormat numberFormat=NumberFormat.getCurrencyInstance(locale);
        String result = numberFormat.format(3457.34);
        System.out.println(result);

        //Percentage

        NumberFormat percent= NumberFormat.getPercentInstance();
        System.out.println(percent.format(.25));


    }
}
