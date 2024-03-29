import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kolling
 * @version: 0.1
 */
public class Piano extends World
{
   private String[] whiteKeys= 
   {"a","s","d","f","g","h","j","K","l",";","'","\\"};
   private String[] whiteNotes=
   {"3c","3d","3e","3f","3g","3a","3b","4c","4d","4e","4f","4g"};
   // constructor and methods omitted 
    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(800, 340, 1);
        
        for (int i=0; i < whiteKeys.length; i++)
        {
            addObject(new Key(whiteKeys[i], "3a.wav"), 54+i*63,140);
        }                                                                                                                                                                 
    }
}
