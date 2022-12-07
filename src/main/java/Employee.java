public class Employee {
    private String name;
    private long pps;

    public Employee(){
        setName(name);
    }

    public void setName(String name) {
        if(name.length() >= 5 || name.length() <= 22){
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("Name provided is not valid");
        }
    }

    public String getName() {
        return name;
    }
}
