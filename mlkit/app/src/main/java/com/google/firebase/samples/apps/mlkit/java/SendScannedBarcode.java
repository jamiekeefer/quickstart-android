package com.google.firebase.samples.apps.mlkit.java;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.samples.apps.mlkit.R;
import com.google.firebase.samples.apps.mlkit.java.barcodescanning.BarcodeScanningProcessor;

import java.nio.file.SecureDirectoryStream;

public class SendScannedBarcode extends AppCompatActivity {

    public static String scannedBarcode = "";
    public static final String EXTRA_MESSAGE = "com.google.firebase.samples.apps.mlkit.java.barcodescanning.MESSAGE";

    private Context mContext;
    private Activity mActivity;
    private View mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_scanned_barcode);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();

        String scannedValue = intent.getStringExtra(SendScannedBarcode.EXTRA_MESSAGE);

        TextView txtScannedValue = findViewById(R.id.txtScannedValue);
        txtScannedValue.setText(scannedValue);

        //Button btnSendScannedValue = findViewById(R.id.btnSendScannedValue);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        mContext = getApplicationContext();
//        mActivity = SendScannedBarcode.this;
//        mView = findViewById(android.R.id.content);
//        System.out.println("barcode value in SendScannedValue: " + scannedBarcode);
//        System.out.println("mContext: " + mContext + "mActivity: " + mActivity + "mView: " + mView);
    }



//    public void launchSendScannedBarcode(View view) {
//        Intent intent = new Intent(this, SendScannedBarcode.class);
//        String message = scannedBarcode;
//        intent.putExtra(EXTRA_MESSAGE, message);
//        startActivity(intent);
//    }



}
