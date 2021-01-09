package Day3.Beans;

public class Patent {
	
	private int patentId;
	private String patentName;
	private String paperCode;
	public int getPatentId() {
		return patentId;
	}
	public void setPatentId(int patentId) {
		this.patentId = patentId;
	}
	public String getPatentName() {
		return patentName;
	}
	public void setPatentName(String patentName) {
		this.patentName = patentName;
	}
	public String getPaperCode() {
		return paperCode;
	}
	public void setPaperCode(String paperCode) {
		this.paperCode = paperCode;
	}
	public Patent(int patentId, String patentName, String paperCode) {
		super();
		this.patentId = patentId;
		this.patentName = patentName;
		this.paperCode = paperCode;
	}
	@Override
	public String toString() {
		return "Patent [patentId=" + patentId + ", patentName=" + patentName + ", paperCode=" + paperCode + "]";
	}
	
	public Patent() {
		
	}

}
