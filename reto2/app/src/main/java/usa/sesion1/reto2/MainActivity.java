package usa.sesion1.reto2;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import usa.sesion1.reto2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain.toolbar);
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
    public void seleccion (View view){
        switch (view.getId()){
            case R.id.btnp1:
            Toast.makeText(this, "Bandeja Separarador Hilux:AGREGADO", Toast.LENGTH_SHORT).show();
            break;
            case R.id.btnp2:
                Toast.makeText(this, "Carburador Standar ZCL-154:AGREGADO", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnp3:
                Toast.makeText(this, "Empaquetadura L525 MAZDA:AGREGADO", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnp4:
                Toast.makeText(this, "Recambio sistema electrico FORD:AGREGADO", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnp5:
                Toast.makeText(this, "STOP TOYOTA MADEIN JAPAN:AGREGADO", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btns1:
                Toast.makeText(this, "Alineacion y Balanceo $50.000", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btns2:
                Toast.makeText(this, "Pintura Especializada $1.000.000", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btns3:
                Toast.makeText(this, "Capacitacion Mantenimiento Automotriz $600.000", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btns4:
                Toast.makeText(this, "Despinchada en taller $20.000", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btns5:
                Toast.makeText(this, "Despinchada Domicilio Día $30.000", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}