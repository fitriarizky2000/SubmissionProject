package objekwisatayogyakarta.com;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListDataAdapter extends RecyclerView.Adapter<ListDataAdapter.ListViewHolder> {
    private ArrayList<ObjekWisata> listObjekWisata;

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListDataAdapter(ArrayList<ObjekWisata> list){
        this.listObjekWisata = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_objekwisata, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        ObjekWisata ow = listObjekWisata.get(position);
        holder.tvOW.setText(ow.getName());
        holder.tvDetail.setText(ow.getDetail());
        Glide.with(holder.itemView.getContext())
                .load(ow.getPhotos())
                .apply(new RequestOptions().override(60,55))
                .into(holder.Photo);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listObjekWisata.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listObjekWisata.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tvOW, tvDetail;
        ImageView Photo;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvOW = itemView.findViewById(R.id.tv_name);
            tvDetail = itemView.findViewById(R.id.tv_detail);
            Photo = itemView.findViewById(R.id.img_wisata);
        }
    }
    public interface OnItemClickCallback {
        void onItemClicked(ObjekWisata data);
    }
}
