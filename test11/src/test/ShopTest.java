package test;

import main.Customer;
import main.ShangguanShop;
import main.WuyuanShop;
public class ShopTest {
public static void main(String[] args){
	Customer customer=new Customer();
	System.out.println("顾客购买以下商品：");
	customer.shopping(new ShangguanShop());
	customer.shopping(new WuyuanShop());
}
}
