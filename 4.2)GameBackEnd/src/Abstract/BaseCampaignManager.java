package Abstract;

import Entities.Campaign;

public abstract class BaseCampaignManager implements CampaignService{

	@Override
	public void save(Campaign entity) {
		System.out.println(entity.getName() + " kampanyas� eklendi");
		
	}

	@Override
	public void update(Campaign entity) {
		System.out.println(entity.getName() + " kampanyas� g�ncellendi");
		
	}

	@Override
	public void delete(Campaign entity) {
		System.out.println(entity.getName() + " kampanyas� silindi");
		
	}
	
}
