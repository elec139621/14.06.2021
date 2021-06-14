package proj2;

public class Car {
	// attributes: 
	// int m_year
	// String brand
	// String model
	// long price
	// functionality:
	// turnOnEngine
	// turnOfEngine
	// drive
	// wash 
	// attributes
		public int m_year;
		public String m_brand;
		public String m_model;
		public long m_price;
		public boolean m_engineOn;
		
		public Car(int year, String brand, String model, long price, boolean engineOn)
		{
			m_year = year;
			m_brand = brand;
			m_model = model;
			m_price = price;
			m_engineOn = engineOn;
		}
		
		// functionality
		public void turnOnEngine() {
			System.out.println("".format("turning on my car engine %s %s size: %d", m_model, m_brand, m_year));
			this.m_engineOn = true;
		}
		public void turnOffEngine() {
			System.out.println("".format("turning off my car engine %s %s size: %d", m_model, m_brand, m_year));
			this.m_engineOn = false;
		}	
		public void drive() {
			System.out.println("".format("driving my car %s %s size: %d", m_model, m_brand, m_year));
		}
		public void wash() {
			System.out.println("".format("washing my car engine %s %s size: %d, price: %d", 
					m_model, m_brand, m_year, m_price));
		}	
		
		@Override
		public String toString() {
			return String.format("[Car]: %d %s %s %d engine-on? %s", m_year, m_model, m_brand, m_price, m_engineOn);
		}
}
