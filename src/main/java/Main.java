import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.developers.HRManager;
import com.workintech.developers.JuniorDeveloper;
import com.workintech.developers.MidDeveloper;
import com.workintech.developers.SeniorDeveloper;
import com.workintech.pool.Cuboid;
import com.workintech.pool.Rectangle;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());


        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5, 10, 5);

        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());


        HRManager hrManager = new HRManager(1, "Alice", 7000);
        JuniorDeveloper juniorDev = new JuniorDeveloper(2, "Bob", 3000);
        MidDeveloper midDev = new MidDeveloper(3, "Charlie", 5000);
        SeniorDeveloper seniorDev = new SeniorDeveloper(4, "Diana", 8000);

        hrManager.work();
        System.out.println("HRManager salary: " + hrManager.getSalary());

        juniorDev.work();
        System.out.println("JuniorDeveloper salary: " + juniorDev.getSalary());

        midDev.work();
        System.out.println("MidDeveloper salary: " + midDev.getSalary());

        seniorDev.work();
        System.out.println("SeniorDeveloper salary: " + seniorDev.getSalary());

        hrManager.addEmployee(juniorDev);
        hrManager.addEmployee(midDev);
        hrManager.addEmployee(seniorDev);
    }

    }
