
//Spring is a dependency injection framework to make java application loosely coupled.
//Spring framework makes the easy development of JavaEE application

//dependency injection is design pattern
public class Ramu{

    Geeta obj; //so here Ramu class is dependent on Geeta
    //so spring ke pas ability hai ki woh Geeta class ke object create krke woh inject kr skta hai iss class mai
    // woh khud object create karega (hum manually nhi karenge) aur use hum yaha use kr skte hai
    public void doWork{

    }

}

//spring geeta ka object create krke khudse Ramu class mai inject kr skta hai ise hum bolte hai dependency injection
//humne khud object create nhi kiya, humne spring ko object banane dediya so ise kehte hai Inversion Of Control
class Geeta{
    public void doWork{

    }
}