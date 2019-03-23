package com.ekosp.filedownload;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Streaming;

public interface RetrofitInterface {

//    @GET("files/Node-Android-Chat.zip")
    @GET("wp-content/uploads/2017/02/file_example_XLS_1000.xls")
    @Streaming
    Call<ResponseBody> downloadFile();
}
