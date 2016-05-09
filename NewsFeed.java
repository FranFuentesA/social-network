import java.util.ArrayList;
/**
 * Write a description of class er here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class NewsFeed
{
    private ArrayList<MessagePost> messages;
    private ArrayList<PhotoPost> photos;

    /**
     * Constructor de la clase NewsFeed
     */
    public NewsFeed(){
        messages = new ArrayList<>();
        photos  = new ArrayList<>();
    }

    /**
     * Metodo que añade post de mensajes al muro
     */
    public void addMessagePost(MessagePost message)
    {
        messages.add(message);
    }

    /**
     * Metodo que añade post de fotos al muro
     */
    public void addPhotoPost(PhotoPost post)
    {
        photos.add(post);
    }

    /**
     * Metodo que muestra las colecciones de fotos y textos con su informacion correspondiente
     */
    public void show(){
        System.out.println("Post de mensajes");
        
        for (MessagePost mensaje: messages)
        {            
            mensaje.display();
        }
        
        System.out.println("Posts de fotos");
        
        for (PhotoPost foto: photos)
        {
            foto.display();
        }
    }
}