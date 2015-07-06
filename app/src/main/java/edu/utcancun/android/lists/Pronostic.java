package edu.utcancun.android.lists;

/**
 * Created by carloschan on 05/07/15.
 */
public class Pronostic {
    private String day;
    private String status;
    private String temperatures;
    private int icon;

    public Pronostic(String day, String status,String temperatures, int icon){
        this.day=day;
        this.status=status;
        this.temperatures=temperatures;
        this.icon=icon;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTemperatures() {
        return temperatures;
    }

    public void setTemperatures(String temperatures) {
        this.temperatures = temperatures;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
