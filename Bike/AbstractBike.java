package Bike;

public abstract class AbstractBike {
	private AbstractFrame frame;
	private AbstractTire tire;
	private AbstractGearShift gear;
	
	public AbstractBike(AbstractFrame frame, AbstractTire tire, AbstractGearShift gear) {
		this.frame = frame;
		this.tire = tire;
		this.gear = gear;
	}
	
}
