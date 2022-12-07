public class Employee {
    private String name;
    private String pps;

    public Employee(){
        setName(name);
        setPPS(pps);
    }

    public void setPPS(String pps) {
        if (pps.length() == 6) {
            this.pps = pps;
        } else {
            throw new IllegalArgumentException("Employee PPS should be 6 characters long");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 5 || name.length() <= 22){
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("Name provided is not valid");
        }
    }

    public String getPps() {
        return pps;
    }
}
