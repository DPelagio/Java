package objects;

public class LegalIdentifiers {
    /* Cannot be a Java Keyword    */
    //char int;
    int isLegal;

    /* Composed of only Unicode characters, numbers, currency
     * symbols, and connecting characters (underscores) */
    //String _*illegal;
    //public void ille@gal(){};
    String hello123world;
    public void legal123(){};

    /* Must stat with a letter, a currency character ($),
     * or a connecting character (underscore) */
    //long 5_is_illegal;
    int $islegal;
    long _2_x_legal;
    public void _legal(){};

    // Case sensitive
    int car;
    int Car;

}
