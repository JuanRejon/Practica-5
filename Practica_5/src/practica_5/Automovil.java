package practica_5;

/**
 *
 * @author Juan Carlos
 */
public class Automovil extends Automotor{
    
    public Automovil(){
    
    }
    
    private String color;
    private double precio;
    double gas_restante = getGas();
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public double avanza(double gas_restante){
        
        if(gas_restante>=1){
        System.out.println("El vehiculo avanza");
        gas_restante--;   
        }else{
            System.out.println("Gasolina Agotada"); 
        }
        setGas(gas_restante);
        return gas_restante;
        
    };
    public double avanzaDerecha(double gas_restante){
        
        if(gas_restante>=1){
        System.out.println("El vehiculo gira a la derecha");
        gas_restante--;   
        }else{
            System.out.println("Gasolina Agotada"); 
        }
        setGas(gas_restante);
        return gas_restante;
    }
        
    public double avanzaIzquierda(double gas_restante){
        
        if(gas_restante>=1){
        System.out.println("El vehiculo gira a la izquierda");
        gas_restante--;   
        }else{
            System.out.println("Gasolina Agotada"); 
        }
        setGas(gas_restante);
        return gas_restante;
    }
    
}
