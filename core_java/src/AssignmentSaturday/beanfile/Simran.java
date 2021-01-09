package AssignmentSaturday.beanfile;

public class Simran {
	
	
	    private int patientId;
	    private String patientName;
	    private String sufferingDisease;
	    
	    public Simran() {
	    	
	    }
	    
		public int getPatientId() {
			return patientId;
		}
		public void setPatientId(int patientId) {
			this.patientId = patientId;
		}
		public String getPatientName() {
			return patientName;
		}
		public void setPatientName(String patientName) {
			this.patientName = patientName;
		}
		public String getSufferingDisease() {
			return sufferingDisease;
		}
		public void setSufferingDisease(String sufferingDisease) {
			this.sufferingDisease = sufferingDisease;
		}
		public Simran(int patientId, String patientName, String sufferingDisease) {
			super();
			this.patientId = patientId;
			this.patientName = patientName;
			this.sufferingDisease = sufferingDisease;
		}
		@Override
		public String toString() {
			return "Simran [patientId=" + patientId + ", patientName=" + patientName + ", sufferingDisease="
					+ sufferingDisease + "]";
		}

	   

}
