public class CommonSymptoms {

    private float temp;   //temperature
    private boolean dryCough;
    private boolean tiredness;

    public CommonSymptoms()
    {
        temp=0;
        dryCough=false;
        tiredness=false;
    }
    public CommonSymptoms( float temp, boolean dryCough, boolean tiredness) {

        this.temp = temp;
        this.dryCough = dryCough;
        this.tiredness = tiredness;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {

        if(temp>=98.5&&temp<=108)
        {
            this.temp = temp;

        }
        else
        {
            temp=-1;
        }
                }

    public boolean isDryCough() {
        return dryCough;
    }

    public void setDryCough(boolean dryCough) {
        this.dryCough = dryCough;
    }

    public boolean isTiredness() {
        return tiredness;
    }

    public void setTiredness(boolean tiredness) {
        this.tiredness = tiredness;
    }

    public int CommonSymptomsTruth()
    {
       if(isDryCough() == true && getTemp() > 98.6 && isTiredness() == true)
       {
           return 4;
       }
      else if(isDryCough() == true && getTemp() > 98.6 && isTiredness() == false)
       {
           return 3;
       }
       else if(getTemp() > 98.6 && isDryCough() == false && isTiredness() == false)
       {
           return 2;
       }
       else
       {
           return 1;
       }

    }

    @Override
    public String toString() {
        return "CommonSymptoms{" +
                ", temp=" + temp +
                ", dryCough=" + dryCough +
                ", tiredness=" + tiredness +
                '}';
    }
}
