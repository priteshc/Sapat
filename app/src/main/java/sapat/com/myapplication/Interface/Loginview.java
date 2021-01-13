package sapat.com.myapplication.Interface;


/**
 * Created by pritesh on 10/2/2017.
 */

public interface
Loginview {


    void showRErrorMeassage();

    void showRLoginSuccessMsg(String success, String regid, String email, String mobile, String msg, String name, String recode, String otp, String relateId);

    void showFLoginSuccessMsg(String success, String msg, String name, String otp);


    void showNetoworkError();

    void showprogress();

    void hideprogress();


}
