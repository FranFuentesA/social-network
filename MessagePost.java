import java.util.ArrayList;
/**
 * Write a description of class er here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class  MessagePost {
    private String username;
    private String message;
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;
    /**
     * Constructor de la clase
     */   
    public MessagePost (String author, String text)
    {
        this.username = author;
        this.message = text;
        this.timestamp = System.currentTimeMillis();
        this.likes = 0;
        comments = new ArrayList<>();
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
     * @param text el comentario a añadir
     */
    public void addComment(String text)
    {
        comments.add(text);
    }

    /**
     * Metodo que devuelve todo el texto del post     
     **/
    public String getText()
    {
        return message;
    }

    /**
     * Metodo que devuelve el momento temporal en el que fue creado
     */
    public long getTimeStamp()
    {
        return timestamp;
    }   

    /**
     * Metodo que muestra todos los datos del post
     */
    public void display()
    {
        System.out.println("Autor " + username);
        System.out.println("Likes " + likes);
        // si la colleccion esta vacia, informamos por pantalla
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
        
        // Mostramos por pantalla la informacion a traves del siguiente metodo:
        System.out.println(timeString(System.currentTimeMillis()));

    }

    /**
     * Metodo que muestra el tiempo por pantalla
     */
    private String timeString(long time){
        long tiempo = (time - timestamp);
        int segundos = (int)(tiempo/1000);
        int minutos = (segundos/60);
        segundos -= minutos*60;  
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

