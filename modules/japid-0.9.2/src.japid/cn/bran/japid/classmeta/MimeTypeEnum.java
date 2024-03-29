package cn.bran.japid.classmeta;

public enum MimeTypeEnum {
	html("text/html; charset=utf-8"),
	txt("text/plain; charset=utf-8"),
	xml("text/xml; charset=utf-8"), // not using application/xml to be consistent with Play's way.
	json("application/json; charset=utf-8"),
	css("text/css; charset=utf-8"),
	js("application/x-javascript; charset=utf-8"),
	;
	
	public String header;
	
	MimeTypeEnum(String header) {
		this.header = header;
	}
	
	public static String getHeader(String ext) {
		if (ext.startsWith("."))
			ext = ext.substring(1);
		ext = ext.toLowerCase();
		try {
			MimeTypeEnum valueOf = MimeTypeEnum.valueOf(ext);
			return valueOf.header;// + "; charset=utf-8";
		} catch (Exception e) {
			return null;
		}
	}
}
