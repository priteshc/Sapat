package sapat.com.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RegisterPojo {

    @SerializedName("status")
    @Expose
    private String status;

    @SerializedName("RegID")
    @Expose
    private String reSId;

    @SerializedName("Email")
    @Expose
    private String reEmail;

    @SerializedName("Mobile")
    @Expose
    private String reMobile;

    @SerializedName("Msg")
    @Expose
    private String reMsg;

    @SerializedName("message")
    @Expose
    private String reFMsg;

    @SerializedName("Username")
    @Expose
    private String reUser;

    @SerializedName("Refercode")
    @Expose
    private String reCode;

    @SerializedName("OTP")
    @Expose
    private String reOtp;
    @SerializedName("Id")
    @Expose
    private String reId;
    @SerializedName("RelatedId")
    @Expose
    private String relateID;

    public String getReId() {
        return reId;
    }

    public void setReId(String reId) {
        this.reId = reId;
    }

    public String getRelateID() {
        return relateID;
    }

    public void setRelateID(String relateID) {
        this.relateID = relateID;
    }

    public String getReFMsg() {
        return reFMsg;
    }

    public void setReFMsg(String reFMsg) {
        this.reFMsg = reFMsg;
    }

    public String getReOtp() {
        return reOtp;
    }

    public void setReOtp(String reOtp) {
        this.reOtp = reOtp;
    }

    public String getReCode() {
        return reCode;
    }

    public void setReCode(String reCode) {
        this.reCode = reCode;
    }

    public String getReUser() {
        return reUser;
    }

    public void setReUser(String reUser) {
        this.reUser = reUser;
    }

    public String getReMsg() {
        return reMsg;
    }

    public void setReMsg(String reMsg) {
        this.reMsg = reMsg;
    }

    public String getReEmail() {
        return reEmail;
    }

    public void setReEmail(String reEmail) {
        this.reEmail = reEmail;
    }

    public String getReMobile() {
        return reMobile;
    }

    public void setReMobile(String reMobile) {
        this.reMobile = reMobile;
    }

    public String getReSId() {
        return reSId;
    }

    public void setReSId(String reSId) {
        this.reSId = reSId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}