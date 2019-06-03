package cs1;

// Esempio di uso di eccezioni standard
import cs1.Keyboard;

public class ProductCodes
{
   //------------------------------------------------
   // Conta il numero di codici prodotti inseriti per
   // la zona R e identificativo > 2000.
   //------------------------------------------------
   public static void main (String[] args)
   {
      String code;
      char zone;
      int district, valid = 0, banned = 0;

      System.out.print("Enter product code (XXX to quit): ");
      code = Keyboard.readString();

      while (!code.equals ("XXX"))
      {
         try
         {
            zone = code.charAt(9);
            district = Integer.parseInt(code.substring(3, 7));
            valid++;
            if (zone == 'R' && district > 2000)
               banned++;
         }
         catch (StringIndexOutOfBoundsException exception)
         {
            System.out.println("Improper code length: "+code);
         }
         catch (NumberFormatException exception)
         {
            System.out.println("District is not numeric:"+code);
         }

         System.out.print("Enter product code (XXX to quit): ");
         code = Keyboard.readString();
      }

      System.out.println ("# of valid codes entered: "+valid);
      System.out.println ("# of banned codes entered: "+banned);
   }
}
