package modelo;

public class PicBmp implements IPicture{

    private static PicBmp instancia;

    private PicBmp() {}

    public static PicBmp getInstance() {
        if (instancia == null) {
            instancia = new PicBmp();
        }
        return instancia;
    }

    @Override
    public String pintar() {
        return "Pintando imagen BMP";
    }
}
