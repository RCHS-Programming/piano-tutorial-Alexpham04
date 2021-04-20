import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    private boolean isDown;
    private String key;
    private String sound;
    
    /**
     * Create a new key.
     */
    public Key(String keyName, String soundFile )
    {
       key=keyName;
       sound=soundFile;
    }
     // methods omitted.
    /**
     * Do the action for this key.
     */
    
    public void act()
    {
        
         if ( !isDown&& Greenfoot.isKeyDown(key))
        {
            setImage("white-key-down.png");
            play ();
            isDown= true;
        }
        if ( isDown && !Greenfoot.isKeyDown(key))
        {
            setImage("white-key.png");
            isDown=false;
         }
        }
     /*
      * play the note of this key  
      */
     public void play()
     {
         Greenfoot.playSound (sound);
     }
}