package com.example.hospital;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.HashMap;
import java.util.Map;

public class detailsofsicks extends AppCompatActivity {
    private EditText name;
    private EditText birthday;
    private EditText sickpersonal;
    private EditText id;
    private Button save;
    private EditText adwiyahassaslaha;
    private TextView textView;
    private FirebaseFirestore db = FirebaseFirestore.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailsofsicks);
        connect();
        String etname,etbirthday, etsickpersonal, etid,etsave,etadwiyahassaslaha;
        //CHANGE TO STRING
        etname=name.getText().toString();
        etbirthday=birthday.getText().toString();
        etsickpersonal=sickpersonal.getText().toString();
        etid=id.getText().toString();
        etsave=save.getText().toString();
        etadwiyahassaslaha=adwiyahassaslaha.getText().toString();


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makesick makesick=new makesick(etname,etbirthday,etsickpersonal,etid,etadwiyahassaslaha);
                addtofire(makesick);

            }
        });
    }

    private void addtofire(makesick makesick) {
        // Create a new user with a first and last name
     /*   Map<makesick, Object> user = new HashMap<>();
        user.put(makesick,"details");

// Add a new document with a generated ID
        db.collection("users")
                .add(user)
                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        Log.d(TAG, "DocumentSnapshot added with ID: " + documentReference.getId());
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.w(TAG, "Error adding document", e);
                    }
                });
       /* if(makesick.getAdwiyahassaslaha()=="Moxipen"&&makesick.getAdwiyahassaslaha()=="DWC"){
            textView.setTextColor(Color.parseColor("#CD2F2F"));}

            else {
            textView.setTextColor(Color.parseColor("#C1B3B3"));
            }*/
        Map<makesick, Object> user = new HashMap<>();
        user.put(makesick,"details");
        db.collection("details").document("LA")
                .set(user)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Log.d(TAG, "DocumentSnapshot successfully written!");
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.w(TAG, "Error writing document", e);
                    }
                });
        }
    public void connect()
    {
        name=findViewById(R.id.namedetailssick);
        id=findViewById(R.id.iddetailssick);
        birthday=findViewById(R.id.datedetailssick);
        sickpersonal=findViewById(R.id.personaldetails);
        save=findViewById(R.id.savebtn);
        adwiyahassaslaha=findViewById(R.id.adwya_perdetails);
        textView=findViewById(R.id.textView2);
    }
}