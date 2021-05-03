
public class Campaign {

	String campaignId;
	String campaignName;
	String campaignDiscount;
	
	public Campaign() {
		
	}
	
	public Campaign(String campaignId, String campaignName, String campaignDiscount) {
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.campaignDiscount = campaignDiscount;
	}


	public String getCampaignId() {
		return campaignId;
	}


	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}


	public String getCampaignName() {
		return campaignName;
	}


	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}


	public String getCampaignDiscount() {
		return campaignDiscount;
	}


	public void setCampaignDiscount(String campaignDiscount) {
		this.campaignDiscount = campaignDiscount;
	}
	
	
}
