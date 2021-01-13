package sapat.com.myapplication.presenter;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import sapat.com.myapplication.Interface.Loginview;
import sapat.com.myapplication.model.RegisterPojo;
import sapat.com.myapplication.networking.RetrofitBuild;


/**
 * Created by pritesh on 10/2/2017.
 */

public class LoginPresenter {


    private Loginview loginview;

    private RetrofitBuild retrofitBuild;


    public LoginPresenter(Loginview loginview) {

        this.loginview = loginview;

        retrofitBuild = new RetrofitBuild();

    }


    public void getReg(String name){

        loginview.showprogress();

        Call<RegisterPojo> pojoCall = retrofitBuild.allApi().getHomeData(name);

        pojoCall.enqueue(new Callback<RegisterPojo>() {
            @Override
            public void onResponse(Call<RegisterPojo> call, Response<RegisterPojo> response) {

                loginview.hideprogress();


                if(response.code()== 200) {

                    if (response.body().getStatus().equals("success")) {

                        loginview.showRLoginSuccessMsg(response.body().getStatus(), response.body().getReSId(), response.body().getReEmail(), response.body().getReMobile(),  response.body().getReMsg(), response.body().getReUser(), response.body().getReCode(),"",response.body().getRelateID());

                    } else {

                        loginview.showFLoginSuccessMsg(response.body().getStatus(), response.body().getReMsg(), response.body().getReUser(),"");

                    }

                }
                else {

                    loginview.showRErrorMeassage();
                }

            }

            @Override
            public void onFailure(Call<RegisterPojo> call, Throwable t) {

                loginview.hideprogress();


                loginview.showNetoworkError();

            }
        });


    }





}
