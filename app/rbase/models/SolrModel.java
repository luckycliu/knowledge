package rbase.models;

import java.io.IOException;

import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.common.SolrInputDocument;

import play.modules.rsolr.RSolr;

import com.google.code.morphia.Key;

public class SolrModel extends BaseModel {
	public SolrInputDocument getSolrDocument() {
		SolrInputDocument doc = new SolrInputDocument();
		String kind = this.getKind();
		doc.addField("id", kind + getId());
		doc.addField("id_ls", getId());
		doc.addField("class_name", kind);
		doc.addField("created_dt", this.created);
		doc.addField("modified_dt", this.modified);

		return doc;
	}

	@OnDelete
	public void removeIndex() throws SolrServerException, IOException {
		RSolr.i.solrServer.deleteById(this.getKind() + getId());
		RSolr.i.solrServer.commit();
	}

	@OnBatchDelete
	public static void onBatchDelete(MorphiaQuery q) throws SolrServerException, IOException {
		for (Key key : q.fetchKeys()) {
			RSolr.i.solrServer.deleteById(key.getKind() + "." + key.getId());
		}
		RSolr.i.solrServer.commit();
	}

}
