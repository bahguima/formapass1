package com.example.fp;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;


public class listaConv extends AppCompatActivity implements ClickRecyclerView_Interface {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    RecyclerTesteAdapter adapter;
    private List<convidados> convidadosListas = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_conv);

        setaRecyclerView();
        convidados a1 = new convidados("Max Brandão Neiva",true);
        convidados a2 = new convidados("Eurico Cascais Galvão",true);
        convidados a3 = new convidados("Chloe Fiúza ",true);
        convidados a4 = new convidados("Vitor Eiró Robalinho",false);
        convidados a5 = new convidados("Rita Monte",true);
        convidados a11 = new convidados("Max Brandão Neiva",true);
        convidados a12 = new convidados("Eurico Cascais Galvão",true);
        convidados a13 = new convidados("Chloe Fiúza ",true);
        convidados a14 = new convidados("Vitor Eiró Robalinho",false);
        convidados a15 = new convidados("Rita Monte",true);

        convidados a21 = new convidados("Max Brandão Neiva",true);
        convidados a22 = new convidados("Eurico Cascais Galvão",true);
        convidados a23 = new convidados("Chloe Fiúza ",true);
        convidados a24 = new convidados("Vitor Eiró Robalinho",false);
        convidados a25 = new convidados("Rita Monte",true);
        convidados a31 = new convidados("Max Brandão Neiva",true);
        convidados a32 = new convidados("Eurico Cascais Galvão",true);
        convidados a33 = new convidados("Chloe Fiúza ",true);
        convidados a34 = new convidados("Vitor Eiró Robalinho",false);
        convidados a35 = new convidados("Rita Monte",true);
        convidadosListas.add(a1);
        convidadosListas.add(a2);
        convidadosListas.add(a3);
        convidadosListas.add(a4);
        convidadosListas.add(a5);
        convidadosListas.add(a11);
        convidadosListas.add(a12);
        convidadosListas.add(a13);
        convidadosListas.add(a14);
        convidadosListas.add(a15);
        convidadosListas.add(a21);
        convidadosListas.add(a22);
        convidadosListas.add(a23);
        convidadosListas.add(a24);
        convidadosListas.add(a25);
        convidadosListas.add(a31);
        convidadosListas.add(a32);
        convidadosListas.add(a33);
        convidadosListas.add(a34);
        convidadosListas.add(a35);

    }

    public void setaRecyclerView(){

        //Aqui é instanciado o Recyclerview
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        adapter = new RecyclerTesteAdapter(this, convidadosListas, this);
        mRecyclerView.setAdapter(adapter);
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



    /**
     * Aqui é o método onde trata o clique em um item da lista
     */
    @Override
    public void onCustomClick(Object object) {

    }

    /**
     * Chama os listeners para os botões
     */
}
