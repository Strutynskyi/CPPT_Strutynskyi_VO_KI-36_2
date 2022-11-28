import java.util.ArrayList;
import java.util.List;

public class LandPlot<T extends Building>
{
    private final List<T> arr;

    public LandPlot()
    {
        arr = new ArrayList<T>();
    }

    public T FindMin()
    {
        if (arr.isEmpty())
        {
            return null;
        }
        else
        {
            T min = arr.get(0);
            for (int i = 1; i < arr.size(); i++)
            {
                if (arr.get(i).GetSquare() < min.GetSquare())
                {
                    min = arr.get(i);
                }
            }
            return min;
        }
    }

    public void AddItem(T item)
    {
        arr.add(item);
        var index = arr.indexOf(item);
        System.out.print("Element was added: index - " + index + "; ");
        item.PrintInfo();
    }

    public void DeleteItem(int i)
    {
        System.out.print("Element on index " + i + " was deleted: ");
        arr.get(i).PrintInfo();
        arr.remove(i);
    }

    public void PrintAllItems()
    {
        for(T el : arr)
        {
            el.PrintInfo();
        }
    }
}
