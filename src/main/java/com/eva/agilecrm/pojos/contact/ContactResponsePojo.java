 package com.eva.agilecrm.pojos.contact;

import java.util.List;

public class ContactResponsePojo{
//    public ContactResponsePojo(long id, String type, int created_time, int updated_time, int last_contacted,
//			int last_emailed, int last_campaign_emaild, int last_called, int viewed_time, Viewed viewed, int star_value,
//			int lead_score, String klout_score, List<String> tags, List<TagsWithTimePojo> tagsWithTime,
//			List<Property> properties, List<Object> campaignStatus, String entity_type, String source,
//			List<Object> unsubscribeStatus, List<Object> emailBounceStatus, int formId, List<Object> browserId,
//			int lead_source_id, int lead_status_id, boolean is_lead_converted, int lead_converted_time,
//			boolean is_duplicate_existed, int trashed_time, int restored_time, boolean is_duplicate_verification_failed,
//			boolean is_client_import, boolean concurrent_save_allowed, OwnerPojo owner) {
//		super();
//		this.id = id;
//		this.type = type;
//		this.created_time = created_time;
//		this.updated_time = updated_time;
//		this.last_contacted = last_contacted;
//		this.last_emailed = last_emailed;
//		this.last_campaign_emaild = last_campaign_emaild;
//		this.last_called = last_called;
//		this.viewed_time = viewed_time;
//		this.viewed = viewed;
//		this.star_value = star_value;
//		this.lead_score = lead_score;
//		this.klout_score = klout_score;
//		this.tags = tags;
//		this.tagsWithTime = tagsWithTime;
//		this.properties = properties;
//		this.campaignStatus = campaignStatus;
//		this.entity_type = entity_type;
//		this.source = source;
//		this.unsubscribeStatus = unsubscribeStatus;
//		this.emailBounceStatus = emailBounceStatus;
//		this.formId = formId;
//		this.browserId = browserId;
//		this.lead_source_id = lead_source_id;
//		this.lead_status_id = lead_status_id;
//		this.is_lead_converted = is_lead_converted;
//		this.lead_converted_time = lead_converted_time;
//		this.is_duplicate_existed = is_duplicate_existed;
//		this.trashed_time = trashed_time;
//		this.restored_time = restored_time;
//		this.is_duplicate_verification_failed = is_duplicate_verification_failed;
//		this.is_client_import = is_client_import;
//		this.concurrent_save_allowed = concurrent_save_allowed;
//		this.owner = owner;
//	}
	
	
	public ContactResponsePojo(long id, String type, int created_time, int updated_time, int last_contacted,
			int last_emailed, int last_campaign_emaild, int last_called, int viewed_time, Viewed viewed, int star_value,
			int lead_score, String klout_score, List<String> tags, List<TagsWithTimePojo> tagsWithTime,
			List<Property> properties, List<Object> campaignStatus, String entity_type, String source,
			List<Object> unsubscribeStatus, List<Object> emailBounceStatus, int formId, List<Object> browserId,
			int lead_source_id, int lead_status_id, boolean is_lead_converted, int lead_converted_time,
			boolean is_duplicate_existed, int trashed_time, int restored_time, boolean is_duplicate_verification_failed,
			boolean is_client_import, boolean concurrent_save_allowed, OwnerPojo owner) {
		super();
		this.id = id;
		this.type = type;
		this.created_time = created_time;
		this.updated_time = updated_time;
		this.last_contacted = last_contacted;
		this.last_emailed = last_emailed;
		this.last_campaign_emaild = last_campaign_emaild;
		this.last_called = last_called;
		this.viewed_time = viewed_time;
		this.viewed = viewed;
		this.star_value = star_value;
		this.lead_score = lead_score;
		this.klout_score = klout_score;
		this.tags = tags;
		this.tagsWithTime = tagsWithTime;
		this.properties = properties;
		this.campaignStatus = campaignStatus;
		this.entity_type = entity_type;
		this.source = source;
		this.unsubscribeStatus = unsubscribeStatus;
		this.emailBounceStatus = emailBounceStatus;
		this.formId = formId;
		this.browserId = browserId;
		this.lead_source_id = lead_source_id;
		this.lead_status_id = lead_status_id;
		this.is_lead_converted = is_lead_converted;
		this.lead_converted_time = lead_converted_time;
		this.is_duplicate_existed = is_duplicate_existed;
		this.trashed_time = trashed_time;
		this.restored_time = restored_time;
		this.is_duplicate_verification_failed = is_duplicate_verification_failed;
		this.is_client_import = is_client_import;
		this.concurrent_save_allowed = concurrent_save_allowed;
		this.owner = owner;
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCreated_time() {
		return created_time;
	}
	public void setCreated_time(int created_time) {
		this.created_time = created_time;
	}
	public int getUpdated_time() {
		return updated_time;
	}
	public void setUpdated_time(int updated_time) {
		this.updated_time = updated_time;
	}
	public int getLast_contacted() {
		return last_contacted;
	}
	public void setLast_contacted(int last_contacted) {
		this.last_contacted = last_contacted;
	}
	public int getLast_emailed() {
		return last_emailed;
	}
	public void setLast_emailed(int last_emailed) {
		this.last_emailed = last_emailed;
	}
	public int getLast_campaign_emaild() {
		return last_campaign_emaild;
	}
	public void setLast_campaign_emaild(int last_campaign_emaild) {
		this.last_campaign_emaild = last_campaign_emaild;
	}
	public int getLast_called() {
		return last_called;
	}
	public void setLast_called(int last_called) {
		this.last_called = last_called;
	}
	public int getViewed_time() {
		return viewed_time;
	}
	public void setViewed_time(int viewed_time) {
		this.viewed_time = viewed_time;
	}
	public Viewed getViewed() {
		return viewed;
	}
	public void setViewed(Viewed viewed) {
		this.viewed = viewed;
	}
	public int getStar_value() {
		return star_value;
	}
	public void setStar_value(int star_value) {
		this.star_value = star_value;
	}
	public int getLead_score() {
		return lead_score;
	}
	public void setLead_score(int lead_score) {
		this.lead_score = lead_score;
	}
	public String getKlout_score() {
		return klout_score;
	}
	public void setKlout_score(String klout_score) {
		this.klout_score = klout_score;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public List<TagsWithTimePojo> getTagsWithTime() {
		return tagsWithTime;
	}
	public void setTagsWithTime(List<TagsWithTimePojo> tagsWithTime) {
		this.tagsWithTime = tagsWithTime;
	}
	public List<Property> getProperties() {
		return properties;
	}
	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}
	public List<Object> getCampaignStatus() {
		return campaignStatus;
	}
	public void setCampaignStatus(List<Object> campaignStatus) {
		this.campaignStatus = campaignStatus;
	}
	public String getEntity_type() {
		return entity_type;
	}
	public void setEntity_type(String entity_type) {
		this.entity_type = entity_type;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public List<Object> getUnsubscribeStatus() {
		return unsubscribeStatus;
	}
	public void setUnsubscribeStatus(List<Object> unsubscribeStatus) {
		this.unsubscribeStatus = unsubscribeStatus;
	}
	public List<Object> getEmailBounceStatus() {
		return emailBounceStatus;
	}
	public void setEmailBounceStatus(List<Object> emailBounceStatus) {
		this.emailBounceStatus = emailBounceStatus;
	}
	public int getFormId() {
		return formId;
	}
	public void setFormId(int formId) {
		this.formId = formId;
	}
	public List<Object> getBrowserId() {
		return browserId;
	}
	public void setBrowserId(List<Object> browserId) {
		this.browserId = browserId;
	}
	public int getLead_source_id() {
		return lead_source_id;
	}
	public void setLead_source_id(int lead_source_id) {
		this.lead_source_id = lead_source_id;
	}
	public int getLead_status_id() {
		return lead_status_id;
	}
	public void setLead_status_id(int lead_status_id) {
		this.lead_status_id = lead_status_id;
	}
	public boolean isIs_lead_converted() {
		return is_lead_converted;
	}
	public void setIs_lead_converted(boolean is_lead_converted) {
		this.is_lead_converted = is_lead_converted;
	}
	public int getLead_converted_time() {
		return lead_converted_time;
	}
	public void setLead_converted_time(int lead_converted_time) {
		this.lead_converted_time = lead_converted_time;
	}
	public boolean isIs_duplicate_existed() {
		return is_duplicate_existed;
	}
	public void setIs_duplicate_existed(boolean is_duplicate_existed) {
		this.is_duplicate_existed = is_duplicate_existed;
	}
	public int getTrashed_time() {
		return trashed_time;
	}
	public void setTrashed_time(int trashed_time) {
		this.trashed_time = trashed_time;
	}
	public int getRestored_time() {
		return restored_time;
	}
	public void setRestored_time(int restored_time) {
		this.restored_time = restored_time;
	}
	public boolean isIs_duplicate_verification_failed() {
		return is_duplicate_verification_failed;
	}
	public void setIs_duplicate_verification_failed(boolean is_duplicate_verification_failed) {
		this.is_duplicate_verification_failed = is_duplicate_verification_failed;
	}
	public boolean isIs_client_import() {
		return is_client_import;
	}
	public void setIs_client_import(boolean is_client_import) {
		this.is_client_import = is_client_import;
	}
	public boolean isConcurrent_save_allowed() {
		return concurrent_save_allowed;
	}
	public void setConcurrent_save_allowed(boolean concurrent_save_allowed) {
		this.concurrent_save_allowed = concurrent_save_allowed;
	}
	public OwnerPojo getOwner() {
		return owner;
	}
	public void setOwner(OwnerPojo owner) {
		this.owner = owner;
	}
	public long id;
    public String type;
    public int created_time;
    public int updated_time;
    public int last_contacted;
    public int last_emailed;
    public int last_campaign_emaild;
    public int last_called;
    public int viewed_time;
    public Viewed viewed;
    public int star_value;
    public int lead_score;
    public String klout_score;
    public List<String> tags;
    public List<TagsWithTimePojo> tagsWithTime;
    public List<Property> properties;
    public List<Object> campaignStatus;
    public String entity_type;
    public String source;
    public List<Object> unsubscribeStatus;
    public List<Object> emailBounceStatus;
    public int formId;
    public List<Object> browserId;
    public int lead_source_id;
    public int lead_status_id;
    public boolean is_lead_converted;
    public int lead_converted_time;
    public boolean is_duplicate_existed;
    public int trashed_time;
    public int restored_time;
    public boolean is_duplicate_verification_failed;
    public boolean is_client_import;
    public boolean concurrent_save_allowed;
    public OwnerPojo owner;
}





