package com.bw.utils.livedata_update_utils;

/**
 * @ClassName: ApiResponse$
 * @Description: java类作用描述
 * @Author: author
 * @CreateDate: 2022/5/24$
 * @UpdateUser: 张子珈
 * @UpdateRemark: 更新内容
 * @Version: 1.0
 */
public class ApiResponse<T> {

    public static final int CODE_SUCCESS = 0;
    public static final int CODE_ERROR = 1;

    public int code; //状态码
    public String msg; //信息
    public T data; //数据

    public ApiResponse(int code, String msg) {
        this.code = code;
        this.msg = msg;
        this.data = null;
    }

    public ApiResponse(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static int getCodeSuccess() {
        return CODE_SUCCESS;
    }

    public static int getCodeError() {
        return CODE_ERROR;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }




}
