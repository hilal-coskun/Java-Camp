
public class CampaignManager implements CampaignService{

	@Override
	public void newCampaign(Campaign campaign) {
		System.out.println(campaign.campaignName+" kampanyas� ba�lam��t�r.");
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.campaignName+ " kampanyas� ba�ar�yla g�ncellenmi�tir.");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.campaignName+ " kampanya ge�ersizdir.");
		
	}

	
}
