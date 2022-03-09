package uaslp.objetos.parcial1.examen.pos;

import java.util.ArrayList;

public class PointOfSale {
    ArrayList<CartItem> items;

    public PointOfSale(){
        items = new ArrayList<>();
    }

    public void addToCart(int cant, Product papas) {

        for(CartItem item:items){
            if(item.getProductName().equals(papas.getNombre())){
                item.setQuantity(item.getQuantity()+cant);
                return;
            }
        }
        CartItem cartItem = new CartItem();

        cartItem.setQuantity(cant);
        cartItem.setProduct(papas);

        items.add(cartItem);
    }

    public ArrayList<CartItem> getProducts(){
        return items;
    }

    public float getTotal() {
        float tot=0;

        for(CartItem item:items){
            tot += item.getAmount() * item.getQuantity();
        }
        return tot;
    }

    public int getCountByName(String name) {
        for(CartItem item:items){
            if(name.equals(item.getProductName())){
                return item.getQuantity();
            }
        }
        return 0;
    }


}
