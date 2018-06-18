public class Basket {

    private BasketItem[] basketItems;
    //private enum status;

    /**
     * Constructeur
     * @param iBasketItemSize objets présents en stock et qui peuvent être ajoutés au panier
     */
    public Basket(int iBasketItemSize){
        this.basketItems = new BasketItem[iBasketItemSize];
        //this.status = eStatus;
    }

    public double getTotalPrice(){
        double totalPrice = 0;
        for(int i = 0;i < basketItems.length; i++){

            totalPrice += basketItems[i].getItemPrice();
        }
        System.out.println(totalPrice);
        return totalPrice;
    }
}
