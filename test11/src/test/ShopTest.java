package test;

import main.Customer;
import main.ShangguanShop;
import main.WuyuanShop;
public class ShopTest {
public static void main(String[] args){
	Customer customer=new Customer();
	System.out.println("�˿͹���������Ʒ��");
	customer.shopping(new ShangguanShop());
	customer.shopping(new WuyuanShop());
}
}
