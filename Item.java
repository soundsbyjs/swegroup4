public class Item {
    protected String itemName;
    protected float itemPrice;
    protected float itemPop;
    protected String itemDesc;
    protected String itemCate;

    public Item (String newName, float newPrice, String newDesc, String newCate) {
        itemName = newName;
        itemPrice = newPrice;
        itemPop = 0;
        itemDesc = newDesc;
        itemCate = newCate;
        ///sets variables for the item
    }
    public String getName()
    {
        return itemName;
    }
    public float getPrice()
    {
        return itemPrice;
    }
    public float getPop()
    {
        return itemPop;
    }
    public void setPop(float newPop)
    {
        itemPop = newPop;
    }
    public String getDesc()
    {
        return itemDesc;
    }
    public String getCate()
    {
        return itemCate;
    }
}
