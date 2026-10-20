public class CanalTelemetria {
    private final int identificadornumerico;
    private String nombreDescriptivo;

    //Atributos static
    private static int contadorCanales = 0;
    private static int ultimovalor = 0;


    //Creo el constructor.
    public CanalTelemetria(String nombreDescriptivo, int identificadornumerico) {
        if (identificadornumerico < 0) {
            throw new IllegalArgumentException("Error: El identificador debe ser positivo.");
        }

        this.identificadornumerico = identificadornumerico;
        ultimovalor = ultimovalor;
    }


    //Setters

    public void setNombreDescriptivo(String nombreDescriptivo) {
        this.nombreDescriptivo = nombreDescriptivo;
    }


    //Getters

    public int getIdentificadornumerico() {
        return identificadornumerico;
    }

    public String getNombreDescriptivo(){
        return nombreDescriptivo;
    }

    public int getUltimovalor(){
        return ultimovalor;
    }


}




