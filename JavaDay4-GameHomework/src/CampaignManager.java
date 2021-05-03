
public class CampaignManager implements CampaignService{

	@Override
	public void newCampaign(Campaign campaign) {
		System.out.println(campaign.campaignName+" kampanyasý baþlamýþtýr.");
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.campaignName+ " kampanyasý baþarýyla güncellenmiþtir.");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.campaignName+ " kampanya geçersizdir.");
		
	}

	
}
