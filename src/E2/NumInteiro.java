package E2;

/**
 *
 * @author Vico
 */
public class NumInteiro {
    public int numero;
    
    public String ehPositivo()
    {
        if (this.numero > 0)
        {
            return "Número e positivo!";
        }
        else
        {
            return "Número e negativo!";
        }
    }
}
