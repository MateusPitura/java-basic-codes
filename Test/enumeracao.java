public enum enumeracao {
    MIN(1),NORMAL(5),MAX(10);

    private int valor;

    private enumeracao(int v){
        this.valor = v;
    }

    public int getV(){
        return this.valor;
    }
}
