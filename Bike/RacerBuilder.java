package Bike;

public class RacerBuilder implements BikeBuilder {
	public AbstractBike buildBike(int tiresize, int tirewidth, int frameweight, String framecolor, int gearNumber) {
		AbstractFrame racerFrame = buildFrame(frameweight, framecolor);
		AbstractTire racerTire = buildTire(tiresize, tirewidth);
		AbstractGearShift racerGear = buildGearShift(gearNumber);
		
		AbstractBike racer = new Racer(racerFrame, racerTire, racerGear);
		return racer;		
	}
	
	private AbstractTire buildTire(int tiresize, int tirewidth) {
		AbstractTire racerTire = new RacerTire(tiresize, tirewidth);
		return racerTire; 
	}
	
	private AbstractFrame buildFrame(int weight, String color) {
		
		AbstractFrame racerFrame = new RacerFrame(weight, color);
        return racerFrame; 
		
	}
	private AbstractGearShift buildGearShift(int gearNumber) {
		AbstractGearShift racerGear = new RacerGear(gearNumber);
        return racerGear;
	}
}
