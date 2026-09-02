package modelo;
public class DocumentoFabrica implements IFabricaAbstracta
{
    @Override
    public IDocumento getDocumento(String tipo)
    {
        // Patron Factory: crea el objeto concreto segun el tipo solicitado
        return switch( tipo.toLowerCase())
        {
            case "word" -> DocWord.getInstance();
            case "excel" -> DocExcel.getInstance();
            case "powerpoint" -> DocPowerPoint.getInstance();
            default -> null;
        };
    }

    @Override
    public IPicture getPicture(String tipo)
    {
        // Esta fabrica esta especializada en documentos, no en imagenes.
        throw new UnsupportedOperationException(
                "DocumentoFabrica no crea objetos de tipo IPicture");
    }
}
