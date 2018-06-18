public class Customer extends User {
    private double budget;
    private Basket[] basket;
    /**
     * Constructeur
     * @param dBudget budget de l'acheteur
     */
    public Customer(double dBudget){

        this.budget = dBudget;
    }

    public boolean addToCart(Product product, int quantity){
        return false;
    }

}