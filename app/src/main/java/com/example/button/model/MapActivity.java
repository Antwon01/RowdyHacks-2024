package com.example.button.model;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.annotation.NonNull;


import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.example.button.R;


public class MapActivity extends AppCompatActivity implements OnMapReadyCallback {
    private GoogleMap mMap;

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;

        // restricts where our camera can go / creates our camera's boundaries
        LatLngBounds restrictedBounds = new LatLngBounds(
                new LatLng(29.438295, -98.507893),
                new LatLng(29.416667, -98.486556)
        );

        // puts our boundaries on our google map
        googleMap.setLatLngBoundsForCameraTarget(restrictedBounds);

        // creates a location pinpoint of 'ourself'
        LatLng sydney = new LatLng(29.421956, -98.496659);

        // zooms in and positions the camera
        float zoomLevel = 16.0f;
        CameraPosition cameraPosition = new CameraPosition.Builder()
                .target(sydney)
                .zoom(zoomLevel)
                .build();

        // actually sets the camera position on the map
        googleMap.moveCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));

        // Add a marker at 'UTSA' and move the camera
        MarkerOptions options = new MarkerOptions().position(sydney).title("UTSA");
        options.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE));
        googleMap.addMarker(options);

        // Zoom in and out on the map
        googleMap.getUiSettings().setZoomControlsEnabled(true);
    }
}