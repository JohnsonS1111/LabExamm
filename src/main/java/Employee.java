public class Employee {
    private String name;
    private String pps;

    public Employee(){
        setPPS(pps);
    }

    public void setPPS(String pps) {
        if(pps.length() == 6){
            this.pps = pps;
        }
        else{
            throw new IllegalArgumentException("Employee PPS should be 6 characters long");
        }
    }
}
