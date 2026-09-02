package test;
import modelo.*;

public class TestPatronesCreacionales
{
    public static void main(String[] args)
    {
        System.out.println(" °||° Fabrica De Documentos °||°");
        IFabricaAbstracta fabricaDocumentos = FabricaProductor.getFabrica("documento");

        IDocumento word = fabricaDocumentos.getDocumento("word");
        System.out.println(word.abrir());
        System.out.println(word.guardar());
        System.out.println(word.Salir());

        IDocumento excel = fabricaDocumentos.getDocumento("excel");
        System.out.println(excel.abrir());
        System.out.println(excel.guardar());
        System.out.println(excel.Salir());

        IDocumento powerPoint = fabricaDocumentos.getDocumento("powerpoint" );
        System.out.println(powerPoint.abrir());
        System.out.println(powerPoint.guardar());
        System.out.println(powerPoint.Salir());

        System.out.println();
        System.out.println(" ||° Fabrica de imagenes °||");

        IFabricaAbstracta fabricaImagenes = FabricaProductor.getFabrica("picture");

        IPicture png = fabricaImagenes.getPicture("png");
        System.out.println(png.pintar());

        IPicture jpg = fabricaImagenes.getPicture("jpg");
        System.out.println( jpg.pintar( ) );

        IPicture bmp = fabricaImagenes.getPicture("bmp");
        System.out.println(bmp.pintar());

        System.out.println();
        System.out.println("||°Verificacion del Singleton°||");

        // Se hace la solicitud de cada objeto nuevamente y se comprueba que la
        // referencia devuelta es siempre la misma (misma instancia)

        IDocumento word2 = fabricaDocumentos.getDocumento("word");
        System.out.println("word == word2 -> " + (word == word2));

        IDocumento excel2 = fabricaDocumentos.getDocumento( "excel" );
        System.out.println("excel == excel2 -> " + (excel == excel2));

        IDocumento pp2 = fabricaDocumentos.getDocumento("powerpoint");
        System.out.println("pp == pp2 -> " + (powerPoint == pp2));

        IPicture png2 = fabricaImagenes.getPicture("png");
        System.out.println("png == png2 -> " + (png == png2));

        IPicture jpg2 = fabricaImagenes.getPicture("jpg");
        System.out.println("jpg == jpg2 -> " + (jpg == jpg2));

        IPicture bmp2 = fabricaImagenes.getPicture( "bmp" );
        System.out.println("bmp == bmp2 -> " + (bmp == bmp2));

        System.out.println();
        System.out.println("||°Verificacion de especializacion de fabricas°||");
        try
        {
            fabricaDocumentos.getPicture("png");
        }
        catch(UnsupportedOperationException e)
        {
            System.out.println( "DocumentoFabrica -> " + e.getMessage());
        }

        try
        {
            fabricaImagenes.getDocumento("word");
        }
        catch(UnsupportedOperationException e)
        {
            System.out.println("PictureFabrica -> " + e.getMessage());
        }
    }
}
