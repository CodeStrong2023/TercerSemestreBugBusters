package enumeraciones;


public enum Continentes {
    AFRICA(53, "1.2 billones"),
    EUROPA(46, "1.1 billones"),
    ASIA(41, "1.9 billones"),
    AMERICA(34, "150.2 billones"),
    OCEANIA(14, "1.2 billones");
    
    //Creamos los atributos
    private final int paises;
    private String habitantes;
    
    //Constructor
    Continentes(int paises, String habitantes){
        this.paises = paises;
        this.habitantes = habitantes;
    }
    
    // metodo get
    public int getPaises(){
        return this.paises;
    }
    
    public String getHabitantes(){
        return this.habitantes;
    }
}
