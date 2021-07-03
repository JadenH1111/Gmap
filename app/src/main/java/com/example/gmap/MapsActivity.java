package com.example.gmap;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng alwaysBlue = new LatLng(37.35825, 127.10530);
        LatLng myHouse = new LatLng(37.359064, 127.107046);
        LatLng thePro = new LatLng(37.35310472103885, 127.10497196856048);
        LatLng glory = new LatLng(37.403887956786484, 127.12143312623463);
        LatLng Example1 = new LatLng(32.65050, -85.38065);
        mMap.addMarker(new MarkerOptions().position(alwaysBlue).title("늘푸른 초등학교 입니다"));
        mMap. addMarker(new MarkerOptions().position(myHouse).title("미켈란셰르빌 입니다"));
        mMap. addMarker(new MarkerOptions().position(thePro).title("코오롱더프라우 입니다"));
        mMap. addMarker(new MarkerOptions().position(glory).title("아름마을 태영아파트 입니다"));
        mMap.addMarker(new MarkerOptions().position(Example1).title("우리집 IP 주소"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(alwaysBlue));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Example1, 15));
    }
}