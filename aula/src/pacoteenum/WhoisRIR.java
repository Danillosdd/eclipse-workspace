package pacoteenum;

public enum WhoisRIR {
	
	ARIN("whois.arin.net"),
	RIPE("whois.ripe.net"),
	APNIC("whois.apnic.net"),
	AFRINIC("whois.lacnic.net"),
	JPNIC("whois.nic.ad.jp"),
	KRNIC("whois.nic.or.kr"),
	CNNIC("ipwhois.cnnic.cn"),
	UNKNOWN("");

	private String url;
	
	private WhoisRIR(String url) {
		
		this.url = url;
	}
	
	public String geturl() {
		
		return url;
	}
}
