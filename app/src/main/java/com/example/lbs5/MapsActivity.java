package com.example.lbs5;
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
        LatLng bondowoso = new LatLng(-7.915337, 113.821382);
        LatLng pemda = new LatLng(-7.914549, 113.821794);
        mMap.addMarker(new MarkerOptions().position(pemda).title("Kantor PEMDA BONDOWOSO"));
        LatLng dprd = new LatLng(-7.910892, 113.849230);
        mMap.addMarker(new MarkerOptions().position(dprd).title("Kantor DPRD BONDOWOSO"));
        LatLng bkd = new LatLng(-7.913651, 113.840390);
        mMap.addMarker(new MarkerOptions().position(bkd).title("Badan Kepegawaian Daerah Bondowoso"));
        LatLng bkbp = new LatLng(-7.925666, 113.825625);
        mMap.addMarker(new MarkerOptions().position(bkbp).title("Badan Kesatuan Bangsa dan Politik Bondowoso"));
        LatLng bpkad = new LatLng(-7.921311, 113.820375);
        mMap.addMarker(new MarkerOptions().position(bpkad).title("Badan Pengelolaan Keuangan dan Aset Daerah Bondowoso"));
        LatLng dppk = new LatLng(-7.918616, 113.821821);
        mMap.addMarker(new MarkerOptions().position(dppk).title("Dinas Pendapatan dan Pengelolaan Keuangan Bondowoso"));
        LatLng dkps = new LatLng( -7.925920, 113.825769);
        mMap.addMarker(new MarkerOptions().position(dkps).title("Dinas Kependudukan dan Catatan Sipil Bondowoso"));
        LatLng dk = new LatLng(-7.915748, 113.829815);
        mMap.addMarker(new MarkerOptions().position(dk).title("Dinas Kesehatan Bondowoso"));
        LatLng dkpp = new LatLng(-7.928018, 113.815517);
        mMap.addMarker(new MarkerOptions().position(dkpp).title("Dinas Ketahanan Pangan dan Perikanan Bondowoso"));
        LatLng dkm = new LatLng(-7.924022, 113.824260);
        mMap.addMarker(new MarkerOptions().position(dkm).title("Dinas Komunikasi dan Informatika Bondowoso"));
        LatLng dppo = new LatLng(-7.918285, 113.819652);
        mMap.addMarker(new MarkerOptions().position(dppo).title("Dinas Pariwisata Pemuda dan Olahraga Bondowoso"));
        LatLng dpupr = new LatLng(-7.921376, 113.816893);
        mMap.addMarker(new MarkerOptions().position(dpupr).title("Dinas Pekerjaan Umum dan Penataan Ruang Bondowoso"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(bondowoso));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(13));
    }
}