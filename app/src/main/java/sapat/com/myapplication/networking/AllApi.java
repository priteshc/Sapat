package sapat.com.myapplication.networking;


import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import sapat.com.myapplication.model.RegisterPojo;

/**
 * Created by pritesh on 3/27/2017.
 */

public interface AllApi {

    @FormUrlEncoded
    @POST("EKHome")
    Call<RegisterPojo> getHomeData(@Field("intRegID") String uname);

}
