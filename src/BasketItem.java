public class BasketItem {
    private Product product;
    private int quantity;

    /**
     * Constructeur
     * @param product id de l'objet
     * @param iQuantity quantité de chaque objet
     */
    public BasketItem(Product product, int iQuantity){
        this.product = product;
        this.quantity = iQuantity;
    }

    public double getItemPrice() {

        return product.getPrice() * quantity;
    }

}
