package E2;

public class ParImpar {
    public int valor;
    
    public String ehPar()
    {
        if ( this.valor % 2 == 0 )
        {
            return "É par!";
        }
        else
        {
            return "É ímpar!";
        }
    }
    
}
