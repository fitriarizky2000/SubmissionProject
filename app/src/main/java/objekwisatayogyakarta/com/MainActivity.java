package objekwisatayogyakarta.com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvLinux;
    private ArrayList<ObjekWisata> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        rvLinux = findViewById(R.id.rv_owjogja);
        rvLinux .setHasFixedSize(true);

        list.addAll(DataObjekWisata.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvLinux.setLayoutManager(new LinearLayoutManager(this));
        ListDataAdapter listDataAdapter = new ListDataAdapter(list);
        rvLinux.setAdapter(listDataAdapter);

        listDataAdapter.setOnItemClickCallback(new ListDataAdapter.OnItemClickCallback(){
            @Override
            public void onItemClicked(ObjekWisata data) {
                showSelectedData(data);
            }
        });
    }

    public void showSelectedData (ObjekWisata objekWisata){
        Intent detail = new Intent(MainActivity.this, Detail.class);
        detail.putExtra(Detail.EXTRA_OBJEKWISATA, objekWisata.getName());
        detail.putExtra(Detail.EXTRA_LOCATION,objekWisata.getLocation());
        detail.putExtra(Detail.EXTRA_DETAIL, objekWisata.getDetail());
        detail.putExtra(Detail.EXTRA_IMG,objekWisata.getPhotos());
        startActivity(detail);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent about = new Intent(MainActivity.this, AboutMe.class);
        startActivity(about);
        return super.onOptionsItemSelected(item);
    }
}
