public class Product {
    private int id;
    private int stock;
    private float price;
    private String name;

    /**
     * Constructeur
     * @param iId id du produit
     * @param iStock quantité en stock
     * @param iPrice prix du produit
     * @param sName nom du produit
     */

    public Product(int iId, int iStock, int iPrice, String sName){
        this.id = iId;
        this.stock = iStock;
        this.price = iPrice;
        this.name = sName;
    }

    public int getStock(){
        return stock;
    }

    public float getPrice(){
        return price;
    }
}
