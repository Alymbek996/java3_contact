package com.geektech.java3_contact;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView ;
    private  ContactAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView =findViewById(R.id.recycler);
        ArrayList<String> contacts = new ArrayList<>();
        contacts.add("Эрнис" +
                "    " +
                "0703343664");
        contacts.add("Мунарбек" +
                "   " +
                "0507123110");
        contacts.add("Алтынай" +
                "   " +
                "0701003980");
        contacts.add("Шабдан" +
                "   " +
                "0500026027");
        contacts.add("Айдай" +
                "  " +
                "0700281671");
        contacts.add("Жаныл" +
                "  " +
                "0700374224");
        contacts.add("Бека" +
                "0705333005" +
                "  ");
        contacts.add("Мой номер" +
                "   " +
                "0700287707" +
                "  ");
        contacts.add("Мой номер 2" +
                "  " +
                "0505287707");
        contacts.add("Мой номер 2" +
                "  " +
                "0505287707");

        contacts.add("Мой номер 2" +
                "  " +
                "0505287707");
        contacts.add("Мой номер 2" +
                "  " +
                "0505287707");
        contacts.add("Мой номер 2" +
                "  " +
                "0505287707");
        contacts.add("Мой номер 2" +
                "  " +
                "0505287707");
        contacts.add("Мой номер 2" +
                "  " +
                "0505287707");
        contacts.add("Мой номер 2" +
                "  " +
                "0505287707");
        contacts.add("Мой номер 2" +
                "  " +
                "0505287707");
        contacts.add("Мой номер 2" +
                "  " +
                "0505287707");
        adapter= new ContactAdapter(contacts);
        recyclerView.setAdapter(adapter);
    }
}