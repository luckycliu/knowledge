package models.knowledge;

import java.util.List;

import models.users.User;
import rbase.models.SolrModel;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Reference;
import com.mongodb.util.UniqueList;

@Entity
public class KFragment extends SolrModel {
	public String url;
	public String title;
	public KType type = KType.PUBLIC;
	@Reference
	public User author;
	public String comment;
	public String content;
	public UniqueList<String> tags = new UniqueList<String>();

	public static List<KFragment> getTopPublicKFragment(User user, int limit) {
		// TODO will get result from solr
		return KFragment.filter("type", KType.PUBLIC).order("-created").limit(limit).asList();
	}
}
