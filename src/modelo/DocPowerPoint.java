package modelo;

// Clase concreta - Patron Singleton
public class DocPowerPoint implements IDocumento
{
    private static DocPowerPoint instance;

    private DocPowerPoint( ) { }

    // Singleton
    public static DocPowerPoint getInstance( )
    {
        if( instance == null )
            instance = new DocPowerPoint( );

        return instance;
    }

    @Override
    public String abrir( )
    {
        return "abriendo el documento de powerpoint";
    }

    @Override
    public String guardar( )
    {
        return "guardando el documento de powerpoint";
    }

    @Override
    public String salir( )
    {
        return "saliendo de powerpoint";
    }
}
