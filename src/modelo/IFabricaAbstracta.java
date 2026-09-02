package modelo;

public interface IFabricaAbstracta {

    IDocumento getDocumento(String tipo);
    IPicture getPicture(String tipo);
}
