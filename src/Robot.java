public class Robot {
    private String name;
    public void setName (String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }
    public void greeting(){
        System.out.println("Hi, my name is "+getName());
    }

    Robot(String newName){
        setName(newName);
    }
}
