package Concrete;

import Abstract.BaseOrderManager;
import Abstract.CampaignService;
import Abstract.ProductService;
import Abstract.UserService;
import Entities.Order;

public class OrderManager extends BaseOrderManager {

	private UserService _userService;
	private ProductService _productService;
	private CampaignService _campaignService;

	public OrderManager(UserService userService, ProductService productService, CampaignService campaignService) {
		_userService = userService;
		_productService = productService;
		_campaignService = campaignService;
	}

	@Override
	public void save(int id, int gamerId, int productId, int campaignId, int amount, double unitPrice,
			double percentageOfDiscount) {
		Order order = new Order(id, gamerId, productId, campaignId, amount, unitPrice, percentageOfDiscount);
		System.out.println("\nYeni Sipari� Olu�turuldu");
		System.out.println("-----------------------------------------------------");
		System.out.println("Sipari� detaylar�");
		System.out.println("Sipari� id: " + id);
		System.out.println("Oyuncu id: " + gamerId);
		System.out.println("�r�n id: " + productId);
		System.out.println("Kampanya id: " + campaignId);
		System.out.println("Miktar: " + amount);
		System.out.println("Birim fiyat: " + unitPrice);
		System.out.println("�ndirim y�zdesi: " + percentageOfDiscount);
		double discountedPrice = (double)amount * (unitPrice - (unitPrice * percentageOfDiscount) / 100);
		System.out.println("�ndirimli son fiyat: " + discountedPrice);
		System.out.println("-----------------------------------------------------");
	}

	@Override
	public void update(int id, int gamerId, int productId, int campaignId, int amount, double unitPrice,
			double percentageOfDiscount) {
		System.out.println("\nSipari� G�ncellendi");
		System.out.println("-----------------------------------------------------");
		System.out.println("Sipari� detaylar�");
		System.out.println("Sipari� id: " + id);
		System.out.println("Oyuncu id: " + gamerId);
		System.out.println("�r�n id: " + productId);
		System.out.println("Kampanya id: " + campaignId);
		System.out.println("Miktar: " + amount);
		System.out.println("Birim fiyat: " + unitPrice);
		System.out.println("�ndirim y�zdesi: " + percentageOfDiscount);
		double discountedPrice = (double)amount * (unitPrice - (unitPrice * percentageOfDiscount) / 100);
		System.out.println("�ndirimli son fiyat: " + discountedPrice);
		System.out.println("-----------------------------------------------------");
	}

	@Override
	public void delete(int id) {
		System.out.println(id + " id'li sipari� silindi");
	}

}
