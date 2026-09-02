package modelo;

public class PicPng implements IPicture {

    private static PicPng instancia;

    private PicPng(){}

    public static PicPng getInstance(){
        if(instancia==null){
            instancia = new PicPng();
        }
        return instancia;
    }

    @Override
    public String pintar() {
        return "Pintando imagen PNG";
    }
}
