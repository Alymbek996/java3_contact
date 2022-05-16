package com.geektech.java3_contact;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class ContactViewHolder extends RecyclerView.ViewHolder {
    private TextView textContact;


    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);

        textContact = itemView.findViewById(R.id.contact);

    }
    public  void  bind(String contact){
        textContact.setText(contact);
    }

}
