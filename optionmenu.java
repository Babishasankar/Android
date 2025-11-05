package com.example.optionmenu; 
import android.content.Intent; 
import android.os.Bundle; 
import com.google.android.material.snackbar.Snackbar; 
import androidx.appcompat.app.AppCompatActivity; 
import android.view.View; 
import androidx.navigation.NavController; 
import androidx.navigation.Navigation; 
import androidx.navigation.ui.AppBarConfiguration; 
import androidx.navigation.ui.NavigationUI; 
import com.example.optionmenu.databinding.ActivityMainBinding; 
import android.view.Menu; 
import android.view.MenuItem; 
public class MainActivity extends AppCompatActivity { 
    private AppBarConfiguration appBarConfiguration; 
    private ActivityMainBinding binding; 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        binding = ActivityMainBinding.inflate(getLayoutInflater()); 
        setContentView(binding.getRoot()); 
        setSupportActionBar(binding.toolbar); 
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main); 
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build(); 
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration); 
        binding.fab.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) { 
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG) 
                        .setAction("Action", null).show(); 
            } 
        }); 
    } 
    @Override 
    public boolean onCreateOptionsMenu(Menu menu) { 
        getMenuInflater().inflate(R.menu.menu_main, menu); 
        return true; 
    } 
    @Override 
    public boolean onOptionsItemSelected(MenuItem item) { 
        int id = item.getItemId(); 
        if (id == R.id.action_settings) 
        { 
            Intent intent=new Intent(MainActivity.this,Settings.class); 
            startActivity(intent); 
            return true; 
        } 
        else if(id==R.id.action_contact_us) 
        { 
            Intent intent=new Intent(MainActivity.this,ContactUs.class); 
            startActivity(intent); 
            return true; 
        } 
        else if(id==R.id.action_terms) 
        { 
            Intent intent=new Intent(MainActivity.this,Terms.class); 
            startActivity(intent); 
            return true; 
        } 
        else if(id==R.id.action_help) 
        { 
            Intent intent=new Intent(MainActivity.this,Help.class); 
            startActivity(intent); 
            return true; 
        } 
         else if (id==R.id.action_privacypolicy) 
        { 
            Intent intent=new Intent(MainActivity.this,PrivacyPolicy.class); 
            startActivity(intent); 
            return true; 
        } 
        return super.onOptionsItemSelected(item); 
    } 
    @Override 
    public boolean onSupportNavigateUp() { 
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main); 
        return NavigationUI.navigateUp(navController, appBarConfiguration) 
                || super.onSupportNavigateUp(); 
    } 
} 







PrivacyPolicy.java: 
package com.example.optionmenu; 
import androidx.appcompat.app.AppCompatActivity; 
import android.os.Bundle; 
public class PrivacyPolicy extends AppCompatActivity { 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_privacy_policy); 
    } 
} 







SecondFragment.java: 
package com.example.optionmenu; 
import android.os.Bundle; 
import android.view.LayoutInflater; 
import android.view.View; 
import android.view.ViewGroup; 
import androidx.annotation.NonNull; 
import androidx.fragment.app.Fragment; 
import androidx.navigation.fragment.NavHostFragment; 
import com.example.optionmenu.databinding.FragmentSecondBinding; 
public class SecondFragment extends Fragment { 
    private FragmentSecondBinding binding; 
    @Override 
    public View onCreateView( 
            LayoutInflater inflater, ViewGroup container, 
            Bundle savedInstanceState 
    )  
 { 
        binding = FragmentSecondBinding.inflate(inflater, container, false); 
        return binding.getRoot(); 
    } 
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) { 
        super.onViewCreated(view, savedInstanceState); 
        binding.buttonSecond.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) { 
                NavHostFragment.findNavController(SecondFragment.this) 
                        .navigate(R.id.action_SecondFragment_to_FirstFragment); 
            } 
        }); 
    } 
    @Override 
    public void onDestroyView() { 
        super.onDestroyView(); 
        binding = null; 
    }} 





 
Settings.java: 
package com.example.optionmenu; 
import androidx.appcompat.app.AppCompatActivity; 
import android.os.Bundle; 
public class Settings extends AppCompatActivity { 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_settings); 
    } 
} 




 
Terms.java: 
package com.example.optionmenu; 
import androidx.appcompat.app.AppCompatActivity; 
import android.os.Bundle; 
public class Terms extends AppCompatActivity { 




  
ContactUs.java: 
package com.example.optionmenu; 
import androidx.appcompat.app.AppCompatActivity; 
import android.os.Bundle; 
public class ContactUs extends AppCompatActivity { 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_contact_us); 
    } 
} 





FirstFragment.java: 
package com.example.optionmenu; 
import android.os.Bundle; 
import android.view.LayoutInflater; 
import android.view.View; 
import android.view.ViewGroup; 
import androidx.annotation.NonNull; 
import androidx.fragment.app.Fragment; 
import androidx.navigation.fragment.NavHostFragment; 
import com.example.optionmenu.databinding.FragmentFirstBinding; 
public class FirstFragment extends Fragment { 
    private FragmentFirstBinding binding; 
    @Override 
    public View onCreateView( 
            LayoutInflater inflater, ViewGroup container, 
            Bundle savedInstanceState 
    ) { 
 
        binding = FragmentFirstBinding.inflate(inflater, container, false); 
        return binding.getRoot(); 
 
    } 
 
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) { 
        super.onViewCreated(view, savedInstanceState); 
 
        binding.buttonFirst.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) { 
                NavHostFragment.findNavController(FirstFragment.this) 
                        .navigate(R.id.action_FirstFragment_to_SecondFragment); 
            } 
        }); 
    } 
    @Override 
    public void onDestroyView() { 
        super.onDestroyView(); 
        binding = null; 
    } 
}  
} 
@Override 
protected void onCreate(Bundle savedInstanceState) { 
super.onCreate(savedInstanceState); 
setContentView(R.layout.activity_terms); 
} 




Help.java: 
package com.example.optionmenu; 
import androidx.appcompat.app.AppCompatActivity; 
import android.os.Bundle; 
public class Help extends AppCompatActivity { 
@Override 
protected void onCreate(Bundle savedInstanceState) { 
super.onCreate(savedInstanceState); 
setContentView(R.layout.activity_help); 
} 
} 
