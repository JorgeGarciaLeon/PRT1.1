public class contador {
    public static int valorInicial;
    public static int valorLimite;
    public static int incremento;
    public int valorActual;

    public contador(int limit){
        this.valorLimite = limit;
        this.valorInicial = 0;
    }

    public contador(int valorInicial, int valorLimite, int incremento){
        this.valorInicial = valorInicial;
        this.valorLimite = valorLimite;
        this.incremento = incremento;
        this.valorActual = valorInicial;
    }

    public boolean comprobar(){
        if(valorActual > valorLimite){
            reset();
            return false;
        }else{
            return true;
        }
    }

    public int volverValorInicial(){
        return this.valorInicial;
    }

    public int getValorActual(){
        return this.valorActual;
    }

    public int reset(){
        return this.valorInicial;
    }

    public void suma(){
       valorActual+=incremento;
        comprobar();
    }

}
