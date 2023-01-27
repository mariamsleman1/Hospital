package com.example.hospital;

import android.widget.Button;
import android.widget.EditText;

public class makesick {
    private String name;
    private String birthday;
    private String sickpersonal;
    private String id;
    private String adwiyahassaslaha;




    public makesick(String name, String birthday, String sickpersonal, String id, String adwiyahassaslaha) {
        this.name = name;
        this.birthday = birthday;
        this.sickpersonal = sickpersonal;
        this.id = id;
        this.adwiyahassaslaha = adwiyahassaslaha;
    }

    public String getAdwiyahassaslaha() {
        return adwiyahassaslaha;
    }

    public void setAdwiyahassaslaha(String adwiyahassaslaha) {
        this.adwiyahassaslaha = adwiyahassaslaha;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSickpersonal() {
        return sickpersonal;
    }

    public void setSickpersonal(String sickpersonal) {
        this.sickpersonal = sickpersonal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
