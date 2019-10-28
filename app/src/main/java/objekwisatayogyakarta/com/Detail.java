package objekwisatayogyakarta.com;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {
    public static final String EXTRA_IMG= "extra_img";
    public static final String EXTRA_OBJEKWISATA= "extra_objekwisata";
    public static final String EXTRA_LOCATION = "extra_location";
    public static final String EXTRA_DETAIL= "extra_detail";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView Photo;
        TextView tvObjekWisata, tvLocation, tvDetail;

        Photo = findViewById(R.id.img_wisata);
        tvObjekWisata = findViewById(R.id.tv_name);
        tvLocation = findViewById(R.id.tv_location);
        tvDetail = findViewById(R.id.tv_detail);

        int photo = getIntent().getIntExtra(EXTRA_IMG, 0);
        String nama = getIntent().getStringExtra(EXTRA_OBJEKWISATA),
                rilis = getIntent().getStringExtra(EXTRA_LOCATION),
                pengertian = getIntent().getStringExtra(EXTRA_DETAIL);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(),photo);
        Photo.setImageBitmap(bmp);
        tvObjekWisata.setText(nama);
        tvLocation.setText(rilis);
        tvDetail.setText(pengertian);

    }

}
