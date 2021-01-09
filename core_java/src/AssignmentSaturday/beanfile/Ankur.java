package AssignmentSaturday.beanfile;

public class Ankur {
	
		private int num;
		private String name;
		private String time;
		
		public Ankur()
		{
			
		}
		
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getTime() {
			return time;
		}
		public void setTime(String time) {
			this.time = time;
		}
		public Ankur(int num, String name, String time) {
			super();
			this.num = num;
			this.name = name;
			this.time = time;
		}
		@Override
		public String toString() {
			return "Ankur [num=" + num + ", name=" + name + ", time=" + time + "]";
		}
		
		


}
