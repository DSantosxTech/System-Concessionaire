package br.com.lorem.model;
import br.com.lorem.model.Acessorios;
import br.com.lorem.model.Carro;
/**
 *
 * @author fabio
 */
public class Total  {
    private double total;

    public Total( double t) {
       
        this.total=t;
    }

    public void setValor(double valor) {
        this.total += valor;
    }

    public double getTotal() {
        return total;
    
}
}
