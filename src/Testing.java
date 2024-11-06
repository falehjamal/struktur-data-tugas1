import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.Locale;

public class Testing
{
    private static String formatRupiah(BigInteger amount) {
        NumberFormat format = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        format.setMaximumFractionDigits(0); 
        String formattedAmount = format.format(amount);
        return formattedAmount.replace("Rp", "Rp ");
    }

    public static void main(String[] args) {
        BigInteger jumlah = new BigInteger("1500000000000000000000000000000");
        String formattedAmount = formatRupiah(jumlah);
        System.out.println("Jumlah dalam format Rupiah: " + formattedAmount);
    }
}
