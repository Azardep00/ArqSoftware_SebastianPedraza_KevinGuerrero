package modelo;

public class PicJpg implements IPicture {

    private static PicJpg instancia;

    private PicJpg() {}

    public static PicJpg getInstance() {
        if (instancia == null) {
            instancia = new PicJpg();
        }
        return instancia;
    }

    @Override
    public String pintar() {
        return "Pintando imagen JPG";
    }
}
