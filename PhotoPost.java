import java.util.ArrayList;

/**
 * Esta clase representa los mensajes publicados en la red social asociados a fotos.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhotoPost
{
    private String username;
    private String filename;
    private String caption;
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;

    /**
     * Constructor for objects of class PhotoPost
     */
    public PhotoPost(String author, String filename, String caption)
    {
        // initialise instance variables
       this.username = author;;
        this.filename = filename;
        this.caption = caption;
        this.timestamp = System.currentTimeMillis();
        this.likes = 0;
        comments = new ArrayList<String>();
    }

    /**
     *  Metodo que aumenta los likes de uno en uno
     */
    public void like()
    {
        likes++;
    }

    /**
     * Metodo que disminuye los likes de uno en uno, si es cero no realiza nada.
     */
    public void unlike()
    {
        if(likes > 0)
        {
            likes--;
        }
    }

    /**
     * Añade un comentario al mensaje     
     */
    public void addComment(String text)
    {
        comments.add(text);
    }

    /**
     * Metodo que devuelve el nombre del archivo
     */
    public String getImageFile()
    {
        return filename;
    }

    /**
     *  Metodo que devuelve el texto del mensaje     
     */
    public String getCaption()
    {
        return caption;
    }

    /**
     * Devuelve el timestamp del mensaje
     */
    public long getTimestamp()
    {
        return timestamp;
    }

    /**
     * Metodo que muestra todos los datos del post
     */
    public void display()
    {
        System.out.println("Autor " + username);
        System.out.println("Likes " + likes);;
        System.out.println(caption);       
        if(comments.size() == 0)
        {
            System.out.println( "Lo siento, no hay comentarios");
        }
        //mostramos todos los comentarios recorriendo toda la coleccion
        else
        {                      
            for( String comment : comments)
            {
                System.out.println(comment);
            }
        }
        
        System.out.println("Fecha de publicacion " + timeString(System.currentTimeMillis()));
    }

    /**
     * Metodo que muestra el tiempo por pantalla
     */
    private String timeString(long time){
        long tiempo = (time - timestamp);
        int segundos = (int)(tiempo/1000);
        int minutos = (segundos/60);
        segundos -= minutos * 60;  
        int horas = 0;
        String texto = minutos + " minutos " + segundos + " segundos";
        if (minutos > 59) {        
             horas = (minutos * 60);   
            texto += horas + " horas ";
        }
        if (horas > 23){            
            int dias = horas/24;   
            texto += dias + " dias ";
        }
        
        return texto;        
    }

}