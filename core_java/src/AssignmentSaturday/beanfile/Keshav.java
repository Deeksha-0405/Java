package AssignmentSaturday.beanfile;

public class Keshav {
	
		private int jerseyno ;
		private String name;
		
		public Keshav()
		{
			
		}

		public int getJerseyno() {
			return jerseyno;
		}

		public void setJerseyno(int jerseyno) {
			this.jerseyno = jerseyno;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Keshav(int jerseyno, String name) {
			super();
			this.jerseyno = jerseyno;
			this.name = name;
		}

		@Override
		public String toString() {
			return "Keshav [jerseyno=" + jerseyno + ", name=" + name + "]";
		}
		
		
}
