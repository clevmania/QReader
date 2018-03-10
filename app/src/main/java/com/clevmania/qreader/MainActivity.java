package com.clevmania.qreader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;
import android.widget.TextView;

import com.google.android.gms.vision.CameraSource;
import com.google.android.gms.vision.barcode.BarcodeDetector;

public class MainActivity extends AppCompatActivity {
    private SurfaceView surfaceView;
    private TextView renderedQrCode;
    private BarcodeDetector barcodeDetector;
    private CameraSource cameraSource;
    private static final int PermissionID = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
