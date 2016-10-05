
public class Automobile {
double mpg;
double gal;
public Automobile (double mileage) {
	mpg = mileage;
	gal = 0;
}
public void fillUp (double addedFuel) {
	gal += addedFuel;
}
public void takeTrip (double dist) {
	gal = gal - (dist/mpg);
}
public double reportFuel () {
	return gal;
}
}
