public class Televisao{
    // atributos
    String  marca;
    int     tamanho;
    int     voltagem;
    String  resolucao;
    boolean ligada;
    int     canal;
    int     volume;

    // metodos
    void ligar() {
        ligada = true;
        System.out.println("Agora a TV " + marca +" esta ligada");
    }

    void desligar(){
        ligada = false;
        System.out.println("Agora a TV " + marca + " esta desligada");
    }

    void aumentarVolume(){
        volume++;
        System.out.println("Volume  " +volume);
    }
    void diminurVolume(){
        volume--;
        System.out.println("Volume  " +volume);
    }
    void avancarCanal(){
        canal++;
        System.out.println("Canal  " +canal);
    }
    void voltarCanal(){
        canal--;
        System.out.println("Canal  " +canal);
    }


} 

public class Televisao{
    // atributos
    private String  marca;
    private int     tamanho;
    private int     voltagem;
    private String  resolucao;
    private boolean ligada;
    private int     canal;
    private int     volume;


    // criando meu metodo construtor
    public Televisao(String ma, int ta, int vt, String rs){
        // aqui eu coloco logica para por exemplo, inicializar atributos
        marca = ma;
        tamanho = ta;
        voltagem = vt;
        resolucao = rs;
    }

    // metodos
    public void ligar() {
        ligada = true;
        System.out.println("Agora a TV " + marca +" esta ligada");
    }

    public void desligar(){
        ligada = false;
        System.out.println("Agora a TV " + marca + " esta desligada");
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("A TV "+marca+"  esta no volume "+volume);
    }
    public void diminurVolume(){
        volume--;
        System.out.println("A TV "+marca+"  esta no volume "+volume);
    }
    public void avancarCanal(){
        canal++;
        System.out.println("A TV "+marca+" sintoniza o canal "+canal);
    }
    public void voltarCanal(){
        canal--;
        System.out.println("A TV "+marca+" sintoniza o canal "+canal);
    }


}