package practice1;

class Bike {
    public void speed() {
        System.out.println("60km/hr");
    }
}
class Honda extends Bike {
    public void color() {
        System.out.println("Black");
    }
}
class Pulsar extends Bike {
    public void speed() {
        System.out.println("90km/hr");
    }
    public void color() {
        System.out.println("Red");
    }
}
class tvs extends Bike{
	public void color() {
	System.out.println("Gray");
	}
}
public class Runtimepoly {
    public static void main(String[] args) {
        Honda hh = new Honda();        hh.color();        hh.speed();
        Pulsar pu = new Pulsar();    pu.color();            pu.speed();
    }
}
