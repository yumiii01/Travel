package com.travel.travel;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText erWords;
    private Button btSearch;
    private FrameLayout fl;
    private String url="https://apis.juhe.cn/fapigx/scenic/query";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initView();
        btSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!TextUtils.isEmpty(erWords.getText().toString())){
                    initData(erWords.getText().toString());
                }else {
                    Toast.makeText(MainActivity.this,"请输入景点关键词",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void initData(String  word) {
        String str = null;  //转码
        try {

            OkGo.<String>get(url).params("key","3c51b9012beb986f382ff88d0e80aef1").params("word",word).execute(new StringCallback() {
                @Override
                public void onSuccess(Response<String> response) {
                    String result = response.body();
                    try {
                        if (TextUtils.isEmpty(result)) {
                            return;
                        }
                        GetTravelSuccess resultBean = new Gson().fromJson(result, GetTravelSuccess.class);
                         if (resultBean.getError_code()==0){
                             List<GetTravelSuccess.ResultBean.ListBean> list = resultBean.getResult().getList();
                             if (list.size()>0){
                                 FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                                 transaction.replace(R.id.fl, new ItemFragment(list));
                                 transaction.commitAllowingStateLoss();
                             }else {
                                 Toast.makeText(MainActivity.this,"无此景区",Toast.LENGTH_SHORT).show();
                             }

                         }else {
                             Toast.makeText(MainActivity.this,resultBean.getReason(),Toast.LENGTH_SHORT).show();
                         }



                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void initView() {
        erWords = (EditText) findViewById(R.id.er_words);
        btSearch = (Button) findViewById(R.id.bt_search);
        fl = (FrameLayout) findViewById(R.id.fl);
    }
}