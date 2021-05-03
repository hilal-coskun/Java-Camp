
public class CampaignManager implements CampaignService{

	@Override
	public void newCampaign(Campaign campaign) {
		System.out.println(campaign.campaignName+" kampanyası başlamıştır.");
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.campaignName+ " kampanyası başarıyla güncellenmiştir.");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.campaignName+ " kampanya geçersizdir.");
		
	}

	
}
