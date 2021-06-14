package proj2;

public class MobilePhone {

	// attributes
	public float m_size;
	public String m_vendor;
	public String m_color;

	// functionality
	public void turnOn() {
		System.out.println("".format("turning on my phone %s %s size: %f", m_vendor, m_color, m_size));
	}
	public void turnOff() {
		System.out.println("".format("turning off my phone %s %s", m_vendor, m_color));
	}	
	public void ring() {
		System.out.println("".format("calling my friend from my phone %s %s", m_vendor, m_color));
	}		
}
