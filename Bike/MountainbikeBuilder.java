package Bike;

public class MountainbikeBuilder implements BikeBuilder {	
	
	
	
	
	 public AbstractBike buildBike(int tiresize, int tirewidth, int frameweight, String framecolor, int gearNumber) {
		AbstractFrame mtbFrame = buildFrame(frameweight, framecolor);
		AbstractTire mtbTire = buildTire(tiresize, tirewidth);
		AbstractGearShift mtbGear = buildGearShift(gearNumber);
		
		AbstractBike mtnBike = new Mountainbike(mtbFrame, mtbTire, mtbGear);
		return mtnBike;		
	}
	
	 private AbstractTire buildTire(int size, int width) {
		AbstractTire mtbTire = new MountainbikeTire(size, width);
		return mtbTire; 
    }
	
	 private AbstractFrame buildFrame(int weight, String color){            
        AbstractFrame mtbFrame = new MountainbikeFrame(weight, color);
        return mtbFrame;            
    }
	
	
	 private AbstractGearShift buildGearShift(int gearNumber) {
		AbstractGearShift mtbGear = new MountainbikeGear(gearNumber);
        return mtbGear;
	}


}
