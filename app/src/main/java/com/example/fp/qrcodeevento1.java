package com.example.fp;



import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

public class qrcodeevento1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_qrcodeevento1);




    }
    public void telaEvento(View view){

        Intent intent = new Intent(this, mainevento.class);
        startActivity(intent);
    }
    public void telaAjuda(View view){

        Intent intent = new Intent(this, telaAjuda.class);
        startActivity(intent);
    }
    public void telaQR(View view){

        Intent intent = new Intent(this, digiteevento.class);
        startActivity(intent);
    }

    public void onclick(View v){
        try {

            Intent intent = new Intent("com.google.zxing.client.android.SCAN");
            intent.putExtra("SCAN_MODE", "QR_CODE_MODE"); // "PRODUCT_MODE for bar codes

            startActivityForResult(intent, 0);

        } catch (Exception e) {

            Uri marketUri = Uri.parse("market://details?id=com.google.zxing.client.android");
            Intent marketIntent = new Intent(Intent.ACTION_VIEW,marketUri);
            startActivity(marketIntent);

        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 0) {

            if (resultCode == RESULT_OK) {
                String contents = data.getStringExtra("SCAN_RESULT");
                if(contents.equals("V")){
                    Intent intent = new Intent(this, qrcodeevento2.class);
                    startActivity(intent);
                }
                else{


                }
            }
            if(resultCode == RESULT_CANCELED){
                //handle cancel
            }
        }
    }

    public void telaLista(View view){

        Intent intent = new Intent(this, listaConv.class);
        startActivity(intent);
    }
    public void apareceNav(View view){
        NavigationView nav= (NavigationView) findViewById(R.id.menunavbar);
        ImageView sair_nav= (ImageView) findViewById(R.id.fundo);
        nav.setVisibility(View.VISIBLE);
        sair_nav.setVisibility(View.VISIBLE);
    }
    public void desapareceNav(View view){
        NavigationView nav= (NavigationView) findViewById(R.id.menunavbar);
        ImageView sair_nav= (ImageView) findViewById(R.id.fundo);
        nav.setVisibility(View.GONE);
        sair_nav.setVisibility(View.GONE);
    }
}
