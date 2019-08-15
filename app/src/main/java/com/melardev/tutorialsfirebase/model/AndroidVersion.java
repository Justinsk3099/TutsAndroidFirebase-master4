package com.melardev.tutorialsfirebase.model;

public class AndroidVersion {
    private String login;
    private String avatarURL;




    public  AndroidVersion(String login, String avatarURL, String htmlurl)
    {
        this.login = login;
        this.avatarURL = avatarURL;
        //this.htmlurl = htmlurl;

    }

    public AndroidVersion() {
    }

    public String getLogin() {
        return login;
    }



    public String getAvatarURL() {
        return avatarURL;
    }
}
