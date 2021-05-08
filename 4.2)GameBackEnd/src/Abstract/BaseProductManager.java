package Abstract;

import Entities.Product;

public abstract class BaseProductManager implements ProductService {

	@Override
	public void save(Product entity) {
		System.out.println(entity.getName() + " �r�n� eklendi");
	}

	@Override
	public void update(Product entity) {
		System.out.println(entity.getName() + " �r�n� g�ncellendi");
	}

	@Override
	public void delete(Product entity) {
		System.out.println(entity.getName() + " �r�n� silindi");
	}
	

}
