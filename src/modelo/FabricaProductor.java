package modelo;

// Productor de fabricas: a partir de un String indica cual de las
// fabricas concretas (DocumentoFabrica o PictureFabrica) debe entregar.
public class FabricaProductor
{
    // El metodo del productor de fabricas debe ser estatico
    public static IFabricaAbstracta getFabrica( String tipo )
    {
        return switch( tipo.toLowerCase( ) )
        {
            case "documento" -> new DocumentoFabrica( );
            case "picture" -> new PictureFabrica( );
            default -> null;
        };
    }
}