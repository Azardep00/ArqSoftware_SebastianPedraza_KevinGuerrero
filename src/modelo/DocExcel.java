package modelo;

// Clase de DocExcel siguiendo el patron Singleton
public class DocExcel implements IDocumento {

    private static DocExcel instance;

    private DocExcel(){
    }

    //Patron Singleton para docexcel
    public static DocExcel getInstance()
    {
        if(instance == null)
        {
            instance = new DocExcel();
        }
        return instance;
    }

    @Override
    public String abrir( )
    {
        return "abriendo el documento de excel";
    }

    @Override
    public String guardar( )
    {
        return "guardando el documento de excel";
    }

    @Override
    public String Salir()
    {
        return "saliendo de excel";
    }
}
