import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (yo ur name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private final int RECTANGLE_WIDTH = 50;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        
        //prepareWorldFor();
        //prepareWorldWhile();
        prepareWorldDoWhile();
    }
    
    /**
     * prepareWorldFor creates a rainbow by drawing 
     * rectangles of various colours using a for-loop.
     * 
     * @param None There are no parameters
     * @return Nothing is being returned
     */
    private void prepareWorldFor()
    {
        for (int i = 0; i < getWidth() / RECTANGLE_WIDTH; i++)
        {
            if (i % 7 == 0)
            {
                getBackground().setColor(Color.RED);
            }
            else if(i % 7 == 1)
            {
                getBackground().setColor(Color.ORANGE);
            }
            else if(i % 7 == 2)
            {
                getBackground().setColor(Color.YELLOW);
            }
            else if(i % 7 == 3)
            {
                getBackground().setColor(Color.GREEN);
            }
            else if(i % 7 == 4)
            {
                getBackground().setColor(Color.BLUE);
            }
            else if(i % 7 == 5)
            {
                getBackground().setColor(new Color (111, 0, 255));
            }
            else if(i % 7 == 6)
            {
                getBackground().setColor(new Color (143, 0, 255));
            }
            
            getBackground().fillRect(i * RECTANGLE_WIDTH, 0, RECTANGLE_WIDTH, getHeight());
        }
    }
    
    /**
     * prepareWorldWhile will fill the world with a rainbow using while loops
     * 
     * @param None There are no parameters
     * @return Nothing is returned
     */
    private void prepareWorldWhile()
    {
        int index = 0;
        
        while (index < getWidth() / RECTANGLE_WIDTH)
        {
            if (index % 7 == 0)
            {
                getBackground().setColor(Color.RED);
            }
            else if(index % 7 == 1)
            {
                getBackground().setColor(Color.ORANGE);
            }
            else if(index % 7 == 2)
            {
                getBackground().setColor(Color.YELLOW);
            }
            else if(index % 7 == 3)
            {
                getBackground().setColor(Color.GREEN);
            }
            else if(index % 7 == 4)
            {
                getBackground().setColor(Color.BLUE);
            }
            else if(index % 7 == 5)
            {
                getBackground().setColor(new Color (111, 0, 255));
            }
            else if(index % 7 == 6)
            {
                getBackground().setColor(new Color (143, 0, 255));
            }
            
            getBackground().fillRect(index* RECTANGLE_WIDTH, 0, RECTANGLE_WIDTH, getHeight());
            index++;
        }
    }
    
    private void prepareWorldDoWhile()
    {
        int index2 = 0;
        
        do 
        {
            if (index2 % 7 == 0)
            {
                getBackground().setColor(Color.RED);
            }
            else if(index2 % 7 == 1)
            {
                getBackground().setColor(Color.ORANGE);
            }
            else if(index2 % 7 == 2)
            {
                getBackground().setColor(Color.YELLOW);
            }
            else if(index2 % 7 == 3)
            {
                getBackground().setColor(Color.GREEN);
            }
            else if(index2 % 7 == 4)
            {
                getBackground().setColor(Color.BLUE);
            }
            else if(index2 % 7 == 5)
            {
                getBackground().setColor(new Color (111, 0, 255));
            }
            else if(index2 % 7 == 6)
            {
                getBackground().setColor(new Color (143, 0, 255));
            }
            
            getBackground().fillRect(index2* RECTANGLE_WIDTH, 0, RECTANGLE_WIDTH, getHeight());
            index2++;
        }while (index2 < getWidth() / RECTANGLE_WIDTH);
    }
}
