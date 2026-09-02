package modelo;

// Clase concreta - Patron Singleton
public class DocWord implements IDocumento
{
    private static DocWord instance;

    private DocWord( ) { }

    // Singleton
    public static DocWord getInstance( )
    {
        if( instance == null )
            instance = new DocWord( );

        return instance;
    }

    @Override
    public String abrir( )
    {
        return "abriendo el documento de word";
    }

    @Override
    public String guardar( )
    {
        return "guardando el documento de word";
    }

    @Override
    public String salir( )
    {
        return "saliendo de word";
    }
}
