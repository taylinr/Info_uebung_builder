package Bike;

public interface BikeBuilder {
	AbstractBike buildBike(int tiresize, int tirewidth, int frameweight, String framecolor, int gearNumber);
}
