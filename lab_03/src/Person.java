public class Person {
    private String name;
    private int age;
    private String email;

    public void setAge(int agee){
        if(agee < 0){
            System.out.println("Wiek nie może być mniejszy badz rowny 0");
        } else if (agee > 150) {
            System.out.println("Jestes za starym ciulem");
        } else {
            age = agee;
        }
    }
    public void setName(String name){
        if(name == null || name.isEmpty()){
            System.out.println("Zmienna nie moze byc pusta");
        }else{
            this.name = name;
        }
    }
    public void setEmail(String email){
        if(email.contains("@")){
            this.email = email;
        }else{
            System.out.println("Nie ma @");
        }
    }
    public Person(String name, int age, String email) {
        setName(name);
        setAge(age);
        setEmail(email);
    }
}
