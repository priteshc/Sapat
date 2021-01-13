package sapat.com.myapplication.application;

import android.app.Application;
import android.content.Context;
import android.os.Build;

import androidx.annotation.RequiresApi;


public class Myapp extends Application {

    private static Myapp instance;

    public static String BASE_URL = "https://ekeeda.com/gpapi/api/";

    public static final String TAG = Myapp.class.getSimpleName();


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

    }

    public static Myapp getInstance() {

        return instance;

    }


    public static Context getapContext() {


        return instance.getApplicationContext();
    }






}