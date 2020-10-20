package shape;

import java.util.Comparator;

public class SortByArea implements Comparator<Rectangle>{
    public int compare(Rectangle a, Rectangle b) 
    { 
        return (int) (a.area()-b.area()); 
    } 
}