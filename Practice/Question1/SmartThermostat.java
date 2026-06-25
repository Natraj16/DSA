package Practice.Question1;

public class SmartThermostat {
    private double _currentTemp;

    public void setTemp(double newTemp) {
        if(newTemp>=10 && newTemp<=30){
            _currentTemp=newTemp;
            System.out.println("the new temparature is:"+_currentTemp);
        }
        else{
            System.out.println("Invalid Temp! Must be between 10 and 30");
        }


    }

    public double getTemp(){
        return _currentTemp;
    }

    public SmartThermostat() {
        this._currentTemp = 20;

    }

    public void increaseTemp(){
        setTemp(this._currentTemp+=1);
    }

    public void decreaseTemp(){
       setTemp(this._currentTemp-=1);
    }
}
