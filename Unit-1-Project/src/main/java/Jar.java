import java.util.Random;

public class Jar {
    private String itemType;
    private int maxItems;
    private int presentNumber;

    public Jar(String itemType, int maxItems) {
        this.itemType = itemType;
        this.maxItems = maxItems;
    }

    public String getItemType() {
        return itemType;
    }
    
    public int getMaxItems() {
        return maxItems;
    }

    public void fill() {
        Random random = new Random();
        presentNumber = random.nextInt(maxItems) + 1;
    }

    public int getPresentNumber() {
        return presentNumber;
    }
}
