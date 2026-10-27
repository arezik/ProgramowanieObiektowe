import java.util.Arrays;

void main() {
    ///Person
    Person myPerson = new Person("Jan", 28, "Kowalski@redeption.com");

    myPerson.setAge(200);
    myPerson.setEmail("blednyemail.com");

    ///Bank
    BankAccount myAccount = new BankAccount("Karol");
    myAccount.deposit(1200);
    myAccount.withdraw(90);
    System.out.println(myAccount.getBalance());
    myAccount.withdraw(1900);

    ///Exam
    int[] scores = {50, 60, 70};
    ExamResoults results = new ExamResoults(scores);
    scores[0] = 100;
    System.out.println(Arrays.toString(results.getPoints()));

    ///Product
    Product new1 = new Product("Kaszanka", 1.2);
    Product new2 = new Product("Karkówka", 7.50);

    System.out.println(Product.getNumberOfProducts());

    ///Calc
    System.out.println(StaticCalculator.add(123, 231));
    System.out.println(StaticCalculator.add(123.0, 231));
    System.out.println(StaticCalculator.add(123, 231, 3));

    ///Inicjujący

    InitializationDemo demo1 = new InitializationDemo();

    InitializationDemo demo2 = new InitializationDemo();

    ///USER
    User user = new User("admin", "admin123", 30);
    user.setPassword("123");
    user.setAge(150);
    user.showUser();

    ///Course

    Course javaCourse = new Course("Java", 25);
    Course pythonCourse = new Course("Biologia");
    Student student1 = new Student("Michał", 5541);
    Student student2 = new Student("Katarzyna", 5542);

    System.out.println("liczba kursów: " + Course.getNumberOfCreatedCourses());
    System.out.println("liczba studentów: " + Student.getNumberOfStudents());
}
