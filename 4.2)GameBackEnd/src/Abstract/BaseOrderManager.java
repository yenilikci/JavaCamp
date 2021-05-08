package Abstract;

import Entities.Order;

public abstract class BaseOrderManager implements OrderService{

	@Override
	public void save(Order entity) {
		System.out.println(entity.getId() + " id'li sipari� eklendi");
	}

	@Override
	public void update(Order entity) {
		System.out.println(entity.getId() + " id'li sipari� g�ncellendi");
	}

	@Override
	public void delete(Order entity) {
		System.out.println(entity.getId() + " id'li sipari� silindi");
	}
	
}
