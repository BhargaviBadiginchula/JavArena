class  Light{
    private boolean isOn;

    public boolean turnOn(){
        isOn=true;
        return isOn;
    }
    public boolean turnOff(){
        isOn=false;
        return isOn;
    }
    public boolean isLightOn(){
        return isOn;
    }
}
class Ac{
    private int temperature;


    public void setTemp(int temp){
        this.temperature = temp;
    }

    public int getTemp(){
        return temperature;
    }
}


class Fan{
    private int speed;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }  
}

class Door{
    private boolean isOpen;
    public boolean lock(){
        return isOpen = false;
    }
    public boolean unlock(){
        return isOpen = true;
    }
    public boolean doorStatus(){
        return isOpen;
    }
}

class SmartHome{
    Light light;
    Ac ac;
    Fan fan;
    Door door;
    SmartHome(){
        this.light=new Light();
        this.fan=new Fan();
        this.ac=new Ac();
        this.door=new Door();
    }
    void activateHome(){
        light.turnOn();
        ac.setTemp(30);
        fan.setSpeed(4);
        door.unlock();
        System.out.println("House is activated");
    }
    void deactivateHome(){
        light.turnOff();
        ac.setTemp(0);
        fan.setSpeed(0);
        door.lock();
        System.out.println("House is deactivated");
    }
    void showStatus(){
        System.out.println("=".repeat(10)+"Home Status"+"=".repeat(10));
        System.out.println("is light on?" +light.isLightOn());
        System.out.println("Temperature "+ac.getTemp());
        System.out.println("fan speed "+fan.getSpeed());
        System.out.println("is door open? "+door.doorStatus());
    }
   public static void main(String [] args){
    SmartHome hm=new SmartHome();
    hm.activateHome();
    hm.showStatus();
    hm.deactivateHome();
    System.out.println();
    hm.showStatus();
   }
}