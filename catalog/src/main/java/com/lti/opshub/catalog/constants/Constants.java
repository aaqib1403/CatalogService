package com.lti.opshub.catalog.constants;

/**
 * @author Mrunali Chopade
 *
 */
public class Constants {

	public static final String NOT_FOUND = "Not found";

	public static final String CONFIG = "configs";

	// Rest Constants

	/**
	 * 
	 * @author Mrunali Chopade - Constant class contains Seperator constants
	 */

	public class SeperatorConstants {

		private SeperatorConstants() {
		}

		/**
		 * Slash
		 */
		public static final String SLASH = "/";

		/**
		 * DOT
		 */
		public static final String DOT = ".";

	}

	public class ResourceURL {
		private ResourceURL() {
		}

		public static final String ROOT = "v1";
		public static final String ACCESS = "v1/access";
		public static final String ENHANCE = "v1/enhance";
		public static final String TOPICS = "/topics";
		public static final String ID = "id";

		public static final String USER_TOPICS = "/user/topics";
		public static final String ADD_USER_TOPICS = "/user/topic";
		public static final String DELETE_USER_TOPICS = "/user/topic/{id}";

		// Enhance service
		public static final String DISCUSSION = "comments";
		public static final String COMMENTS = "comments";
		public static final String TAGS = "tags";
		public static final String RATINGS = "ratings";

		// Access service
		public static final String RECENTLY_VIEWED = "recentlyviewed";
		public static final String RECOMMENDATIONS = "recommendations";
		public static final String RECENTLY_PUBLISHED = "recentlypublished";
		public static final String MARKETPLACE = "marketplace";

		public static final String ASSET_DEATILS_BY_ID = "assets/{id}";
		public static final String ASSET_RELATED_DEATILS_BY_ID = "related/assets/{id}";
		public static final String ASSET_COMMENTS_BY_ID = "comments/{assetId}";

		// Sinequa service end points
		public static final String SINEQUA_RECENTLY_VIEWED = "api/v1/recentlyviewed";
		public static final String SINEQUA_RECOMMENDATIONS = "api/v1/recommendations";
		public static final String SINEQUA_RECENTLY_PUBLISHED = "api/v1/recentlypublished";
		public static final String SINEQUA_TOPIC_INTERESTED = "api/v1/topicinterested";
		public static final String SINEQUA_DOMAIN_FILTER = "api/v1/domainfilter";
		public static final String SINEQUA_MARKETPLACE = "sinequa-search-v1/api/v1/query";

		// Collibra service end points
		public static final String COLLIBRA_RECENTLY_VIEWED = "navigation/recently_viewed?offset=%s&limit=%s";
		public static final String COLLIBRA_RECOMMENDATIONS = "navigation/most_viewed?offset=%s&limit=%s";
		public static final String COLLIBRA_RECENTLY_PUBLISHED = "api/v1/recentlypublished";
		public static final String COLLIBRA_TOPIC_INTERESTED = "api/v1/topicinterested";

		public static final String COLLIBRA_DOMAIN_FILTER = "communities?offset=%s&limit=%s&nameMatchMode=ANYWHERE&excludeMeta=true&sortField=NAME&sortOrder=ASC";
		public static final String COLLIBRA_ASSET_FILTER = "assetTypes?offset=%s&limit=%s&nameMatchMode=ANYWHERE&excludeMeta=true&topLevel=false";
		public static final String COLLIBRA_MARKETPLACE = "api/v1/marketplace";
		public static final String COLLIBRA_OUTPUT_MODEL_REQUEST_API = "outputModule/export/json?validationEnabled=false";

		public static final String COLLIBRA_GET_TOPICS = "assets?offset=0&limit=0&nameMatchMode=ANYWHERE&typeId=00000000-0000-0000-0000-000000031105&typeInheritance=false&excludeMeta=true&sortField=NAME&sortOrder=ASC";
		public static final String COLLIBRA_GET_RELATIONS = "relations?offset=0&limit=0&sourceId=%s&sourceTargetLogicalOperator=%s";

		public static final String COLLIBRA_GET_COMMENTS = "comments?offset=0&limit=0&baseResourceId=%s&rootComment=true&sortOrder=DESC";
		public static final String COLLIBRA_GET_USER_DETAILS = "users/";
		public static final String TOPIC_INTRESTED_ASSETS = "topic/asset";
		public static final String CREATE_COLLECTIONS = "createcollection";
		public static final String RENAME_COLLECTIONS = "renamecollection";
		public static final String MOVE_ASSETS = "moveasset";
		public static final String GETALL_COLLECTIONS = "getallcollection";
		public static final String GETALL_COLLECTIONS_BY_ID = "getallcollectionbyid";
		public static final String DELETE_COLLECTION = "deletecollection";
		public static final String DOMAINFILTER = "domainfilter";
		public static final String ASSETFILTER = "assetfilter";
		public static final String CREATE_BOOKMARK = "createbookmark";
		public static final String GET_BOOKMARKS_OF_ALL_COLLECTION = "getbookmarksofallcollection";
		public static final String GET_BOOKMARKS_BY_COLLECTION_ID = "getbookmarksbycollectionid";
		public static final String UNBOOKMARK_ASSET = "unbookmarkasset";
		public static final String FOLLOW_USER = "followuser";
		public static final String GET_FOLLOWED_USER_LIST = "getfolloweduserlist";
		public static final String UN_FOLLOW_USER = "unfollowuser";

		public static final String ACTIVITY_FEED = "activity-feed";
		public static final String RECENT_ACTIVITY_ON_ASSET = "recentactivityonasset";

		// profile service
		public static final String USER_DETAILS = "v1/graph-user-details?domain=%s&ntid=%s";
		public static final String USER_ID = "userId";
		public static final String PROFILE_PHOTOES = "v1/graph-photo";

		//public static final String COLLIBRA_GET_USER_ACTIVITIES = "activities?offset=%s&limit=%s&involvedPeopleIds=%s&resourceTypes=Asset&callCountEnabled=false";
		public static final String COLLIBRA_GET_USER_ACTIVITIES = "activities?offset=%s&limit=%s";
		public static final String RESOURCE_TYPES_CALL_COUNT = "&resourceTypes=Asset&callCountEnabled=false";
		public static final String COLLIBRA_GET_USER_DETAILS_API = "users?offset=0&limit=1&name=%s";
		
		//Catalog service
		public static final String CREATEASSETS = "createassets";
	}

	public class RestConstants {

		private RestConstants() {

		}

		public static final String SUCCESS = "success";
		public static final String NOT_FOUND = "Not found";
		public static final String HEADER_AUTH_USERNAME = "AuthToken";
		public static final String AUTHORIZATION = "Authorization";
		public static final String APPLICATION_JSON = "application/json";
		public static final String HEADER_AUTH_USERID = "UserId";
	}

	public class OutputModelConstants {

		private OutputModelConstants() {

		}

		public static final String OUTPUT_MODEL_COMMON_REQUEST_FILE = "configs/OutputModelRequest_Common.json";
		public static final String TABLE_VIEW_CONFIG = "TableViewConfig";
		public static final String RESOURCES = "Resources";
		public static final String TERM = "Term";
		public static final String AND = "AND";
		public static final String FILTER = "Filter";
		public static final String ORDER = "Order";
		public static final String DISPLAY_LENGTH = "displayLength";
		public static final String DISPLAY_START = "displayStart";
		public static final String OR = "OR";

		public static final String TOTAL_DISPLAY_RECORDS = "iTotalDisplayRecords";
		public static final String TOTAL_RECORDS = "iTotalRecords";
		public static final String DATA = "aaData";
		public static final String FULL_NAME = "FullName";
		public static final String DISPLAY_NAME = "DisplayName";
		public static final String ID = "Id";
		public static final String TAG = "Tag";
		public static final String TAG_NAME = "Tag_Name";
		public static final String TAG_ID = "Tag_Id";
		public static final String DOMAIN_NAME = "Domain_Name";
		public static final String DOMAIN_ID = "Domain_Id";
		public static final String STATUS_NAME = "Status_Name";
		public static final String STATUS_ID = "Status_Id";
		public static final String ASSETTYPE_NAME = "AssetType_Name";
		public static final String ASSETTYPE_ID = "AssetType_Id";
		public static final String CREATED_ON = "CreatedOn";
		public static final String CREATED_BY_USERNAME = "CreatedBy_UserName";
		public static final String CREATED_BY_FIRSTNAME = "CreatedBy_FirstName";
		public static final String CREATED_BY_LASTNAME = "CreatedBy_LastName";
		public static final String CREATED_BY_ID = "CreatedBy_Id";
		public static final String LAST_MODIFIED_ON = "LastModifiedOn";
		public static final String AVG_RATING = "AvgRating";
		public static final String FIELD = "Field";
		public static final String FIELD_NAME = "name";
		public static final String VALUES = "values";
		public static final String VALUE = "value";
		public static final String OPERATOR = "operator";
		public static final String IN = "IN";
		public static final String BETWEEN = "BETWEEN";
		public static final String DESC = "DESC";
		public static final String DOMAIN_COMMUNITY_ID = "Domain_Community_Id";
		public static final String DOMAIN_COMMUNITY_NAME = "Domain_Community_Name";
		public static final String EQUALS = "EQUALS";
		public static final String STARTS_WITH = "STARTS_WITH";
		public static final String OWNER_DEATILS_RESPONSIBILITY_KEY = "Responsibility_00000000-0000-0000-0000-000000005040";
		public static final String OWNER_DEATILS_RESPONSIBILITY_USER_NAME = "Responsibility_00000000-0000-0000-0000-000000005040_User_UserName";
		public static final String OWNER_DEATILS_RESPONSIBILITY_FIRST_NAME = "Responsibility_00000000-0000-0000-0000-000000005040_User_FirstName";
		public static final String OWNER_DEATILS_RESPONSIBILITY_LAST_NAME = "Responsibility_00000000-0000-0000-0000-000000005040_User_LastName";
		public static final String OWNER_DEATILS_RESPONSIBILITY_USER_ID = "Responsibility_00000000-0000-0000-0000-000000005040_User_Id";

		public static final String DESCRIPTION_KEY = "StringAttribute_00000000-0000-0000-0000-000000003114";
		public static final String DESCRIPTION_VALUE = "StringAttribute_00000000-0000-0000-0000-000000003114_Value";

		public static final String DEFINATION_KEY = "StringAttribute_00000000-0000-0000-0000-000000000202";
		public static final String DEFINATION_VALUE = "StringAttribute_00000000-0000-0000-0000-000000000202_Value";

		public static final String SUBJECT_MATTER_EXPERT_RESPONSIBILITY_KEY = "Responsibility_00000000-0000-0000-0000-000000005035";
		public static final String SUBJECT_MATTER_EXPERT_RESPONSIBILITY_USER_NAME = "Responsibility_00000000-0000-0000-0000-000000005035_User_UserName";
		public static final String SUBJECT_MATTER_EXPERT_RESPONSIBILITY_FIRST_NAME = "Responsibility_00000000-0000-0000-0000-000000005035_User_FirstName";
		public static final String SUBJECT_MATTER_EXPERT_RESPONSIBILITY_LAST_NAME = "Responsibility_00000000-0000-0000-0000-000000005035_User_LastName";
		public static final String SUBJECT_MATTER_EXPERT_RESPONSIBILITY_USER_ID = "Responsibility_00000000-0000-0000-0000-000000005035_User_Id";

		public static final String TOTAL = "total";
		public static final String RESULTS = "results";
		public static final String ASSET_ID = "assetId";
		public static final String NAME = "name";
		public static final String TARGET = "target";
		public static final String SOURCE = "source";
		public static final String SORT_ORDER = "order";
		public static final String INCLUDES = "INCLUDES";

		public static final String ACTIVITY_TYPE = "activityType";
		public static final String TIMESTAMP = "timestamp";
		public static final String AFFECTED = "affected";
		public static final String DESCRIPTION = "description";
		public static final String USERID = "id";
		public static final String FIRSTNAME = "firstName";
		public static final String LASTNAME = "lastName";
		public static final String EMAILID = "emailAddress";
		public static final String USERNAME = "userName";
		public static final String PARENT="parent";
	}

	public class QueryConstants {
		private QueryConstants() {
		}

		public static final String GET_ALL_ASSETID_BY_COLLECTION_ID = "select asset_id from bookmarks where collection_id =:collectionId limit :limit";
	}
}