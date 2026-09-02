package modelo;

public class PictureFabrica implements IFabricaAbstracta{

    @Override
    public IDocumento getDocumento(String tipo) {
        throw new UnsupportedOperationException(
                "PictureFabrica no crea documentos, use DocumentoFabrica");
    }

    @Override
    public IPicture getPicture(String tipo) {
        if (tipo == null) {
            return null;
        }
        switch (tipo.toLowerCase()) {
            case "png":
                return PicPng.getInstance();
            case "jpg":
                return PicJpg.getInstance();
            case "bmp":
                return PicBmp.getInstance();
            default:
                throw new IllegalArgumentException("Tipo de imagen no soportado: " + tipo);
        }
    }
}
