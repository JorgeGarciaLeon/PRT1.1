public class contador {
    public static int valorInicial = 0;
    public static int valorLimite = 10;
    public static int incremento = 1;

    public contador(){

    }

    public contador(int valorInicial, int valorLimite, int incremento){
        this.valorInicial = valorInicial;
        this.valorLimite = valorLimite;
        this.incremento = incremento;
    }

    public boolean comprobar(){
        if(valorInicial+incremento > valorLimite){
            return false;
        }else{
            return true;
        }
    }

    public int volverValorInicial(){
        return this.valorInicial;
    }

    public int getValorActual(){
        return this.valorInicial;
    }

    
}
